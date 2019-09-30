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
        ("[+-]?[0-9]+(?:\.[0-9]+)?(?:[eE][+-][0-9]+)?",            'tk_num'),
        ('\+',              'tk_mas'),
        ('->',               'tk_flecha'),
        ('\-',              'tk_men'),
        ('\*',              'tk_mul'),
        ('\/',              'tk_div'),
        ('\(',              'tk_para'),
        ('\)',              'tk_parc'),
        (':=',              'tk_asign'),
        ('!=',              'tk_noasign'),
        ('=',               'tk_igual'),  
        (':',               'tk_dpuntos'),
        (',',               'tk_dpuntos'),
        (';',               'tk_dpuntos'),       
        ('[a-zA-Z_]\w+',    'id'),
        ('[a-zA-Z]',       'id'),
        ('\"(\\.|[^\\"])*\"',    'tk_string'),
        ("(#(.*?)[\r$]?\n).*",    'tk_comment'),
    ]
    
    lx = lexerAnalyzer.Lexer(rules)
    f=open("entradas/prueba1.txt", "r")
    fline = f.readlines()
    row = 1
    for x in fline:
        
        lx.input(x, row)
        try:
            for tok in lx.tokens():
                print(tok)
        except Exception as err:
            print('LexerError at position %s' % err)
        row= row+1
        
    f.close
