grammar Eden;

prog: (decl | expr0)+ EOF;

decl: NAME ':' NAME '=' expr0
    | NAME ':' '=' expr0
    ;

expr0: expr ';';
expr: FLOAT
    | INT
    | NAME
    | expr ('+' | '-') expr
    | expr ('*' | '/') expr
    ;

NAME: [_a-zA-Z] [_a-zA-Z0-9]*;
INT: [0-9] | [1-9] [0-9]*;
FLOAT: ([0-9] | [1-9] [0-9]*)? '.' [0-9]*;

WHITESPACE: [ \r\n]+ -> skip;