package org.crystal.ide.colors

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor

enum class CrystalColor(humanName: String, val default: TextAttributesKey) {
    CHAR        ("Char",            DefaultLanguageHighlighterColors.STRING),
    STRING      ("String",          DefaultLanguageHighlighterColors.STRING),
    NUMBER      ("Number",          DefaultLanguageHighlighterColors.NUMBER),

    KEYWORD     ("Keyword",         DefaultLanguageHighlighterColors.KEYWORD),

    PARENTHESIS ("Parenthesis",     DefaultLanguageHighlighterColors.PARENTHESES),
    BRACKETS    ("Brackets",        DefaultLanguageHighlighterColors.BRACKETS),
    BRACES      ("Braces",          DefaultLanguageHighlighterColors.BRACES),
    BRACKET     ("Bracket",         DefaultLanguageHighlighterColors.BRACKETS),

    OPERATORS   ("Operator sign",   DefaultLanguageHighlighterColors.OPERATION_SIGN),
    ;

    val textAttributesKey = TextAttributesKey.createTextAttributesKey("org.crystal.$name", default)
    val attributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
}