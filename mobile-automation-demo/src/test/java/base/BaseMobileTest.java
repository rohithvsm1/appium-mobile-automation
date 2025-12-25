package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseMobileTest {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setAutomationName("UiAutomator2")
                .setApp("/Users/rohithvsm/ApiDemos-debug.apk");

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
