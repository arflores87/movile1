package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class BrowserStack implements  IDevice {

    public static String userName = "aldofloresmendoz1";
    public static String accessKey = "MtQ1aDsjRmqfEtGVp8sf";

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "UCB Deiplopmado");
        caps.setCapability("build", "V0.1");
        caps.setCapability("name", "Todo");
        caps.setCapability("app", "bs://3bbcf7fa9dfb4d57784f2e8fabb82d82ebdea0ca");

        AppiumDriver driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        return driver;
    }
}

