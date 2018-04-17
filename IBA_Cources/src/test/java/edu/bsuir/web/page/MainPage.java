package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import edu.bsuir.web.element.MainPageElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver = WebDriverSingleton.getInstance();
    @Step
    public void clickProfile() {
         MainPageElements.PROFILE.click();
    }
    public void clickDirectory() {
        MainPageElements.DIRECTORY.click();
    }
    @Step
    public void clickRecruiting() {
        MainPageElements.RECRUITING.click();
    }
    @Step
    public void clickExit() {
        MainPageElements.LOGOUT.click();
    }
    @Step
    public String getPageTitle() {
      return  MainPageElements.TITLE.getText();
    }
    @Step
    public void clickCandidate(){
        MainPageElements.CANDIDATES.click();
    }
    @Step
    public void clickMenu(){
        MainPageElements.MENU.click();
    }

}
