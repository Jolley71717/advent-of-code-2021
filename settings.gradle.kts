pluginManagement {
    repositories {
        gradlePluginPortal()
    }
    plugins {
            kotlin("jvm") version "1.5.10"
    }
}
rootProject.name = "AdventOfCode2021"

include(":day1")
include(":day2")