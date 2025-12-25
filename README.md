Appium Android Automation
Overview
This repository contains a native Android test automation framework built using Appium (Java) and UiAutomator2.
The framework is designed to validate end-to-end mobile application flows with an emphasis on stability, maintainability, and CI readiness.
Project Scope
Native Android automation only
Page Object Model (POM) based design
Accessibility-first locator strategy
Suitable for emulator and physical device execution
Automation Architecture
Appium Server for mobile automation
UiAutomator2 driver for Android
Page Object Model to separate test logic from UI interactions
Centralized driver lifecycle management
Locator Strategy
Primary: accessibilityId
Secondary: resource-id
XPath avoided to reduce flakiness and improve performance
Tech Stack
Appium
Java
TestNG
Maven
Android Emulator / Physical Device
Project Structure
src/
 ├── main/
 │   └── pages/        # Screen-level abstractions
 └── test/
     └── tests/        # Test scenarios
Prerequisites
Java installed
Node.js & npm
Appium server
Android Studio (emulator) or physical Android device
Android SDK configured
Running the Tests
Start Appium
appium
Execute Tests
mvn clean test
Desired capabilities can be configured for emulator or real device execution.
CI/CD Readiness
Framework supports headless emulator execution
Deterministic setup and teardown
Designed for repeatable execution in CI pipelines
Key Principle
Stable mobile automation depends on disciplined locator choices and clean architecture.
This project focuses on reliability over quick wins or brittle scripts.
