parser grammar GLSLParser;

options { tokenVocab=GLSLLexer; }

prog: line*;

line: (layout | uniform | in | out | main_function);

layout: LAYOUT LPAREN LOCATION EQUAL location RPAREN IN type name SEMICOLON;
uniform: UNIFORM type name SEMICOLON;
in: IN type name SEMICOLON;
out: OUT type name SEMICOLON;

main_function: VOID MAIN LPAREN RPAREN BLOCK;

location: STRING;
type: STRING;
name: STRING;