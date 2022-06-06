package page;

import io.appium.java_client.MobileElement;

public class PageBase {

    protected void clickButton(MobileElement element) {
        element.click();
    }

}
