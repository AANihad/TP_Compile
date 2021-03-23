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

EGAL : '==';
DIFF : '!=';
AFF : '=';
/* Ajouter s'il nous reste du temps
SUPERIEUR OU EGAL
INFERIEUR OU EGAL
*/


//Expressions régulières
NOM_PROGRAMME : [A-Z]([a-zA-Z0-9]|'_')*;
ID : [a-zA-Z][a-zA-Z0-9]*;
INTEGER : [0-9]+ ;
FLOAT :  [0-9]+','[0-9]+;
STRING : '"'(~["])*'"'; // Tout caractère excepté " entre deux "

// Commentaires
UNELIGNE : '//'~[\n]* -> skip;
MULTILIGNE : '/*' (.)*? '*/' -> skip; // le ? est pour avoir une expression non avide
WS : [ \n\t\r] -> skip;

//============------------ Analyseur syntaxique ------------============

//prg : ID NOM_PROGRAMME '('')''{' declarations START instructions '}';
programme : COMPIL NOM_PROGRAMME '('')''{' declarations START instructions '}';

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

affectation : ID AFF (exp | ID | STRING);
boucle : DO '{' instructions '}' WHILE cdt;
condition : IF cdt THEN '{' instructions '}' (ELSE '{' instructions '}')*;

cdt : '('exp oplog exp')';
exp :
    '-' exp
    | '(' exp ')'
    | exp (MUL|DIV) exp
    | exp (PLUS|MOINS) exp
    | INTEGER
    | FLOAT
    | ID
    ;

oplog : SUP 
    | INF 
    | EGAL 
    | DIFF
    ;

ecrire : PRINTFCOMPIL '(' (ID | STRING|ids) ')';
lire : SCANCOMPIL '(' ids ')';
