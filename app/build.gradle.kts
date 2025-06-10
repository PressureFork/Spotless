plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") // Only if you're using Kotlin
}

android {
    namespace = "com.pressurefork.spotless"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.pressurefork.spotless"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.activity:activity-ktx:1.8.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    // If using Compose Material3, also add:
    // implementation("androidx.compose.material3:material3:1.2.0")
    // ...other dependencies
}
