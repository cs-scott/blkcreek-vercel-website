plugins {
    kotlin("js") version "1.9.10"
    id("org.jetbrains.compose") version "1.5.10"
}

group = "org.blkcrk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(compose.web.core)
    implementation(compose.runtime)
    testImplementation(kotlin("test"))
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                outputFileName = "output.js"
            }
        }
        binaries.executable()
    }
}