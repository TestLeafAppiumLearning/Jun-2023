package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IOSFirstScript {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
//        dc.setCapability("deviceName", "iPhone 14");
        dc.setCapability("deviceName", "iPhone 14 Simulator");
        dc.setCapability("udid", "70BDED6E-B9EE-48DE-B44E-FAEC8BEC5A7C");
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
//        dc.setCapability("bundleId","com.example.apple-samplecode.UICatalog");
        dc.setCapability("automationName", "XCUITest");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        Thread.sleep(10000);
        driver.quit();

    }
}
