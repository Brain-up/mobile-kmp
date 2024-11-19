# Compose Multiplatform Application

### Overview
This application is designed to evaluate the feasibility of rapid development for multiplatform applications. It leverages RelayFigma for the user interface and a Swagger-generated OpenAPI Ktor client for the backend.

### Features
Multiplatform Support: Develop once, deploy across multiple platforms.
UI Design with RelayFigma: Seamless integration with Figma for efficient UI design and updates.
Backend Integration: Utilizes a Swagger-generated OpenAPI Ktor client for robust backend communication.

### Technologies Used

* RelayFigma: A tool for integrating Figma designs directly into your application.
* Swagger: Used to generate the OpenAPI client for Ktor, ensuring consistent and reliable backend communication.
* Ktor: A framework for building asynchronous servers and clients in connected systems.

## Before running!
 - check your system with [KDoctor](https://github.com/Kotlin/kdoctor)
 - install JDK 17 or higher on your machine
 - add `local.properties` file to the project root and set a path to Android SDK there

### Android
To run the application on android device/emulator:  
 - open project in Android Studio and run imported android run configuration

To build the application bundle:
 - run `./gradlew :composeApp:assembleDebug`
 - find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`
Run android UI tests on the connected device: `./gradlew :composeApp:connectedDebugAndroidTest`

### Desktop
Run the desktop application: `./gradlew :composeApp:run`
Run desktop UI tests: `./gradlew :composeApp:jvmTest`

### iOS
To run the application on iPhone device/simulator:
 - Open `iosApp/iosApp.xcproject` in Xcode and run standard configuration
 - Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio
Run iOS simulator UI tests: `./gradlew :composeApp:iosSimulatorArm64Test`

### JS Browser (Experimental)
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun --continue`
Run browser UI tests: `./gradlew :composeApp:jsBrowserTest`

