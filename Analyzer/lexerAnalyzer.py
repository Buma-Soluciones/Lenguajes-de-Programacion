""" Made by Juan Sebastian Becerra 
    Juan Sebastian Peña
    Implementacion basada en el codigo de Dominio publico de Eli Bendersky
    https://github.com/eliben/bobscheme/blob/master/bob/lexer.py
"""
import re
import token
import sys

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
        
        match = self.re_ws_skip.search(self.buf, self.col)
        if match:
            self.col = match.start()
        else:
            return None

        for regex, type in self.rules:
            match = regex.match(self.buf, self.col)
            if match:
                tok = token.Token(type, match.group(), self.row, self.col+1)
                self.col = match.end()
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


rules = [
        ("\\b(global)\\b",          'global'),
        ("\\b(int)\\b",             'int'),
        ("\\b(getarg)\\b",          'getarg'),
        ("\\b(write)\\b",           'write'),
        ("\\b(writes)\\b",           'writes'),
        ("\\b(if)\\b",              'if'),
        ("\\b(fi)\\b",              'fi'),
        ("\\b(P)\\b",             'P'),
        ("\\b(V)\\b",             'V'),
        ("\\b(af)\\b",             'af'),
        ("\\b(and)\\b",             'and'),
        ("\\b(any)\\b",             'any'),
        ("\\b(begin)\\b",             'begin'),
        ("\\b(body)\\b",            'body'),
        ("\\b(bool)\\b",             'bool'),
        ("\\b(by)\\b",             'by'),
        ("\\b(call)\\b",             'call'),
        ("\\b(cap)\\b",             'cap'),
        ("\\b(char)\\b",             'char'),
        ("\\b(const)\\b",             'const'),
        ("\\b(co)\\b",             'co'),
        ("\\b(create)\\b",             'create'),
        ("\\b(destroy)\\b",             'destroy'),
        ("\\b(downto)\\b",             'downto'),
        ("\\b(do)\\b",             'do'),
        ("\\b(else)\\b",             'else'),
        ("\\b(end)\\b",             'end'),
        ("\\b(enum)\\b",             'enum'),
        ("\\b(exit)\\b",             'exit'),
        ("\\b(extend)\\b",             'extend'),
        ("\\b(external)\\b",             'external'),
        ("\\b(fa)\\b",          'fa'),
        ("\\b(file)\\b",          'file'),
        ("\\b(final)\\b",        'final'),
        ("\\b(forward)\\b",        'forward'),
        ("\\b(high)\\b",        'high'),
        ("\\b(import)\\b",        'import'),
        ("\\b(initial)\\b",        'initial'),
        ("\\b(in)\\b",        'in'),
        ("\\b(low)\\b",        'low'),
        ("\\b(mod)\\b",             'mod'),
        ("\\b(new)\\b",     'new'),
        ("\\b(next)\\b",     'next'),
        ("\\b(ni)\\b",     'ni'),
        ("\\b(not)\\b",     'not'),
        ("\\b(oc)\\b",     'oc'),
        ("\\b(od)\\b",     'od'),
        ("\\b(on)\\b",     'on'),
        ("\\b(optype)\\b",     'optype'),
        ("\\b(op)\\b",     'op'),
        ("\\b(or)\\b",     'or'),
        ("\\b(procedure)\\b",     'procedure'),
        ("\\b(process)\\b",     'process'),
        ("\\b(proc)\\b",     'proc'),
        ("\\b(ptr)\\b",     'ptr'),
        ("\\b(real)\\b",     'real'),
        ("\\b(read)\\b",     'read'),
        ("\\b(receive)\\b",     'receive'),
        ("\\b(rec)\\b",     'rec'),
        ("\\b(ref)\\b",     'ref'),
        ("\\b(reply)\\b",     'reply'),
        ("\\b(resource)\\b",     'resource'),
        ("\\b(res)\\b",     'res'),
        ("\\b(return)\\b",     'return'),
        ("\\b(returns)\\b",     'returns'),
        ("\\b(sem)\\b",     'sem'),
        ("\\b(send)\\b",     'send'),
        ("\\b(separate)\\b",     'separate'),
        ("\\b(skip)\\b",     'skip'),
        ("\\b(suchthat)\\b",     'suchthat'),
        ("\\b(stop)\\b",            'stop'),
        ("\\b(string)\\b",            'string'),
        ("\\b(to)\\b",            'to'),
        ("\\b(type)\\b",            'type'),
        ("\\b(union)\\b",            'union'),
        ("\\b(val)\\b",            'val'),
        ("\\b(var)\\b",             'var'),
        ("\\b(vm)\\b",         'vm'),
        ("\\b(xor)\\b",         'xor'),
        ("[0-9]+(?:\.[0-9]+)?(?:[eE][+-]?[0-9]+)?",            'tk_num'),
        ('\+',              'tk_suma'),
        ('\^',              'tk_exp'),
        ('\[]',              'tk_separa'),
        ('\[',              'tk_cor_izq'),
        ('\]',              'tk_cor_der'),
        ('\{',              'tk_llave_izq'),
        ('\}',              'tk_llave_der'),
        ('->',               'tk_flecha'),
        ('>',               'tk_mayor'),
        ('<',               'tk_menor'),
        ('\-',              'tk_resta'),
        ('\*',              'tk_mult'),
        ('\%',              'tk_porce'),
        ('\/',              'tk_div'),
        ('\(',              'tk_par_izq'),
        ('\)',              'tk_par_der'),
        (':=:',              'tk_swap'),
        (':=',              'tk_asign'),
        ('!=',              'tk_diferente'),
        ('=',               'tk_igual'),  
        ('\.',               'tk_punto'),
        (':',               'tk_dos_puntos'),
        (',',               'tk_coma'),
        (';',               'tk_ptocoma'),       
        ('\"(\\.|[^\\"])*\"',    'tk_string'),
        ("(#(.*?)[\r$]?\n).*",    'tk_comment'),
        ('[a-zA-Z_]\w*',    'id'),
    ]

def getTokens():
    analyzedTokens = []
    lx = LexerAnalizer(rules)
    f=open("entradas/%s" % sys.argv[1], "r")
    # f=open("entradas/hello.txt", "r")
    fline = f.readlines()
    row = 1
    for x in fline:
        
        lx.input(x, row)
        try:
            for tok in lx.tokens():
                # print(tok)
                analyzedTokens.append(tok.getToken())
        except Exception as err:
            print(err)
            break
        row += 1
        
    f.close
    return analyzedTokens