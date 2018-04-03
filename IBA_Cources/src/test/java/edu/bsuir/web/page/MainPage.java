package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void clickProfile() {
         MainPageElements.PROFILE.click();
    }
    public void clickDirectory() {
        MainPageElements.DIRECTORY.click();
    }

    public void clickRecruiting() {
        MainPageElements.RECRUITING.click();
    }

    public void clickExit() {
        MainPageElements.LOGOUT.click();
    }

    public String getTitle() {
      return  MainPageElements.TITLE.getText();
    }


}
