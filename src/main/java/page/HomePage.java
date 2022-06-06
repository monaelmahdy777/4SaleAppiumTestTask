package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

    AndroidElement postAnAdButton;
    AndroidElement commercialAd;
    AppiumDriver driver;

    public HomePage(AppiumDriver driver) {
        this.driver=driver;
    }
    public void postAd(WebDriverWait wait){
        postAnAdButton = (AndroidElement)driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Post an Ad\"]")) ;
        commercialAd = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView"));
         wait.until(ExpectedConditions.textToBePresentInElement(commercialAd,"Commercial ads"));
       postAnAdButton.click();
    }
}
