grammar Eden;

prog: block;
block: (decl | stmt)*;

// NOTE: Declarations
decl: var_decl
    | impl_var_decl
    ;
var_decl: NAME ':' NAME '=' expr ';'  # VarDecl;
impl_var_decl: NAME ':=' expr ';'     # ImplVarDecl;

// NOTE: Statements
stmt: assign_stmt
    | func_call_stmt
    | if_stmt
    | while_stmt
    ;
assign_stmt: NAME '=' expr ';'                            # AssignStmt;
func_call_stmt: func_call ';'                             # FuncCallStmt;
if_stmt: 'if' expr '{' block '}' ('else' '{' block '}')?  # IfStmt;
while_stmt: 'while' expr '{' block '}'                    # WhileStmt; 

// NOTE: Helpers
func_call: NAME '(' param_list? ')' # FuncCall;
param_list: expr (',' expr)*        # ParamList;

// NOTE: Expressions
expr: add_expr;
add_expr: mul_expr (add_op mul_expr)* # AddExpr;
mul_expr: term (mul_op term)*         # MulExpr;
add_op: '+' | '-';
mul_op: '*' | '/';
term: '(' expr ')' | func_call | NAME | INT | REAL | BOOL | CHAR | STRING;

// NOTE: Data Types
INT: '0' | [1-9] [0-9]*;
REAL: ([0-9]* '.' [0-9]+) | ([0-9]+ '.' [0-9]*);
BOOL: 'true' | 'false';
CHAR: '\'' ~'\''* '\'';
STRING: '"' ~'"'* '"';
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;
WHITESPACE: [ \r\n\t]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
