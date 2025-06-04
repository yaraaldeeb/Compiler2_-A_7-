parser grammar CssParser;

options { tokenVocab = CssLexer; }

//0
cssFile: cssStyles* EOF;

//1
cssStyles: (DOT | HASH)? ID (COMMA (DOT | HASH)? ID)* pseudoClass? pseudoElement? OPENCURLY body* CLOSECURLY;

//2
pseudoClass: COLON ID;

//3
pseudoElement: DOUBLECOLON ID;

//4
body: (ID COLON (STR | functioncall | ID+ | FLOATNUM | NUMBER) CEMMI)
    | cssStyles+
    ;

//5
functioncall: ID OPENBRACKET CLOSEBRACKET;

