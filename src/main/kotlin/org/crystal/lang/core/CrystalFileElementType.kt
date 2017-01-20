package org.crystal.lang.core

import com.intellij.psi.tree.IStubFileElementType
import org.crystal.lang.CrystalLanguage
import org.crystal.lang.core.stubs.CrystalFileStub

object CrystalFileElementType : IStubFileElementType<CrystalFileStub>(CrystalLanguage)