package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostAnAdPage extends PageBase{

    AndroidElement chooseCategoryList;
    AppiumDriver driver;

    AndroidElement whatYouAreSelling;

    public PostAnAdPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public void chooseCategoryList(WebDriverWait wait,Actions actions){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")));
        whatYouAreSelling = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")) ;
        wait.until(ExpectedConditions.textToBePresentInElement(whatYouAreSelling,"WHAT ARE YOU SELLING?"));
        chooseCategoryList = (AndroidElement) driver.findElement(By.id("com.forsale.forsale:id/chooseCategoryField"));
        actions.moveToElement(chooseCategoryList).click().build().perform();
    }
}
