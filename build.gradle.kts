plugins {
    kotlin("js") version "1.3.61"
}

group =  "com.yt8492"
version = "1.0.0"

repositories {
    jcenter()
    mavenCentral()
    maven("http://dl.bintray.com/kotlin/kotlin-js-wrappers")
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin {
    target {
        browser {
            webpackTask {
                outputFileName = "main.js"
            }
            runTask {
                outputFileName = "main.js"
            }
        }
    }
}

tasks.register<Copy>("copyDistributions") {
    val destinationDir = File("$rootDir/public")
    if (!destinationDir.exists()) {
        destinationDir.mkdir()
    }
    val resources = File("$rootDir/src/main/resources/").listFiles() ?: arrayOf()
    val distributions = File("$buildDir/distributions/").listFiles() ?: arrayOf()
    from(*resources, *distributions)
    into(destinationDir)
}

if (project.hasProperty("browserWebpack")) {
    tasks.getByName("browserWebpack").finalizedBy("copyDistributions")
}