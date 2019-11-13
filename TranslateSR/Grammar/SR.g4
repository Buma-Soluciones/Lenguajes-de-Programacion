grammar SR;

s  : block list_declarations? declarations* End?;
block : Global Id
      | Resource Id;
list_declarations : Tk_par_izq (value Tk_dos_puntos datatype Tk_coma?)* Tk_par_der ;
declarations : asign+
             | init_var+
             | init_const+
             //| types+
             //| optypes+
             //| sem+
             //| op+
             //| funct+
             //| imports+
             | control_struc+
             | reserve_funct+
             //| body+
             | expr+;
             //| extends+
             //| final+;
asign : Id (Tk_llave_der (Id | value) Tk_llave_izq Tk_llave_der (Id | value) Tk_llave_izq)? (Tk_asign
           | Tk_suma Tk_asign
           | Tk_resta Tk_asign
           | Tk_mult Tk_asign
           | Tk_div Tk_asign
           | Tk_swap
           | Tk_diferente) expr;
init_var : Var (Id (Tk_llave_der value Tk_llave_izq Tk_llave_der value Tk_llave_izq)? Tk_coma?)* Tk_dos_puntos datatype;
init_const : Const Id Tk_asign (value | declarations);
value : Tk_num
      | Tk_string
      | Tk_resta Tk_num
      | Id;
datatype : Real
         | Int
         | Enum
         | Bool
         | Ptr
         | Cap
         | String TK_cor_izq (Tk_num | Tk_mult) Tk_cor_der
         | Char
         | Id;
expr : Tk_par_izq? value bin_exp?;
bin_exp :       (Tk_menor
               | Tk_menor_igual
               | Tk_mayor
               | Tk_mayor_igual
               | Tk_igual
               | Tk_punto
               | Tk_coma
               | Tk_suma
               | Tk_resta
               | Tk_div
               | Tk_mult
               | Tk_incr
               | Tk_decr) expr Tk_par_der?;

reserve_funct : (Abs
              | Max
              | Min
              | Pred
              | Succ
              | Low
              | High
              | Lb
              | Ub
              | Length
              | Maxlength
              | New
              | Free
              | Sqrt
              | Log
              | Ceil
              | Floor
              | Round
              | Sin
              | Cos
              | Tan
              | Asin
              | Acos
              | Atan
              | Random
              | Seed
              | Age
              | Nap
              | Open
              | Flush
              | Close
              | Remove
              | Seek
              | Where
              | Read
              | Write
              | Writes
              | Getarg) Tk_par_izq declarations Tk_par_der;


control_struc : for_all
              | iff;
for_all : Fa cuantificador Tk_flecha declarations Af;
cuantificador : Id Tk_asign expr (To | Downto) expr By? Suchthat?;
iff : If expr Tk_flecha declarations elsee? Fi;
elsee : Tk_separa Else? Tk_flecha declarations;

/////////////////////////////       Tokens            ////////////////////////////////////

Global : 'global';
Int : 'int';
Abs : 'abs';
Max : 'max';
Min : 'min';
Pred : 'pred';
Succ : 'succ';
Lb : 'lb';
Ub : 'ub';
Length : 'length';
Maxlength : 'maxlength';
Free : 'free';
Sqrt : 'sqrt';
Log : 'log';
Ceil : 'ceil';
Floor : 'floor';
Round : 'round';
Sin : 'sin';
Cos : 'cos';
Tan : 'tan';
Asin : 'asin';
Acos : 'acos';
Atan : 'atan';
Random : 'random';
Seed : 'seed';
Age : 'age';
Nap : 'nap';
Open : 'open';
Flush : 'flush';
Close : 'close';
Remove : 'remove';
Seek : 'seek';
Where : 'where';
Getarg : 'getarg';
Write : 'write';
Writes : 'writes';
If : 'if';
Fi : 'fi';
P : 'P';
V : 'V';
Af : 'af';
And : 'and';
Any : 'any';
Begin : 'begin';
Body : 'body';
Bool : 'bool';
By : 'by';
Call : 'call';
Cap : 'cap';
Char : 'char';
Const : 'const';
Co : 'co';
Create : 'create';
Destroy : 'destroy';
Downto : 'downto';
Do : 'do';
Else : 'else';
End : 'end';
Enum : 'enum';
Exit : 'exit';
Extend : 'extend';
External : 'external';
Fa : 'fa';
File : 'file';
Final : 'final';
Forward : 'forward';
High : 'high';
Import : 'import';
Initial : 'initial';
In : 'in';
Low : 'low';
Mod : 'mod';
New : 'new';
Next : 'next';
Ni : 'ni';
Not : 'not';
Oc : 'oc';
Od : 'od';
On : 'on';
Optype : 'optype';
Op : 'op';
Or : 'or';
Procedure : 'procedure';
Process : 'process';
Proc : 'proc';
Ptr : 'ptr';
Real : 'real';
Read : 'read';
Receive : 'receive';
Rec : 'rec';
Ref : 'ref';
Reply : 'reply';
Resource : 'resource';
Res : 'res';
Return : 'return';
Returns : 'returns';
Sem : 'sem';
Send : 'send';
Separate : 'separate';
Skip : 'skip';
Suchthat : 'suchthat';
Stop : 'stop';
String : 'string';
To : 'to';
Type : 'type';
Union : 'union';
Val : 'Val';
Var : 'var';
Vm : 'vm';
Xor : 'xor';
Tk_num : [0-9]+('.'[0-9]+)?('e'[0-9]+('.'[0-9]+)?)?
        |[0-9]+('.'[0-9]+)?('E'[0-9]+('.'[0-9]+)?)?;
Tk_incr : '++';
Tk_decr : '--';
Tk_suma : '+';
Tk_exp : '^';
Tk_separa : '[]';
TK_cor_izq : '[';
Tk_cor_der : ']';
Tk_llave_izq : '{';
Tk_llave_der : '}';
Tk_flecha : '->';
Tk_mayor : '>';
Tk_menor : '<';
Tk_mayor_igual : '>=';
Tk_menor_igual : '<=';
Tk_resta : '-';
Tk_mult : '*';
Tk_porce : '%';
Tk_div : '/';
Tk_par_izq : '(';
Tk_par_der : ')';
Tk_swap : ':=:';
Tk_asign : ':=';
Tk_diferente : '!=';
Tk_igual : '=';
Tk_punto : '.';
Tk_dos_puntos : ':';
Tk_coma : ',';
Tk_ptocoma : ';';
Tk_string :  '"'.*?'"';
Id : [-a-zA-Z_ñÑ][a-z0-9A-Z_ñÑ]*;
/////////////////////////////       Comentarios      /////////////////////////////
LINE_COMMENT 	: '#' ~[\r\n]* -> skip ;
EOL: [\r\n]+ -> skip;
WS : [ \t]+ -> skip;