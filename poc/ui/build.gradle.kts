plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.plugin.compose")
  id("app.cash.paparazzi")
}

android {
  namespace = "app.cash.paparazzi.ui"

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
  implementation(libs.composeUi.material)
  implementation("androidx.compose.ui:ui-tooling-preview")
  implementation(project(":poc:icon-provider"))

  debugImplementation(project(":poc:default-icon-provider"))
  debugImplementation(libs.composeUi.uiTooling)

  testRuntimeOnly(project(":poc:default-icon-provider"))
}
