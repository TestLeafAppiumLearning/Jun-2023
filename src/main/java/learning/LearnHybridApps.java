package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "/apks/leaforg.apk");
        printContext();
        switchContext("WEBVIEW_com.testleaf.leaforg");
        enterValue(getWebElement(Locators.TAG_NAME.asString(), "input"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "(//input)[2]"), "Leaf@123");
        click(getWebElement(Locators.XPATH.asString(), "//button[@type='submit']"));
        sleep(10000);
        closeApp();
    }
}
