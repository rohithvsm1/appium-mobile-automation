package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ApiDemosPage {

    private final AndroidDriver driver;

    public ApiDemosPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void openViews() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
    }

    public void openControls() {
        driver.findElement(AppiumBy.accessibilityId("Controls")).click();
    }

    public boolean isLightThemeOptionVisible() {
        return driver
                .findElement(By.xpath("//*[@text='1. Light Theme']"))
                .isDisplayed();
    }
}
