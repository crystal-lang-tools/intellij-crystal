package org.crystal.ide.colors

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import org.crystal.ide.highlight.CrystalHighlighter
import org.crystal.ide.icons.CrystalIcons
import javax.swing.Icon

class CrystalColorSettingsPage : ColorSettingsPage {
    private val ATTRS = CrystalColor.values().map { it.attributesDescriptor }.toTypedArray()

    // This tags should be kept in sync with RustHighlightingAnnotator highlighting logic
    // TODO: Figure out how to namespace menu elements a la
    //       https://github.com/JetBrains/kotlin/blob/8b30e7ef4e48494ba245b441a5b23142f1d6ae33/idea/idea-analysis/src/org/jetbrains/kotlin/idea/KotlinBundle.properties
    private val ANNOTATOR_TAGS = CrystalColor.values().associateBy({ it.name }, { it.textAttributesKey })

    override fun getDisplayName(): String = "Crystal"
    override fun getIcon(): Icon? = CrystalIcons.CRYSTAL
    override fun getAttributeDescriptors(): Array<out AttributesDescriptor> = ATTRS
    override fun getColorDescriptors(): Array<out ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
    override fun getHighlighter(): SyntaxHighlighter = CrystalHighlighter()
    override fun getAdditionalHighlightingTagToDescriptorMap() = ANNOTATOR_TAGS
    override fun getDemoText(): String = """
        # A very basic HTTP server
        require "http/server"

        server = HTTP::Server.new(8080) do |context|
            context.response.content_type = "text/plain"
            context.response.print "Hello world, got #{context.request.path}!"
        end

        puts "Listening on http://127.0.0.1:8080"
        server.listen
    """
}