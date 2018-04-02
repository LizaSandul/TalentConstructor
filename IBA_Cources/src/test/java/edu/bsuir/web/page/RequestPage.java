package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.MainPageElements;
import edu.bsuir.web.element.RequestElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void clickCreateButton() {
        WebElement element = driver.findElement(RequestElements.CREATE_BUTTON);
        element.click();
    }
}
