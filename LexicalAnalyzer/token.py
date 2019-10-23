"""Made by Juan Sebastian Becerra 
   Juan Sebastian Peña
"""
class Token(object):
    """ La estructura del token consiste en un tipo del token, su respectivo lexema y la columna y fila
        donde se encuentra, ademas si el Token es una palabra reservada o simbolo especial, como su lexema es
        igual, este no se representa en la estructura
    """
    def __init__(self, type, lex, row,col):
        self.type = type
        self.lex = lex
        self.row = row
        self.col = col

    def __str__(self):
        # if(self.lex != self.type):
        if(self.type in ["tk_string", "tk_num", "id"]):
            return '<%s, %s, %s, %s>' % (self.type, self.lex, self.row, self.col)
        else:
            return '<%s, %s, %s>' % (self.type, self.row, self.col)    
    
