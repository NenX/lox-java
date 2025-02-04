# 语法规则

```
program        -> declaration* EOF ;
declaration    -> funDecl | varDecl | statement ;
classDecl      -> "class" IDENTIFIER ( "<" IDENTIFIER )? "{" function* "}" ;
funDecl        ->  "fun" function ;
function       ->  IDENTIFIER "(" parameters? ")" block ;
parameters     ->  IDENTIFIER ( "," IDENTIFIER )* ;
varDecl        -> "var" IDENTIFIER ( "=" expression )? ";" ;
statement      -> exprStmt | forStmt | ifStmt | printStmt | returnStmt | whileStmt | block ;
ifStmt         -> "if" "(" expression ")" statement ( "else" statement )? ;
whileStmt      -> "while" "(" expression ")" statement ;
forStmt        -> "for" "(" ( varDecl | exprStmt | ";" ) expression? ";" expression? ")" statement ;
block          -> "{" declaration* "}" ;
exprStmt       -> expression ";" ;
printStmt      -> "print" expression ";" ;
returnStmt     -> "return" expression? ";" ;
expression     -> assignment ;
assignment     -> ( call "." )? IDENTIFIER "=" assignment | logic_or ;
logic_or       -> logic_and ( "or" logic_and )* ;
logic_and      -> equality ( "and" equality )* ;
equality       -> comparision ( ( "!=" | "==" ) comparision )* ;
comparision    -> term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term           -> factor ( ( "+" | "-" ) factor )* ;
factor         -> unary ( ( "*" | "/" ) unary )* ;
unary          -> ( "!" | "-" )* unary | call ;
call           -> primary ( "(" arguments? ")" | "." IDENTIFIER )* ;
arguments      -> expression ( "," expression )* ;
primary        -> STRING | NUMBER | "false" | "true" | "nil" | "(" expression ")" | "super" "." IDENTIFIER ;
```
