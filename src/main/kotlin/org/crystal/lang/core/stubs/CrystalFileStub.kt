package org.crystal.lang.core.stubs

import com.intellij.psi.stubs.PsiFileStubImpl
import org.crystal.lang.core.psi.impl.CrystalFile

class CrystalFileStub(file: CrystalFile) : PsiFileStubImpl<CrystalFile>(file)