package org.crystal.ide.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.crystal.ide.colors.CrystalColor
import org.crystal.lang.core.lexer.CrystalLexer
import org.crystal.lang.core.psi.CrystalKeywordTokenType
import org.crystal.lang.core.psi.CrystalOperatorTokenType
import org.crystal.lang.core.psi.CrystalTokenElementTypes.*

class CrystalHighlighter : SyntaxHighlighterBase() {
    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey> =
        pack(map(tokenType)?.textAttributesKey)

    override fun getHighlightingLexer(): Lexer = CrystalLexer()

    companion object {
        fun map(tokenType: IElementType?): CrystalColor? = when (tokenType) {
            LEFT_PARENTHESIS, RIGHT_PARENTHESIS     -> CrystalColor.PARENTHESIS
            LEFT_BRACE, RIGHT_BRACE                 -> CrystalColor.BRACES
            LEFT_BRACKET, RIGHT_BRACKET             -> CrystalColor.BRACKETS
            BRACKET                                 -> CrystalColor.BRACKET

            is CrystalKeywordTokenType              -> CrystalColor.KEYWORD
            is CrystalOperatorTokenType             -> CrystalColor.OPERATORS

            else                                    -> null
        }
    }
}