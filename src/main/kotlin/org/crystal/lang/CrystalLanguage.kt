package org.crystal.lang

import com.intellij.lang.Language

object CrystalLanguage : Language("crystal", "text/x-crystal") {
    override fun getDisplayName() = "Crystal"
}