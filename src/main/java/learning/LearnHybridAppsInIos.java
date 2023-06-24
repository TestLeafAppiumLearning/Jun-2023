package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppsInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone Real Device", "", "", "com.example.apple-samplecode.UICatalog", "");
        swipeUpInApp();
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Web View"));
        sleep(5000);
        printContext();
        switchWebView();
        sleep(5000);
        click(getWebElement(Locators.ID.asString(), "globalnav-menutrigger-button"));
        sleep(2000);
        click(getWebElement(Locators.XPATH.asString(), "//a[contains(@href,'/ipad/') and @data-globalnav-item-name=\"ipad\"]"));
        sleep(5000);
        closeApp();


    }
}
