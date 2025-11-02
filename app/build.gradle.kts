@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.google.tv.material.catalog"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.google.tv.material.catalog"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.foundation)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.activity.compose)
    implementation(libs.tv.foundation)
    implementation(libs.tv.material)
    implementation(libs.coil.compose)
    implementation(libs.navigation.compose)
    implementation("io.coil-kt:coil-compose:2.7.0")
    // Material 3 + ICONOS (esto habilita Icons.Filled/Outlined/Rounded)
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.material:material-icons-extended")

    // TV Compose (ya los tienes por catalog; NO agregues versiones sueltas)
    implementation(libs.tv.foundation)
    implementation(libs.tv.material)

    // Coil (elige UNA forma; me quedo con la del catalog)
    implementation(libs.coil.compose)
    // Si prefieres fijar versión, comenta la línea de arriba y usa solo:
    // implementation("io.coil-kt:coil-compose:2.7.0")

    // Media3
    implementation("androidx.media3:media3-exoplayer:1.4.1")
    implementation("androidx.media3:media3-ui:1.4.1")
    implementation("androidx.media3:media3-datasource:1.4.1")

    // Media3 (elige una versión estable y usa la MISMA en todos los artefactos)
    val media3 = "1.4.1" // o la que estés usando en el proyecto

    implementation("androidx.media3:media3-exoplayer:$media3")
    implementation("androidx.media3:media3-ui:$media3")
    implementation("androidx.media3:media3-session:$media3") // <- NECESARIA




}
