lexer grammar AngularLexer;

//Keywords:
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
CLASS: 'class';
THIS: 'this';
NEW: 'new';
CHAR: 'char';
STRING: 'string';
INT: 'int';
FLOAT: 'float';
ARRAY: 'array';
ANY: 'any';
FOR: 'for';
FOREACH: 'foreach';
OF: 'of';
WHILE: 'while';
DO: 'do';
IF: 'if';
ELSE_IF: 'elseif';
ELSE: 'else';
TRUE: 'true';
FALSE: 'false';
LET: 'let';
VAR: 'var';
CONST: 'const';
NUM: 'number';
NULL: 'null';
BOOLEAN: 'boolean';

//Symbols:
OPENCURLY: '{';
CLOSECURLY: '}';
OPENBRACKET: '(';
CLOSEBRACKET: ')';
OPENSQUARE: '[';
CLOSESQUARE: ']';
COLON: ':';
CEMMI: ';';
COMMA: ',';
AT: '@';
DOT: '.';
ASSIGN: '=';
LEFTARROW: '<';
RIGHTARROW: '>';
LEFTARROWOREQUAL: '<=';
RIGHTARROWOREQUAL: '>=';
EQUAL: '==';
NOTEQUAL: '!=';
MULT: '*';
DIVIDE: '/';
PLUS: '+';
PLUSPLUS: '++';
SUB: '-';
SUBSUB: '--';
MARK: '!';
DOUBLQOUT: '"';
HASH: '#';
ARROW: '=>';
QUISTION: '?';


//Basics:
NUMBER: ([0] | ('-'?[1-9][0-9]*));
FLOATNUM: ([0] | ('-'? [0-9]+ '.' [0-9]+));
CHARACTER: '\'' [a-zA-Z0-9@#$<>/?+._*&!:-]? '\'';
WS: [ \t\r\n]+ -> skip;
ID: [a-zA-Z][_a-zA-Z0-9-]*;
STR: '"' [a-zA-Z0-9-@#$<>=() /?}{+,._*&!:;]* '"'
    | '\'' [a-zA-Z0-9-@#$<>=() /?}{+,._*&!:;]* '\'' ;
SYBOLS: (MULT | MARK | COMMA | COLON | DOUBLQOUT)+;
