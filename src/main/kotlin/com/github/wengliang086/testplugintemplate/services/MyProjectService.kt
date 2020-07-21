package com.github.wengliang086.testplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.wengliang086.testplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
