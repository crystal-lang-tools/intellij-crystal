// This is a generated file. Not intended for manual editing.
package org.crystal.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.crystal.lang.core.psi.impl.*;

public interface CrystalCompositeElementTypes {


  IElementType AND = new CrystalTokenType("&");
  IElementType AND_AND = new CrystalTokenType("&&");
  IElementType AND_AND_EQUAL = new CrystalTokenType("&&=");
  IElementType AND_EQUAL = new CrystalTokenType("&=");
  IElementType APROX_ARROW = new CrystalTokenType("=~");
  IElementType ARRAY = new CrystalTokenType("[]");
  IElementType ARRAY_BOOL = new CrystalTokenType("[]?");
  IElementType ARRAY_EQUAL = new CrystalTokenType("[]=");
  IElementType ARROW = new CrystalTokenType("=>");
  IElementType AT_BRACKET = new CrystalTokenType("@[");
  IElementType BACKSLASH = new CrystalTokenType("\\");
  IElementType BRACKET = new CrystalTokenType("|");
  IElementType CAROT = new CrystalTokenType("^");
  IElementType CAROT_EQUAL = new CrystalTokenType("^=");
  IElementType CASE = new CrystalTokenType("case");
  IElementType CHAR = new CrystalTokenType("char");
  IElementType CLASS = new CrystalTokenType("class");
  IElementType COLON = new CrystalTokenType(":");
  IElementType COMMA = new CrystalTokenType(",");
  IElementType COMMENT = new CrystalTokenType("comment");
  IElementType DEF = new CrystalTokenType("def");
  IElementType DIVIDE = new CrystalTokenType("/");
  IElementType DIVIDE_EQUAL = new CrystalTokenType("/=");
  IElementType DO = new CrystalTokenType("do");
  IElementType DOLLAR_QUESTION = new CrystalTokenType("$?");
  IElementType DOLLAR_TILDE = new CrystalTokenType("$~");
  IElementType DOT = new CrystalTokenType(".");
  IElementType DOT_DOT = new CrystalTokenType("..");
  IElementType DOT_DOT_DOT = new CrystalTokenType("...");
  IElementType ELSE = new CrystalTokenType("else");
  IElementType ELSIF = new CrystalTokenType("elsif");
  IElementType END = new CrystalTokenType("end");
  IElementType EQUAL = new CrystalTokenType("=");
  IElementType EQUAL_EQAUL_EQUAL = new CrystalTokenType("===");
  IElementType EQUAL_EQUAL = new CrystalTokenType("==");
  IElementType FALSE = new CrystalTokenType("false");
  IElementType GREATER = new CrystalTokenType(">");
  IElementType GREATER_EQUAL = new CrystalTokenType(">=");
  IElementType GREATER_GREATER = new CrystalTokenType(">>");
  IElementType GREATER_GREATER_EQUAL = new CrystalTokenType(">>=");
  IElementType IF = new CrystalTokenType("if");
  IElementType INSERT = new CrystalTokenType("<<");
  IElementType LEFT_ARROW = new CrystalTokenType("<=");
  IElementType LEFT_BRACE = new CrystalTokenType("{");
  IElementType LEFT_BRACKET = new CrystalTokenType("[");
  IElementType LEFT_LEFT_ARROW = new CrystalTokenType("<<=");
  IElementType LEFT_PARENTHESIS = new CrystalTokenType("(");
  IElementType LEFT_RIGHT_ARROW = new CrystalTokenType("<=>");
  IElementType LESS = new CrystalTokenType("<");
  IElementType MACRO_BLOCK_CLOSE = new CrystalTokenType("%}");
  IElementType MACRO_BLOCK_OPEN = new CrystalTokenType("{%");
  IElementType MACRO_STATEMENT_OPEN = new CrystalTokenType("{{");
  IElementType MINUS = new CrystalTokenType("-");
  IElementType MINUS_EQUAL = new CrystalTokenType("-=");
  IElementType MINUS_GREATER = new CrystalTokenType("->");
  IElementType MODULE = new CrystalTokenType("module");
  IElementType MODULO_EQUAL = new CrystalTokenType("%=");
  IElementType NAMESPACE = new CrystalTokenType("::");
  IElementType NIL = new CrystalTokenType("nil");
  IElementType NOT = new CrystalTokenType("!");
  IElementType NOT_APROX = new CrystalTokenType("!~");
  IElementType NOT_EQUAL = new CrystalTokenType("!=");
  IElementType NUMBER = new CrystalTokenType("number");
  IElementType OF = new CrystalTokenType("of");
  IElementType OR_EQUAL = new CrystalTokenType("|=");
  IElementType OR_OR = new CrystalTokenType("||");
  IElementType OR_OR_EQUAL = new CrystalTokenType("||=");
  IElementType PLUS = new CrystalTokenType("+");
  IElementType PLUS_EQUAL = new CrystalTokenType("+=");
  IElementType QUESTION = new CrystalTokenType("?");
  IElementType RAISE = new CrystalTokenType("raise");
  IElementType REQUIRE = new CrystalTokenType("require");
  IElementType RIGHT_BRACE = new CrystalTokenType("}");
  IElementType RIGHT_BRACKET = new CrystalTokenType("]");
  IElementType RIGHT_PARENTHESIS = new CrystalTokenType(")");
  IElementType SEMICOLON = new CrystalTokenType(";");
  IElementType STRING = new CrystalTokenType("string");
  IElementType SYMBOL = new CrystalTokenType("symbol");
  IElementType TILDE = new CrystalTokenType("~");
  IElementType TIMES = new CrystalTokenType("*");
  IElementType TIMES_EQUAL = new CrystalTokenType("*=");
  IElementType TIMES_TIMES = new CrystalTokenType("**");
  IElementType TIMES_TIMES_EQUAL = new CrystalTokenType("**=");
  IElementType TRUE = new CrystalTokenType("true");
  IElementType UNTIL = new CrystalTokenType("until");
  IElementType WHEN = new CrystalTokenType("when");
  IElementType YEILD = new CrystalTokenType("yield");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
