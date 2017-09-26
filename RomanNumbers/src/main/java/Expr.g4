grammar Expr;

@members {
  int result = 0;
}
// END:members

// START:stat
prog:   stat+ ;
                
stat:   // evaluate expr and emit result
        // $expr.value is return attribute 'value' from expr call
        expr NEWLINE {result = $expr.value;}

        // do nothing: empty statement
    |   NEWLINE
    ;
// END:stat

// START:expr
expr returns [int value]
    :   e=atom {$value = $e.value;}
        (   '+' e=atom {$value += $e.value;}
        )*
    ;
// END:expr

// START:atom
atom returns [int value]
    :   // value of an INT is the int computed from char sequence
        INT {$value = Integer.parseInt($INT.text);}

        // value of parenthesized expression is just the expr value
    |   '(' expr ')' {$value = $expr.value;}
    ;
// END:atom

// START:tokens
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
// END:tokens