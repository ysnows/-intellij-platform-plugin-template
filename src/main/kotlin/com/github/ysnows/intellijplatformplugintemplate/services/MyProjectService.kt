package com.github.ysnows.intellijplatformplugintemplate.services

import com.github.ysnows.intellijplatformplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
