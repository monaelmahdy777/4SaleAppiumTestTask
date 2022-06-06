package test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    AppiumDriver driver;
    protected WebDriverWait longWait;
    protected WebDriverWait shortWait;
    public static final long LONG_WAIT = 90;
    public static final long SHORT_WAIT = 30;


    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("app",System.getProperty("user.dir")+"/apps/4Sale_20.6.0_apkcombo.com.apk");
        capabilities.setCapability("autoGrantPermissions",true);
        driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
        longWait = new WebDriverWait(driver, LONG_WAIT);
        shortWait = new WebDriverWait(driver, SHORT_WAIT);
    }

    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
}
