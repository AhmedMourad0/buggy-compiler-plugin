package dev.ahmedmourad.buggy.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class BuggyGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.extensions.create("PLUGIN_NAME", BuggyGradleExtension::class.java)
    }
}

open class BuggyGradleExtension
