grammar TinyLanguageSII;

//============------------ Analyseur Lexical ------------============

// Mots clés
COMPIL : 'compil';
START : 'start';
INTCOMPIL : 'intCompil';
FLOATCOMPIL : 'floatCompil';
STRINGCOMPIL : 'stringCompil';
IF : 'if';
THEN : 'then';
ELSE : 'else';
DO : 'do';
WHILE : 'while';
PRINTFCOMPIL : 'printCompil';
SCANCOMPIL : 'scanCompil';


//Opérateurs
// Priorité : /, *, +, -, >, <, == , !=
PLUS : '+';
MOINS : '-';
MUL : '*';
DIV : '/';

SUP : '>';
INF : '<';
SUPE : '>=';
INFE : '<=';
EGAL : '==';
DIFF : '!=';
AFF : '=';


//Expressions régulières
NOM_PROGRAMME : [A-Z]([a-zA-Z0-9]|'_')* .*? '('.*?')';
ID : [a-zA-Z][a-zA-Z0-9]*;
INTEGER : [0-9]+ ;
FLOAT :  [0-9]+','[0-9]+;
STRING : '"'(~["])*'"'; // Tout caractère excepté " entre deux "

// Commentaires
UNELIGNE : '//'~[\n]* -> skip;
MULTILIGNE : '/*' (.)*? '*/' -> skip; // le ? est pour avoir une expression non avide
WS : [ \n\t\r] -> skip;

//============------------ Analyseur syntaxique ------------============

programme : COMPIL NOM_PROGRAMME'{' declarations START instructions '}';

declarations : declarations type ids ';'
            | ;

type : INTCOMPIL 
    | FLOATCOMPIL 
    | STRINGCOMPIL
    ;

ids : ID (',' ID)*;

instructions : instruction instructions? ;

instruction : inst_a ';' 
            | inst_b
            ;

inst_a : affectation 
        | lire 
        | ecrire
        ; //instructions suivies d'un ';'

inst_b : condition 
        | boucle
        ; // instructions sans ';'

affectation : ID AFF (exp | STRING);
boucle : DO '{' instructions '}' WHILE cdtDO;
condition : IF cdtIF THEN '{' instructions '}' (instElse '{' instructions '}')*;
instElse : ELSE; // pour pouvoir génerer les quadruplets

cdtIF : '('exp oplog exp')';
cdtDO : '('exp oplog exp')';

exp : MOINS exp
    | parG exp parD
    | exp opMD exp
    | exp opPM exp
    | INTEGER
    | FLOAT
    | ID
    ;

parG: '(';
parD: ')';

opMD : MUL
    | DIV;
opPM : PLUS
    | MOINS;

oplog : SUP 
    | INF
    | SUPE
    | INFE
    | EGAL 
    | DIFF
    ;

ecrire : PRINTFCOMPIL '(' (STRING | ids) ')';
lire : SCANCOMPIL '(' ids ')';
