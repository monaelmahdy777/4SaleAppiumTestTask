package test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class PostAnAdWithoutFillDataTest extends TestBase{

    Actions actions;

    @Test
    public void postAdWithoutData() throws InterruptedException {
        actions = new Actions(driver);
        GetStartedPage getStartedPage = new GetStartedPage(driver);
        getStartedPage.getStarted(longWait);

        HomePage homePage = new HomePage(driver);
        homePage.postAd(longWait);

        PostAnAdPage postAnAdPage = new PostAnAdPage(driver);
        postAnAdPage.chooseCategoryList(longWait,actions);

        ChooseCategoryPage chooseCategoryPage = new ChooseCategoryPage(driver);
        chooseCategoryPage.chooseCategory(longWait);

        CompleteYourDataPage completeYourDataPage = new CompleteYourDataPage(driver);
        completeYourDataPage.clickNextWithoutFillData(shortWait);
        Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.Toast")).getText().equalsIgnoreCase("Kindly Fill all the required information!"));
    }
}
