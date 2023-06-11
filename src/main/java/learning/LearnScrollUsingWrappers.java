package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnScrollUsingWrappers extends GenericWrappers {

    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "", "", "", "/apks/MultiTouch Tester_v1.2.apk");
        swipeUpInApp();
        swipeDownInApp();
        swipeLeftInApp();
        swipeRightInApp();
        pinchInApp();
        zoomInApp();
    }
}
