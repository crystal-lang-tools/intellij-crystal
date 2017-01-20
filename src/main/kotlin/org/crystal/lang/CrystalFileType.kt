package org.crystal.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import org.crystal.ide.icons.CrystalIcons
import javax.swing.Icon

object CrystalFileType : LanguageFileType(CrystalLanguage) {

    object DEFAULTS {
        val EXTENSION: String = "cr"
    }

    override fun getIcon(): Icon? = CrystalIcons.CRYSTAL_FILE

    override fun getName(): String = "Crystal"

    override fun getDefaultExtension(): String = DEFAULTS.EXTENSION

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "Crystal Files"

}