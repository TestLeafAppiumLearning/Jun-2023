package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnFirstCodeUsingWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "/apks/leaforg.apk");
        verifyAndInstallApp("com.testleaf.leaforg", "/apks/leaforg.apk");
        printContext();
        switchToAnotherApp("com.testleaf.leaforg");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "//android.widget.EditText[@text='Password']"), "Leaf@123");
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
    }

}
