plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.callumwong.chronomiawatchface"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.callumwong.chronomiawatchface"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            // TODO:Add your signingConfig here to build release builds
            isMinifyEnabled = true
            isShrinkResources = false

            signingConfig = signingConfigs.getByName("debug")
        }
    }
}
