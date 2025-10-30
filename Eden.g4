grammar Eden;

prog: block;
block: (decl | stmt)*;

decl: var_decl
    | attr
    | func_call
    ;
var_decl: NAME ':' NAME '=' expr ';' #VarDecl;
attr: NAME '=' expr ';';
func_call: NAME '(' param_list? ')' ';' #FuncCall;
param_list: expr (',' expr)* # ParamList;

stmt: if_stmt
    | while_stmt
    ;
if_stmt: 'if' expr '{' block '}' ('else' '{' block '}')? # IfStmt;
while_stmt: 'while' expr '{' block '}' # WhileStmt; 

expr: add_expr;
add_expr: mul_expr (add_op mul_expr)* # AddExpr;
mul_expr: term (mul_op term)* # MulExpr;

add_op: '+' | '-';
mul_op: '*' | '/';
term: NAME | INT | REAL | BOOL | CHAR | STRING;

INT: '0' | [1-9] [0-9]*;
REAL: ([0-9]* '.' [0-9]+) | ([0-9]+ '.' [0-9]*);
BOOL: 'true' | 'false';
CHAR: '\'' ~'\''* '\'';
STRING: '"' ~'"'* '"';

NAME: [_a-zA-Z] [_a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
