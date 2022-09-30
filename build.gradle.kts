plugins {
    kotlin("multiplatform") version "1.7.20"
}

repositories {
    mavenCentral()
    maven("https://jamesward.github.io/kmpgh/")
}

kotlin {
    jvm {

    }

    js(IR) {
        browser()
    }

    iosArm64 {
        binaries.framework {
            baseName = "Kmpgh"
        }
    }

    linuxX64 {
        binaries {
            executable(listOf(DEBUG, RELEASE)) {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.jamesward:kmpgh:0.0.1")
            }
        }
    }

}
