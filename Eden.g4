grammar Eden;

prog: (decl | stmt)+ EOF
    ;

// A Declaration introduces a new name 
// in a given scope, could be a variable,
// a function, a struct
decl: var_decl
    | struct_decl
    | func_decl
    ;

var_decl: NAME ':' NAME ';'          // decl
        | NAME ':' NAME '=' expr ';' // decl + explicit assignment
        | NAME ':=' expr ';'         // decl + implicit assignment
        ;

struct_decl: NAME '::' 'struct' '{' var_decl* '}' ';';

func_decl: NAME '::' '(' param_list? ')' return_list? '{' (var_decl | stmt)* '}';
param_list: NAME ':' NAME (',' param_list)*;
return_list: '->' NAME;

// Statements performs and action,
// it is a complete instruction that 
// tells the program to do something. 
// It can contain expression, but it
// does _not_ return a value by itself.
stmt: assign_stmt
    | return_stmt
    | if_stmt
    ;
assign_stmt: NAME ('.' NAME)? '=' expr ';';
return_stmt: 'return' expr ';';
if_stmt: 'if' expr '{' (var_decl | stmt)* '}';// ('else' if_stmt | 'else' '{' stmt* '}')?;

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
