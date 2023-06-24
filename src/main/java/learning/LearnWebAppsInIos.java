package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchSafariBrowser("dsfg", "http://www.google.com", "");
        printContext();
        enterValue(getWebElement(Locators.NAME.asString(), "q"), "Lokesh Kumar");
        sleep(2000);
        click(getWebElement(Locators.NAME.asString(), "q"));
        clickGivenKeyboardButtonInIosByName("Go");
        sleep(10000);
        closeApp();
    }
}
