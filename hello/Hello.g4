grammar Hello;            // Define a grammar called Hello
r  : 'PPC: ' ID 'pene' ID NUM;
NUM : [0-9]+ ;       // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)
