
grammar logging;

log : entry+;
entry : timestamp ' ' level ' ' message CRLF?;
timestamp : DATE ' ' TIME;
level : 'ERROR' | 'INFO' | 'DEBUG';
message : (TEXT | ' ')+;

fragment DIGIT : [0-9];
fragment TWODIGIT : DIGIT DIGIT;
fragment LETTER : [A-Za-z];
fragment YEAR : DIGIT DIGIT DIGIT DIGIT;

DATE : YEAR '-' LETTER LETTER LETTER '-' TWODIGIT;
TIME : TWODIGIT ':' TWODIGIT ':' TWODIGIT;
TEXT : LETTER+;
CRLF : '\r'? '\n' | '\r';