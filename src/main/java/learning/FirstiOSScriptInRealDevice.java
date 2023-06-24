package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class FirstiOSScriptInRealDevice extends GenericWrappers {
    @Test
    public void runCode() {
        launchIosApp("iPhone SE", "ef3d080ab7588f92911b1204e05028d81aaf9587", "", "com.example.apple-samplecode.UICatalog", "");
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
