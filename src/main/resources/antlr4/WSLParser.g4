parser grammar WSLParser;

options { tokenVocab=WSLLexer; }

prog: version ((DEFINE (define_vert | define_frag)))*;

version: VERSION STRING;

define_vert: VERTEX BLOCK;
define_frag: FRAGMENT BLOCK;