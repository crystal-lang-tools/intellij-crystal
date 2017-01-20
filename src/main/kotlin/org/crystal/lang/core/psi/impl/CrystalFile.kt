package org.crystal.lang.core.psi.impl

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.crystal.lang.CrystalFileType
import org.crystal.lang.CrystalLanguage

class CrystalFile(fileViewProvider: FileViewProvider) : PsiFileBase(fileViewProvider, CrystalLanguage) {
    override fun getFileType(): FileType = CrystalFileType
}