plugins {
    kotlin("jvm")
    application
}

tasks {
    test {
        useJUnitPlatform()
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}


application {
    mainClass.set("com.jolley71717.MainKt")
}

dependencies {
    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.8.2"))
        testImplementation("org.junit.jupiter:junit-jupiter")
    }
}