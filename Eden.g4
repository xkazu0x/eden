grammar Eden;

expr: expr '+' INT |
      INT;

INT: [0-9] | [1-9] [0-9]*;