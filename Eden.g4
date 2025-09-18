grammar Eden;

prog: (decl | expr)+ EOF        # Program
    ;

decl: NAME ':' NAME '=' expr    # VariableDeclaration
    ;

expr: expr ('*' | '/') expr     # Multiplication
    | expr ('+' | '-') expr     # Addition
    | NAME                      # Variable
    | INT                       # Number
    ;

INT: '0' | [1-9] [0-9]*;
NAME: [_a-zA-Z] [_a-zA-Z0-9]*;

WHITESPACE: [ \r\n\t]+ -> skip;
