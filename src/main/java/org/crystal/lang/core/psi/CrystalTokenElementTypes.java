package org.crystal.lang.core.psi;

public interface CrystalTokenElementTypes {
    
    // Keywords
    
    CrystalTokenType CASE = new CrystalKeywordTokenType("case");
    CrystalTokenType CLASS = new CrystalKeywordTokenType("class");
    CrystalTokenType DEF = new CrystalKeywordTokenType("def");
    CrystalTokenType DO = new CrystalKeywordTokenType("do");
    CrystalTokenType ELSE = new CrystalKeywordTokenType("else");
    CrystalTokenType END = new CrystalKeywordTokenType("end");
    CrystalTokenType IF = new CrystalKeywordTokenType("if");
    CrystalTokenType MODULE = new CrystalKeywordTokenType("module");
    CrystalTokenType NIL = new CrystalKeywordTokenType("nil");
    CrystalTokenType OF = new CrystalKeywordTokenType("of");
    CrystalTokenType REQUIRE = new CrystalKeywordTokenType("require");
    CrystalTokenType WHEN = new CrystalKeywordTokenType("when");
    CrystalTokenType YEILD = new CrystalKeywordTokenType("yield");
    CrystalTokenType UNTIL = new CrystalKeywordTokenType("until");
    CrystalTokenType ELSIF = new CrystalKeywordTokenType("elsif");
    CrystalTokenType TRUE = new CrystalKeywordTokenType("true");
    CrystalTokenType FALSE = new CrystalKeywordTokenType("false");
    CrystalTokenType RAISE = new CrystalKeywordTokenType("raise");
    
    // Grouping

    CrystalTokenType LEFT_BRACE = new CrystalTokenType("{");
    CrystalTokenType RIGHT_BRACE = new CrystalTokenType("}");
    CrystalTokenType LEFT_PARENTHESIS = new CrystalTokenType("(");
    CrystalTokenType RIGHT_PARENTHESIS = new CrystalTokenType(")");
    CrystalTokenType LEFT_BRACKET = new CrystalTokenType("[");
    CrystalTokenType RIGHT_BRACKET = new CrystalTokenType("]");
    CrystalTokenType BRACKET = new CrystalTokenType("|");
    
    // Operators
    
    
}
