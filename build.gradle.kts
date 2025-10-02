plugins {
    kotlin("multiplatform") version "1.9.10"
    id("org.jetbrains.compose") version "1.5.10"
}

group = "org.blkcrk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

//dependencies {
//    implementation(compose.html.core)
//    implementation(compose.runtime)
//    testImplementation(kotlin("jsTest"))
//}

kotlin {
    js(IR) {
        browser {
            @Suppress("DEPRECATION")
            commonWebpackConfig() {
                outputFileName = "output.js"
                cssSupport() {
                    enabled = true
            }
        }
            binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(compose.runtime)
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
}

