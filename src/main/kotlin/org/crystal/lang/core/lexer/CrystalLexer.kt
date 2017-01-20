package org.crystal.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import org.crystal.lang.core.parser._CrystalLexer

class CrystalLexer : FlexAdapter(_CrystalLexer())