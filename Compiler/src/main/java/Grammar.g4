grammar Grammar;

start : line*;

number : num | var;
num : NUM;
var : VAR;
expr: add;
add: mult | add ('+' | '-') mult;
mult: unary | mult ('*' | '/' | '%') unary;
unary: '-'? element;
element: number | '(' expr ')';

boolNumber: BCONST | VAR;
bConst: BCONST;
bVar: VAR;
boolExpr: boolAdd;
boolAdd: boolMult | boolAdd ('||' | '^') boolMult;
boolMult: boolUnary | boolMult ('&&') boolUnary;
boolUnary: '!'? boolElement;
boolCmp: expr BOP expr;
boolElement: boolNumber | boolCmp | '(' boolAdd ')';

line: assign | declaration | iff | whilec | forc | print | read;
assign: ass ';'? | rinc ';'? | linc ';'? |  opass ';'?;
linc: '++'VAR | '--'VAR;
rinc: VAR'++' | VAR'--';
ass: VAR '=' (expr | assign);
opass: VAR OP (expr | assign);

declaration: INT VAR ';'? | INT VAR '=' (expr | assign) ';'?;

forc: FOR '(' forDec? ';' forCond? ';' forAssign? ')' body;
forDec: (assign | declaration);
forCond: condition;
forAssign: assign;
whilec: WH '(' condition ')' body;
condition: boolExpr;
body: '{' line* '}';

iff: IFF '(' boolExpr ')' iftrue iffalse?;
iftrue: '{' line* '}';
iffalse: (ELSE '{' line* '}');

print: PRINT '(' expr ')' ';';
read: READ '(' VAR ')' ';';

BOP: '==' | '!=' | '<' | '>' | '<=' | '>=';
OP: '+=' | '-=' | '*=' | '/=' | '%=';
NUM : '-'?DIGIT+ ;
DIGIT: [0123456789];
BCONST: 'true' | 'false';
WS: [ \t\r\n]+ -> skip ;
INT: 'int';
FOR: 'for';
ELSE: 'else';
WH: 'while';
IFF: 'if';
PRINT: 'print' | 'println';
READ: 'read';
VAR: [a-zA-Z][a-zA-Z0-9_]*;