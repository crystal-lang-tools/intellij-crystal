package org.crystal.ide.idea

import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.module.ModuleTypeManager
import org.crystal.ide.icons.CrystalIcons
import javax.swing.Icon

class CrystalModuleType : ModuleType<CrystalModuleBuilder>(ID) {
    override fun getName(): String = "Crystal"

    override fun getDescription(): String = "Crystal Module"

    override fun createModuleBuilder(): CrystalModuleBuilder = CrystalModuleBuilder()

    override fun getNodeIcon(isOpened: Boolean): Icon = CrystalIcons.CRYSTAL

    fun getBigIcon(): Icon = CrystalIcons.CRYSTAL_BIG

    companion object {
        private val ID = "CRYSTAL_MODULE"
        val INSTANCE: CrystalModuleType by lazy { ModuleTypeManager.getInstance().findByID(ID) as CrystalModuleType }
    }
}
