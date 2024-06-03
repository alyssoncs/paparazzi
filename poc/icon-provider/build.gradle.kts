plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.plugin.compose")
}

android {
  namespace = "app.cash.paparazzi.iconprovider"

  compileSdk = libs.versions.compileSdk.get().toInt()
  defaultConfig {
    minSdk = libs.versions.minSdk.get().toInt()
  }
  compileOptions {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.javaTarget.get())
    targetCompatibility = JavaVersion.toVersion(libs.versions.javaTarget.get())
  }
  buildFeatures {
    compose = true
  }
}

dependencies {
  api(libs.androidx.appcompat)
  api(libs.composeUi.material)
}
