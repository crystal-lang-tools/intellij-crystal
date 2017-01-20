package org.crystal.lang.core.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.crystal.lang.core.psi.CrystalCompositeElementTypes.*;

%%

%{
  public _CrystalLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _CrystalLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

COMMENT=#.*
SPACE=[ \t\n\x0B\f\r]+
STRING=(\"([^\"\\]|\\.)*\")
NUMBER=([0-9]+)
CHAR=('([^'\\]|\\.)*')
SYMBOL=(:(\"([^\"\\]|\\.)*\"|[^ \t\n\x0B\f\r]+))

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "{"                { return LEFT_BRACE; }
  "}"                { return RIGHT_BRACE; }
  "("                { return LEFT_PARENTHESIS; }
  ")"                { return RIGHT_PARENTHESIS; }
  "["                { return LEFT_BRACKET; }
  "]"                { return RIGHT_BRACKET; }
  "|"                { return BRACKET; }
  "."                { return DOT; }
  ","                { return COMMA; }
  "="                { return EQUAL; }
  "=="               { return EQUAL_EQUAL; }
  "==="              { return EQUAL_EQAUL_EQUAL; }
  "\\"               { return BACKSLASH; }
  "=>"               { return ARROW; }
  "=~"               { return APROX_ARROW; }
  "!="               { return NOT_EQUAL; }
  "!~"               { return NOT_APROX; }
  "!"                { return NOT; }
  "<=>"              { return LEFT_RIGHT_ARROW; }
  "<="               { return LEFT_ARROW; }
  "<<="              { return LEFT_LEFT_ARROW; }
  "<<"               { return INSERT; }
  "<"                { return LESS; }
  ">="               { return GREATER_EQUAL; }
  ">>="              { return GREATER_GREATER_EQUAL; }
  ">>"               { return GREATER_GREATER; }
  ">"                { return GREATER; }
  "+="               { return PLUS_EQUAL; }
  "+"                { return PLUS; }
  "-="               { return MINUS_EQUAL; }
  "->"               { return MINUS_GREATER; }
  "-"                { return MINUS; }
  "*="               { return TIMES_EQUAL; }
  "**="              { return TIMES_TIMES_EQUAL; }
  "**"               { return TIMES_TIMES; }
  "*"                { return TIMES; }
  "/="               { return DIVIDE_EQUAL; }
  "/"                { return DIVIDE; }
  "%="               { return MODULO_EQUAL; }
  "module"           { return MODULE; }
  "%}"               { return MACRO_BLOCK_CLOSE; }
  "{%"               { return MACRO_BLOCK_OPEN; }
  "{{"               { return MACRO_STATEMENT_OPEN; }
  "[]="              { return ARRAY_EQUAL; }
  "[]?"              { return ARRAY_BOOL; }
  "[]"               { return ARRAY; }
  "?"                { return QUESTION; }
  ";"                { return SEMICOLON; }
  "::"               { return NAMESPACE; }
  ":"                { return COLON; }
  "~"                { return TILDE; }
  "..."              { return DOT_DOT_DOT; }
  ".."               { return DOT_DOT; }
  "&&="              { return AND_AND_EQUAL; }
  "&&"               { return AND_AND; }
  "&="               { return AND_EQUAL; }
  "&"                { return AND; }
  "||="              { return OR_OR_EQUAL; }
  "||"               { return OR_OR; }
  "|="               { return OR_EQUAL; }
  "^="               { return CAROT_EQUAL; }
  "^"                { return CAROT; }
  "@["               { return AT_BRACKET; }
  "$~"               { return DOLLAR_TILDE; }
  "$?"               { return DOLLAR_QUESTION; }
  "case"             { return CASE; }
  "class"            { return CLASS; }
  "def"              { return DEF; }
  "do"               { return DO; }
  "else"             { return ELSE; }
  "end"              { return END; }
  "if"               { return IF; }
  "nil"              { return NIL; }
  "of"               { return OF; }
  "require"          { return REQUIRE; }
  "when"             { return WHEN; }
  "yield"            { return YEILD; }
  "until"            { return UNTIL; }
  "elsif"            { return ELSIF; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "raise"            { return RAISE; }

  {COMMENT}          { return COMMENT; }
  {SPACE}            { return SPACE; }
  {STRING}           { return STRING; }
  {NUMBER}           { return NUMBER; }
  {CHAR}             { return CHAR; }
  {SYMBOL}           { return SYMBOL; }

}

[^] { return BAD_CHARACTER; }
