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
        }
    }
}