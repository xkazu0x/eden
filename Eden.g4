grammar Eden;

prog: (decl | expr)+ EOF;

decl: NAME '::' expr
    | NAME '::' '(' (param_list)? ')' ('->' return_list)? '{' (decl | expr)* '}'
    | NAME ':=' (decl | expr)
    | NAME '=' (decl | expr)
    | NAME ':' NAME
    ;

param_list: NAME ':' NAME (',' param_list)*;
return_list: (NAME ':')? NAME (',' return_list)*;

expr: expr mul_op expr
    | expr add_op expr 
    | '(' expr ')'
    | NAME
    | INT
    ;

add_op: '+' | '-';
mul_op: '*' | '/';

INT: [0-9] | [1-9] [0-9]*;
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;

WHITESPACE: [ \r\n\t]+ -> skip;
