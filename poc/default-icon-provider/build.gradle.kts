plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "app.cash.paparazzi.defaulticonprovider"

  compileSdk = libs.versions.compileSdk.get().toInt()
  defaultConfig {
    minSdk = libs.versions.minSdk.get().toInt()
  }
  compileOptions {
    sourceCompatibility = JavaVersion.toVersion(libs.versions.javaTarget.get())
    targetCompatibility = JavaVersion.toVersion(libs.versions.javaTarget.get())
  }
}

dependencies {
  api(libs.androidx.appcompat)
  api(project(":poc:icon-provider"))
}
