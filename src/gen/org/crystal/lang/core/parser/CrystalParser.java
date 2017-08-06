// This is a generated file. Not intended for manual editing.
package org.crystal.lang.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.crystal.lang.core.psi.CrystalCompositeElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CrystalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b, 0);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return root(b, l + 1);
  }

  /* ********************************************************** */
  // NIL
  //                     | TRUE
  //                     | FALSE
  //                     | number
  //                     | char
  //                     | string
  //                     | symbol
  static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NIL);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, SYMBOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // literal *
  static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    int c = current_position_(b);
    while (true) {
      if (!literal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "root", c)) break;
      c = current_position_(b);
    }
    return true;
  }

}
