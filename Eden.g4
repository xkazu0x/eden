grammar Eden;

prog: (decl | stmt | expr)+ EOF
    ;

// A Declaration introduces a new name 
// in a given scope, could be a variable,
// a function, a struct
decl: var_decl
    ;
var_decl: NAME ':' NAME ';'          // decl
        | NAME ':' NAME '=' expr ';' // decl + explicit assignment
        | NAME ':=' expr ';'         // decl + implicit assignment
        ;

// Statements performs and action,
// it is a complete instruction that 
// tells the program to do something. 
// It can contain expression, but it
// does _not_ return a value by itself.
stmt: assign_stmt
    | if_stmt
    | stmt_block;
assign_stmt: NAME '=' expr ';';
if_stmt: 'if' expr stmt_block ('else' if_stmt | 'else' stmt_block)?;
stmt_block: '{' stmt* '}';

// Expressions computes a value and 
// are part of staments.
expr: expr mul_op expr
    | expr add_op expr
    | '(' expr ')'
    | NAME 
    | INT
    ;
mul_op: '*' | '/';
add_op: '+' | '-';

INT: '0' | [1-9] [0-9]*;
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
