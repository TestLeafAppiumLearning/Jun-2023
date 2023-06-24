package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerWheelInIos extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone 14 Simulator", "70BDED6E-B9EE-48DE-B44E-FAEC8BEC5A7C", "", "com.example.apple-samplecode.UICatalog", "/apks/UiCatalog.zip");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"),"80");
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Green color component value"),"180");
//        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"),"200");
        swipeUpInAppWithWebElement(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        chooseNextOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Red color component value");
        choosePreviousOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value"));
        choosePreviousOptionInPickerWheel(Locators.ACCESSIBILITY_ID.asString(), "Blue color component value");
        sleep(5000);
        closeApp();


    }
}
