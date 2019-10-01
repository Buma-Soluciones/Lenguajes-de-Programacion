import lexerAnalyzer


if __name__ == '__main__':
    rules = [
        ("global",           'global'),
        ("var",               'var'),
        ("int",               'int'),
        ("getarg",            'getarg'),
        ("write",             'write'),
        ("if",               'if'),
        ("fi",               'fi'),
        ("mod",               'mod'),
        ("body",               'body'),
        ("stop",               'stop'),
        ("end",               'end'),
        ("[0-9]+(?:\.[0-9]+)?(?:[eE][+-]?[0-9]+)?",            'tk_num'),
        ('\+',              'tk_suma'),
        ('->',               'tk_flecha'),
        ('\-',              'tk_resta'),
        ('\*',              'tk_mult'),
        ('\/',              'tk_div'),
        ('\(',              'tk_par_izq'),
        ('\)',              'tk_par_der'),
        (':=',              'tk_asign'),
        ('!=',              'tk_diferente'),
        ('=',               'tk_igual'),  
        (':',               'tk_dos_puntos'),
        (',',               'tk_coma'),
        (';',               'tk_ptocoma'),       
        ('[a-zA-Z_]\w*',    'id'),
        ('\"(\\.|[^\\"])*\"',    'tk_string'),
        ("(#(.*?)[\r$]?\n).*",    'tk_comment'),
    ]
    
    lx = lexerAnalyzer.LexerAnalizer(rules)
    f=open("entradas/prueba1.txt", "r")
    fline = f.readlines()
    row = 1
    for x in fline:
        
        lx.input(x, row)
        try:
            for tok in lx.tokens():
                print(tok)
        except Exception as err:
            print(err)
            break
        row= row+1
        
    f.close
