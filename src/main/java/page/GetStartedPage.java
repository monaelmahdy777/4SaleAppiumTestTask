package page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetStartedPage extends PageBase{
    AndroidElement getStartedButton;
    AppiumDriver driver;
    public GetStartedPage(AppiumDriver driver) {
        this.driver=driver;
    }

    public void getStarted(WebDriverWait wait){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("com.forsale.forsale:id/btnEnter"))));
        getStartedButton = (AndroidElement) driver.findElement(By.id("com.forsale.forsale:id/btnEnter"));
        wait.until(ExpectedConditions.textToBePresentInElement(getStartedButton,"Get Started"));
        clickButton(getStartedButton);
    }
}
