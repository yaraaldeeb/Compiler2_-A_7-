parser grammar HtmlParser;

options { tokenVocab = HtmlLexer; }

//1
html: tags* EOF;
//2
tags: selfClosingTag
    | normalTag
    ;
//3
selfClosingTag: LEFTARROW MARK? ID attributes* DIVIDE? RIGHTARROW;
//4
normalTag: LEFTARROW ID attributes* RIGHTARROW tagBody* LEFTARROW DIVIDE ID RIGHTARROW;
//5
attributes: MULT? (ID (ASSIGN value)?)
    | event
    | var
    ;
//6
value: STR | ID;
//7
event: OPENBRACKET ID CLOSEBRACKET ASSIGN STR;
//8
var: OPENSQUARE ID CLOSESQUARE ASSIGN STR;
//9
tagBody: selfClosingTag
        | normalTag
        | enterpolation
        | ID
        ;
//10
enterpolation: OPENCURLY OPENCURLY ID (DOT ID)* CLOSECURLY CLOSECURLY;
