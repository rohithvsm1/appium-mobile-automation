package tests;

import base.BaseMobileTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ApiDemosPage;

import java.time.Duration;

public class SubscriptionStatusTest extends BaseMobileTest {

    @Test
    public void apiDemosNavigationWorks() throws InterruptedException {

        // Keep implicit wait modest for demo stability
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        ApiDemosPage apiDemos = new ApiDemosPage(driver);

        System.out.println("Launching ApiDemos application...");
        Thread.sleep(2000); // allow app to fully render

        System.out.println("Navigating to Views screen");
        apiDemos.openViews();
        Thread.sleep(1500);

        System.out.println("Opening Controls section");
        apiDemos.openControls();
        Thread.sleep(1000);

        System.out.println("Validating presence of Light Theme option");
        boolean isLightThemeVisible = apiDemos.isLightThemeOptionVisible();

        Assert.assertTrue(
                isLightThemeVisible,
                "Light Theme option should be visible under Controls"
        );

        System.out.println("Navigation flow validated successfully");
    }
}
