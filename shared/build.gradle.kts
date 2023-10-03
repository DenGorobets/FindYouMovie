plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")

}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }
    }

    sourceSets {
        val ktorVersion = "2.3.4"
        val voyagerVersion = "1.0.0-rc05"

        val commonMain by getting {
            dependencies {
                implementation("media.kamel:kamel-image:0.7.3")

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

                implementation("io.ktor:ktor-client-core:$ktorVersion")

                implementation("cafe.adriel.voyager:voyager-navigator:$voyagerVersion")
                implementation("cafe.adriel.voyager:voyager-koin:$voyagerVersion")
                implementation("cafe.adriel.voyager:voyager-androidx:$voyagerVersion")

                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.den.gorobets.findyoumovie"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_17
        sourceCompatibility = JavaVersion.VERSION_17
    }
}