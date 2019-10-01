import lexerAnalyzer


if __name__ == '__main__':
    rules = [
        
        ("global",          'global'),
        ("int",             'int'),
        ("getarg",          'getarg'),
        ("write",           'write'),
        ("if",              'if'),
        ("fi",              'fi'),
        ("P",             'P'),
        ("V",             'V'),
        ("af",             'af'),
        ("and",             'and'),
        ("any",             'any'),
        ("begin",             'begin'),
        ("body",            'body'),
        ("bool",             'bool'),
        ("by",             'by'),
        ("call",             'call'),
        ("cap",             'cap'),
        ("char",             'char'),
        ("const",             'const'),
        ("co",             'co'),
        ("create",             'create'),
        ("destroy",             'destroy'),
        ("downto",             'downto'),
        ("do",             'do'),
        ("else",             'else'),
        ("end",             'end'),
        ("enum",             'enum'),
        ("exit",             'exit'),
        ("extend",             'extend'),
        ("external",             'external'),
        ("fa",          'fa'),
        ("file",          'file'),
        ("final",        'final'),
        ("forward",        'forward'),
        ("high",        'high'),
        ("import",        'import'),
        ("initial",        'initial'),
        ("in",        'in'),
        ("low",        'low'),
        ("mod",             'mod'),
        ("new",     'new'),
        ("next",     'next'),
        ("ni",     'ni'),
        ("not",     'not'),
        ("oc",     'oc'),
        ("od",     'od'),
        ("on",     'on'),
        ("optype",     'optype'),
        ("op",     'op'),
        ("or",     'or'),
        ("procedure",     'procedure'),
        ("process",     'process'),
        ("proc",     'proc'),
        ("ptr",     'ptr'),
        ("real",     'real'),
        ("receive",     'receive'),
        ("rec",     'rec'),
        ("ref",     'ref'),
        ("replay",     'replay'),
        ("resource",     'resource'),
        ("res",     'res'),
        ("return",     'return'),
        ("returns",     'returns'),
        ("sem",     'sem'),
        ("send",     'send'),
        ("separate",     'separate'),
        ("skip",     'skip'),
        ("suchthat",     'suchthat'),
        ("stop",            'stop'),
        ("string",            'string'),
        ("to",            'to'),
        ("type",            'type'),
        ("union",            'union'),
        ("val",            'val'),
        ("var",             'var'),
        ("vm",         'vm'),
        ("xor",         'xor'),
        ("xor",         'xor'),
        ("[0-9]+(?:\.[0-9]+)?(?:[eE][+-]?[0-9]+)?",            'tk_num'),
        ('\+',              'tk_suma'),
        ('\^',              'tk_exp'),
        ('\[]',              'tk_separa'),
        ('\{',              'tk_llave_izq'),
        ('\}',              'tk_llave_der'),
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
        ('\"(\\.|[^\\"])*\"',    'tk_string'),
        ("(#(.*?)[\r$]?\n).*",    'tk_comment'),
        ('[a-zA-Z_]\w*',    'id'),
    ]
    
    lx = lexerAnalyzer.LexerAnalizer(rules)
    f=open("entradas/prueba2.txt", "r")
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
        row += 1
        
    f.close
