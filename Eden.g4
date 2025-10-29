grammar Eden;

prog: (decl | expr)* EOF;

expr: add_expr;
add_expr: NUM (ADD_OP NUM)* # AddExpr;

decl: NAME ':' NAME '=' expr ';';

ADD_OP: '+' | '-';
MUL_OP: '*' | '/';
NUM: INT | REAL | BOOL;

INT: '0' | [1-9] [0-9]*;
REAL: ([0-9]* '.' [0-9]+) | ([0-9]+ '.' [0-9]*);
BOOL: 'true' | 'false';
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
