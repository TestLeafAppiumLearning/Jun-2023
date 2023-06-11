package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnAndroidWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("sdgf", "com.testleaf.leaforg", "com.testleaf.leaforg.MainActivity", "", "/apks/leaforg.apk");
        showNotificationMenu();
        sleep(3000);
        hideNotificationMenu();
        dataOffInAndroid();
        sleep(5000);
        dataOnInAndroid();
        System.out.println(getCurrentActivity());
        System.out.println(getCurrentAppPackage());
        closeApp();
    }
}
