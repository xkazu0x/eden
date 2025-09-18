grammar Eden;

prog: (decl | expr)+ EOF;

decl: NAME '::' expr
    | var_decl
    ;

var_decl: NAME assign_op expr
        | NAME ':' type ('=' expr)?
        ;

assign_op: '=' | ':=';

type: NAME;

// expr: expr mul_op expr
//     | expr add_op expr
//     | expr cmp_op expr
//     | '(' expr ')'
//     | NAME
//     | INT
//     ;

expr: or_expr;
or_expr: and_expr (or_op and_expr)*;
and_expr: cmp_expr (and_op cmp_expr)*;
cmp_expr: add_expr (cmp_op add_expr)*;
add_expr: mul_expr (add_op mul_expr)*;
mul_expr: operand_expr (mul_op operand_expr)*;
operand_expr: INT
            | NAME
            | '(' expr ')'
            ;

or_op: '||';
and_op: '&&';
cmp_op: '==' | '!=' | '<=' | '>=';
add_op: '+' | '-';
mul_op: '*' | '/';

INT: '0' | [1-9] [0-9]*;
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;

WHITESPACE: [ \r\n\t]+ -> skip;
