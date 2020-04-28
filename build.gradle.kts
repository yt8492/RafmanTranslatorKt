plugins {
    kotlin("js") version "1.3.72"
}

group =  "com.yt8492"
version = "1.0.0"

repositories {
    jcenter()
    mavenCentral()
    maven("http://dl.bintray.com/kotlin/kotlin-js-wrappers")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:16.13.0-pre.97-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-react-dom:16.13.0-pre.97-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-css:1.0.0-pre.103-kotlin-1.3.72")
    implementation("org.jetbrains:kotlin-styled:1.0.0-pre.103-kotlin-1.3.72")
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.1")
    implementation(npm("react", "16.13.0"))
    implementation(npm("react-dom", "16.13.0"))
    implementation(npm("inline-style-prefixer"))
    implementation(npm("styled-components"))
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

val browserWebpack = tasks.getByName("browserProductionWebpack")

val copyDistributions by tasks.registering {
    doLast {
        copy {
            val destinationDir = File("$rootDir/public")
            if (!destinationDir.exists()) {
                destinationDir.mkdir()
            }
            val distributions = File("$buildDir/distributions/")
            from(distributions)
            into(destinationDir)
        }
    }
}

browserWebpack.finalizedBy(copyDistributions)