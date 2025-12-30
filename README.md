🤖 Appium Android Demo
Native + Hybrid Android automation (API 28-35)

🎯 DEMO PURPOSE
Mobile billing flows with WebView + native integration

🛠 IMPLEMENTATION STEPS

# 1. Setup Android Emulator
sdkmanager "platform-tools" "platforms;android-35" "emulator"

avdmanager create avd -n test -k "system-images;android-35;google_apis;x86_64"

# 2. Appium Setup
npm i @appium/appium@2.6.0

appium driver install uiautomator2

# 3. Run Tests
npx appium

npm run test:android

# 4. Desired Capabilities (appium.config.js)
{

  "platformName": "Android",
  
  "appium:deviceName": "emulator-5554",
  
  "appium:automationName": "UiAutomator2"
  
}

🔥 TECHNICAL FEATURES

✅ UIAutomator2 + Espresso hybrid

✅ ADB logcat integration

✅ Biometric auth flows

✅ Offline/online sync

✅ 28 native scenarios
