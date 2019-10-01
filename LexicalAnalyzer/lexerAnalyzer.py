import re
import token

class Lexer(object):
    """ A simple regex-based lexer/tokenizer.
    """
    def __init__(self, rules):
        """ Create a lexer.

            rules:
                A list of rules. Each rule is a `regex, type`
                pair, where `regex` is the regular expression used
                to recognize the token and `type` is the type
                of the token to return when it's recognized.

            skip_whitespace:
                If True, whitespace (\s+) will be skipped and not
                reported by the lexer. Otherwise, you have to
                specify your rules for whitespace, or it will be
                flagged as an error.
        """
        self.rules = []
        for regex, type in rules:
            self.rules.append((re.compile(regex), type))
        self.re_ws_skip = re.compile('\S')


    def input(self, buf, row):
        """ Initialize the lexer with a buffer as input.
        """
        self.buf = buf
        self.col = 0
        self.row = row

    def token(self):
        """ Return the next token (a Token object) found in the
            input buffer. None is returned if the end of the
            buffer was reached.
            In case of a lexing error (the current chunk of the
            buffer matches no rule), a LexerError is raised with
            the position of the error.
        """
        if self.col >= len(self.buf):
            return None
        
        m = self.re_ws_skip.search(self.buf, self.col)
        if m:
            self.col = m.start()
        else:
            return None

        for regex, type in self.rules:
            m = regex.match(self.buf, self.col)
            if m:
                tok = token.Token(type, m.group(), self.row, self.col+1)
                self.col = m.end()
                if type == "tk_comment":
                    return None
                return tok

        # if we're here, no rule matched
        raise Exception("LexerError at row %s, col %s" % (self.row,self.col+1))

    def tokens(self):
        """ Returns an iterator to the tokens found in the buffer.
        """
        while 1:
            tok = self.token()
            if tok is None: break
            yield tok
