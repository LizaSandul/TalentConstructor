package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void clickProfile() {
        WebElement element = driver.findElement(MainPageElements.PROFILE);
        element.click();
    }
    public void clickRecruiting() {
        WebElement element = driver.findElement(MainPageElements.RECRUITING);
        element.click();
    }
    public void clickDirectory() {
        WebElement element = driver.findElement(MainPageElements.DIRECTORY);
        element.click();
    }

    public void clickExit() {
        WebElement element = driver.findElement(MainPageElements.LOGOUT);
        element.click();
    }

    public String getTitle() {
        WebElement name = driver.findElement(MainPageElements.TITLE);
        return name.getText();
    }

}
