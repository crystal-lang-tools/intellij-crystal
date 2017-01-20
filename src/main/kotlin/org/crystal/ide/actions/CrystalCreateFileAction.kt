package org.crystal.ide.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import org.crystal.ide.icons.CrystalIcons

class CrystalCreateFileAction :
        CreateFileFromTemplateAction(CAPTION, "", CrystalIcons.CRYSTAL_FILE), DumbAware {
    override fun getActionName(directory: PsiDirectory?, newName: String?, templateName: String?): String = CAPTION

    override fun buildDialog(project: Project?, directory: PsiDirectory?,
                             builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(CAPTION)
                .addKind("Empty File", CrystalIcons.CRYSTAL_FILE, "Crystal File")
    }

    private companion object {
        private val CAPTION = "New Crystal File"
    }
}