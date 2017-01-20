import com.intellij.ide.util.importProject.ModuleDescriptor
import com.intellij.ide.util.importProject.ProjectDescriptor
import com.intellij.ide.util.projectWizard.importSources.DetectedProjectRoot
import com.intellij.ide.util.projectWizard.importSources.DetectedSourceRoot
import com.intellij.ide.util.projectWizard.importSources.ProjectFromSourcesBuilder
import com.intellij.ide.util.projectWizard.importSources.ProjectStructureDetector
import org.crystal.ide.idea.CrystalModuleType
import java.io.File

class CrystalProjectStructureDetector : ProjectStructureDetector() {
    override fun detectRoots(dir: File, children: Array<out File>, base: File, result: MutableList<DetectedProjectRoot>): DirectoryProcessingResult {
        if (children.any { it.name == "shard.yml" }) {
            result.add(object : DetectedProjectRoot(dir) {
                override fun getRootTypeName(): String = "Crystal"
            })
        }

        return DirectoryProcessingResult.SKIP_CHILDREN
    }

    override fun setupProjectStructure(roots: MutableCollection<DetectedProjectRoot>, projectDescriptor: ProjectDescriptor, builder: ProjectFromSourcesBuilder) {
        val root = roots.singleOrNull()
        if (root == null || builder.hasRootsFromOtherDetectors(this) || projectDescriptor.modules.isNotEmpty()) {
            return
        }

        val moduleDescriptor = ModuleDescriptor(root.directory, CrystalModuleType.INSTANCE, emptyList<DetectedSourceRoot>())
        projectDescriptor.modules = listOf(moduleDescriptor)
    }
}