plugins {
    kotlin("multiplatform") version "1.7.20"
    id("maven-publish")
}

group = "com.jamesward"
version = "0.0.1"

repositories {
    mavenCentral()
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
}
