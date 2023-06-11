package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

public class LearnPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "sdfdg");
        dc.setCapability("app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
        dc.setCapability("noReset", true);
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
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
