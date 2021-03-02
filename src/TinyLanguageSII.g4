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
ID : [a-zA-Z0-9_]+;
INTEGER : '-'?[1-9][0-9]*|'0' ;
FLOAT :  '-'?[1-9][0-9]+','[0-9]*;
STRING : '"'(~["])*'"'; // Tout caractère excepté " entre deux "

// Commentaires
UNELIGNE : '//'~[\n]* -> skip;
MULTILIGNE : '/*' (.)*? '*/' -> skip; // le ? est pour avoir une expression non avide
WS : [ \n\t]* -> skip;

//============------------ Analyseur syntaxique ------------============

//prg : ID NOM_PROGRAMME '('')''{' declarations START instructions '}';
programme : COMPIL NOM_PROGRAMME '('')''{' declarations START instructions '}';

declarations : declarations type ids ';'| ;
type : INTCOMPIL | FLOATCOMPIL | STRINGCOMPIL;
ids : ID (',' ID)*;

instructions : instruction instructions | instruction ;
instruction : inst_a ';' | inst_b;
inst_a : affectation | lire | ecrire;
inst_b : condition | boucle;

affectation : ID AFF (exp | ID | STRING);
boucle :DO '{' instructions '}' WHILE cdt;
condition : IF cdt THEN '{' instructions '}' (ELSE '{' instructions '}')*;

cdt : '('exp oplog exp')';
exp : exp op_moindre_prio b | b;
b : b op_prio c | c;
c : '(' exp ')'| ID | val;

val : INTEGER | FLOAT {};
op_moindre_prio : PLUS | MOINS ;
op_prio : MUL | DIV;
oplog : SUP | INF | EGAL | DIFF ;

ecrire : PRINTFCOMPIL '(' (ID | STRING|ids) ')';
lire : SCANCOMPIL '(' ids ')';
