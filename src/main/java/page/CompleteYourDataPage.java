package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class CompleteYourDataPage extends PageBase{
    AndroidElement nextButton;

    AndroidElement listing;
    AppiumDriver driver;

    AndroidElement errorValidation;
    public CompleteYourDataPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void clickNextWithoutFillData(WebDriverWait wait){
        listing = (AndroidElement) driver.findElement(By.id("com.forsale.forsale:id/chooseDistrictTitle"));
        wait.until(ExpectedConditions.textToBePresentInElement(listing,"WHERE IS YOUR LISTING?"));
        nextButton = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View"));
        nextButton.click();
    }
}
