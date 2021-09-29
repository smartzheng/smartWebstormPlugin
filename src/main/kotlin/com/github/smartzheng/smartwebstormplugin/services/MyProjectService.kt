package com.github.smartzheng.smartwebstormplugin.services

import com.intellij.openapi.project.Project
import com.github.smartzheng.smartwebstormplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
