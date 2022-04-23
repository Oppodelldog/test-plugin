package com.github.oppodelldog.testplugin.services

import com.intellij.openapi.project.Project
import com.github.oppodelldog.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
