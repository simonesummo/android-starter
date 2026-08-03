plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.detekt)
}

android {
    namespace = "it.ssummo.androidstarter"

    defaultConfig {
        applicationId = "it.ssummo.androidstarter"
        minSdk = 30
        targetSdk = 36
        compileSdk = 37
        versionCode = 1
        versionName = "1.0"

        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            optimization {
                enable = false
            }
        }
        release {
            optimization {
                enable = true
            }
        }
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.compose.material3)
    // Main
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    implementation(libs.androidx.navigation.compose)

    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    implementation(libs.koin.android)
    implementation(libs.koin.compose)
    implementation(libs.koin.compose.navigation)

    implementation(libs.kotlinx.coroutines.android)

    // Main - debug only
    debugImplementation(libs.androidx.ui.tooling)

    // Unit test
    testImplementation(libs.junit)

    // Instrumentation test
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
}

detekt {
    buildUponDefaultConfig = true
    config.setFrom("../config/detekt.yml")

    source.setFrom(
        "src/main/kotlin",
        "src/test/kotlin",
        "src/androidTest/kotlin"
    )
}

tasks.register("sanityCheck") {
    group = "verification"
    description = "Runs fast local quality checks."

    dependsOn(
        "compileDebugKotlin",
        "detekt",
        "lintDebug"
    )
}