package org.crystal.lang.core.psi

import com.intellij.psi.tree.IElementType
import org.crystal.lang.CrystalLanguage

open class CrystalTokenType(name: String) : IElementType(name, CrystalLanguage) {
}

class CrystalKeywordTokenType(debugName: String) : CrystalTokenType(debugName)

class CrystalOperatorTokenType(debugName: String) : CrystalTokenType(debugName)