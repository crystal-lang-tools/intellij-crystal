package org.crystal.ide.idea

import com.intellij.ide.util.projectWizard.ModuleBuilder
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.roots.ModifiableRootModel

class CrystalModuleBuilder : ModuleBuilder() {
    override fun getModuleType(): ModuleType<*> = CrystalModuleType.INSTANCE

    override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {}
}