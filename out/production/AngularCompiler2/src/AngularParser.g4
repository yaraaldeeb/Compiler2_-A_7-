parser grammar AngularParser;

options { tokenVocab = AngularLexer; }
//1
program: imports+ directive structure EOF;
//2
imports: IMPORT OPENCURLY thingsToImport CLOSECURLY FROM STR CEMMI?;//has Scope
//3
thingsToImport: ID (COMMA ID)*;
//4
directive: AT ID OPENBRACKET OPENCURLY sittings CLOSECURLY CLOSEBRACKET;//has Scope
//5
sittings: ((ID COLON STR) | (ID COLON OPENSQUARE thingsToImport CLOSESQUARE)) (COMMA ((ID COLON STR) | (ID COLON OPENSQUARE thingsToImport CLOSESQUARE)))*;
//6
structure: EXPORT CLASS ID OPENCURLY body* CLOSECURLY;//has Scope
//7
body: properties
    | functions
    | controleStmts
    | loops
    | varDec
    | exp
    ;
//8
properties: ((THIS DOT)? ID COLON dataType (ASSIGN value)? CEMMI?)
    | (AT ID OPENBRACKET CLOSEBRACKET ID ASSIGN NEW ID LEFTARROW dataType RIGHTARROW OPENBRACKET CLOSEBRACKET CEMMI?)
    | (AT ID OPENBRACKET CLOSEBRACKET ID COLON dataType CEMMI?)
    | ((THIS DOT)? ID COLON dataType (OPENSQUARE CLOSESQUARE)? ASSIGN arrayorobject CEMMI?)
    | ((THIS DOT)? ID ASSIGN value CEMMI?)
    ;
//9
dataType: STRING | CHAR | NUM | BOOLEAN | ANY;
//10
value: NUMBER | CHARACTER | STR | TRUE | FALSE | (THIS DOT)? ID;
//11
functions: arrowFunction
    | normalFunction
    | (THIS DO)? (ID DOT)? functionCall
    ;
//12
arrowFunction: OPENBRACKET parameters? CLOSEBRACKET ARROW OPENCURLY body* CLOSECURLY;//has Scope
//13
normalFunction: ID OPENBRACKET parameters? CLOSEBRACKET OPENCURLY body* CLOSECURLY;//has Scope
//14
parameters: (ID | properties | arrayorobject | value) (COMMA (ID | properties | arrayorobject | value))*;
//15
arrayorobject: (OPENSQUARE | OPENCURLY) (value (COMMA value)*) (CLOSESQUARE | CLOSECURLY);//has Scope
//16
functionCall: ID OPENBRACKET parameters? CLOSEBRACKET CEMMI?;//has Scope
//17
controleStmts: IF OPENBRACKET condition CLOSEBRACKET OPENCURLY body* CLOSECURLY elseIfStmts? elseStmt?;//has Scope
//18
condition: value
        | exp
        ;
//19
elseIfStmts: ELSE_IF OPENBRACKET condition CLOSEBRACKET OPENCURLY body* CLOSECURLY elseIfStmts? elseStmt?;//has Scope
//20
elseStmt: ELSE OPENCURLY? body* CLOSECURLY?;//has Scope
//21
varDec: (LET | VAR | CONST) ID (COLON dataType)? (ASSIGN (value | arrayorobject))? CEMMI?;
//22
exp: exp MULT exp
    | exp DIVIDE exp
    | exp PLUS exp
    | exp SUB exp
    | exp EQUAL exp
    | exp NOTEQUAL exp
    | exp ASSIGN exp
    | exp LEFTARROW exp
    | exp RIGHTARROW exp
    | exp LEFTARROWOREQUAL exp
    | exp RIGHTARROWOREQUAL exp
    | ID
    | NUMBER
    ;
//23
loops: foreachStmt
    | forStmt
    ;
//24
foreachStmt: FOREACH OPENBRACKET ID COLON dataType COLON ID CLOSEBRACKET OPENCURLY body* CLOSECURLY;//has Scope
//25
forStmt: FOR OPENBRACKET varDec? CEMMI condition? CEMMI exp? CLOSEBRACKET OPENCURLY body* CLOSECURLY;//has Scope
