plugins {
    kotlin("multiplatform") version "1.7.20"
}

repositories {
    mavenCentral()
    mavenLocal()
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

    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("com.jamesward:kmpgh:0.0.1")
            }
        }
    }

}
