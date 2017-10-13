grammar codeLang;
/** A rule called init that matches comma-separated values between {...}. */
graph : 'graph' '{' edges '}';


edges : edge+
      ;
edge  : FROM from TO to
      ;

from : STRING
//     | INT
     ;
to  : STRING
//    | INT
   ;

FROM: ['f'|'F'] ['r'|'R'] ['o'|'O'] ['m'|'M'];

TO  : ['T'|'t'] ['o'|'O'];


///////////////////// general lexemes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


// Define token STRING as one or more characters
STRING  : CHAR+
        | CHAR
        ;


//STRING  : CHAR [a-zA-z0-9]*
//        | CHAR
//        | INT
//        ;

CHAR    :[a-zA-Z];

// Define token INT as one or more digits
INT     : [0-9]+ ;

// ignore whitespace

WS      : [ \t\r\n]+ -> skip ;
