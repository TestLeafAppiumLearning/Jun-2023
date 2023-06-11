package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnSwitchBetweenApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "/apks/leaforg.apk");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "//android.widget.EditText[@text='Password']"), "Leaf@123");
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        switchToAnotherApp("com.the511plus.MultiTouchTester");
        swipeUpInApp();
//    stopRunningApp("com.testleaf.leaforg");
//    switchToAnotherApp("com.testleaf.leaforg");
        startAnAppUsingActivity("com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity");
        sleep(10000);
        closeApp();
    }

}
