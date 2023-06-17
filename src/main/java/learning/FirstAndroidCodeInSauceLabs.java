package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

public class FirstAndroidCodeInSauceLabs {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:app", "storage:filename=MultiTouch Tester_v1.2.apk");  // The filename of the mobile app
        caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
        caps.setCapability("appium:deviceOrientation", "portrait");
        caps.setCapability("appium:platformVersion", "13.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        caps.setCapability("appiumVersion", "2.0.0-beta66");
        sauceOptions.setCapability("username", "oauth-appiummar2023-ff8b7");
        sauceOptions.setCapability("accessKey", "cfbd906b-fe3a-4ae9-b1b8-c82f97466f75");
        sauceOptions.setCapability("build", "<your build id>");
        sauceOptions.setCapability("name", "<your test name>");
        caps.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        int maxY = driver.manage().window().getSize().getHeight();
        int maxX = driver.manage().window().getSize().getWidth();
        //Swipe up
        int startX = (int) (maxX * 0.5);
        int startY = (int) (maxY * 0.8);
        int endX = (int) (maxX * 0.5);
        int endY = (int) (maxY * 0.2);

        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger 1");
        Sequence swipeUp = new Sequence(input, 1);
        swipeUp.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUp.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUp.addAction(input.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        swipeUp.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeUp));
        //swipe down
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "finger 2");
        Sequence swipeDown = new Sequence(input1, 1);
        swipeDown.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), endX, endY));
        swipeDown.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeDown.addAction(input1.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), startX, startY));
        swipeDown.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeDown));

        //Both swipe up and Down together
        driver.perform(Arrays.asList(swipeUp, swipeDown));

        Thread.sleep(10000);
        driver.quit();
    }
}
