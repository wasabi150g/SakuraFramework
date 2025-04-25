lexer grammar WSLLexer;

tokens { BLOCK }

@members { private int braceDepth = 0; }

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

BLOCK_START: '{' { braceDepth = 1; } -> more, pushMode(BRACE);

WHITESPACE: [ \t\r\n]+ -> skip;

DEFINE: 'define';
VERSION: 'version';
VERTEX: 'vertex';
FRAGMENT: 'fragment';

STRING: [a-zA-Z0-9_]+;

mode BRACE;

BLOCK_OPEN: '{' { braceDepth++; } -> more;

BLOCK_END: '}' {
    braceDepth--;

    if (braceDepth == 0) {
        popMode();
        setType(BLOCK);
    } else {
        more();
    }
};

BLOCK_CONTENT: . -> more;