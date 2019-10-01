import re
import token

class LexerAnalizer(object):
    """ Clase que genera un analizador lexico basado en expresiones regulares
    """
    def __init__(self, rules):
        """ 

            rules:
                arreglo de 2-tupla () de reglas donde cada regla es una expresión regular que define
                un conjunto de tokens y la llave es el tipo de cada token
            
        """
        self.rules = []
        for regex, type in rules:
            self.rules.append((re.compile(regex), type))
        self.re_ws_skip = re.compile('\S')


    def input(self, buf, row):
        """ Inicializa el analizador con un buffer que consiste en una linea del archivo
            de entrada
        """
        self.buf = buf
        self.col = 0
        self.row = row

    def token(self):
        """Retorna el siguiente token leido en el buffer de entrada, en caso de error
           lexico el analizador aborta la lectura y manda un Exception indicando la fila 
           y la columna donde esta el error
        
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
        """ Retorna una iteracion con los tokens en el buffer
        """
        while 1:
            tok = self.token()
            if tok is None: break
            yield tok
