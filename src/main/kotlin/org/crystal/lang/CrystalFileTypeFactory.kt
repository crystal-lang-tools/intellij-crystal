package org.crystal.lang

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory

class CrystalFileTypeFactory : FileTypeFactory() {

    override fun createFileTypes(consumer : FileTypeConsumer) {
        consumer.consume(CrystalFileType, CrystalFileType.DEFAULTS.EXTENSION)
    }

}