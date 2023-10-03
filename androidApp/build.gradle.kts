plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    kotlin("android")
}

android {
    namespace = "com.den.gorobets.findyoumovie.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.den.gorobets.findyoumovie.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    val ktorVersion = "2.3.4"
    val voyagerVersion = "1.0.0-rc05"

    implementation(project(":shared"))
    implementation("androidx.compose.ui:ui:1.5.2")
    implementation("androidx.compose.ui:ui-tooling:1.5.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.2")
    implementation("androidx.compose.foundation:foundation:1.5.2")
    implementation("androidx.compose.material:material:1.5.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("io.ktor:ktor-client-okhttp:$ktorVersion")

//    implementation("cafe.adriel.voyager:voyager-navigator:$voyagerVersion")
//    implementation("cafe.adriel.voyager:voyager-koin:$voyagerVersion")
//    implementation("cafe.adriel.voyager:voyager-androidx:$voyagerVersion")
}