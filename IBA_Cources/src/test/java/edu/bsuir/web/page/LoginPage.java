package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();
    @Step
    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }
    @Step
    public void typeUsername(String username){
        LoginElements.USERNAME.type(username);
    }
    @Step
    public void typePassword(String password){
        LoginElements.PASSWORD.type(password);
    }

    public void checkRememberMe(){
        LoginElements.REMEMBER_ME.click();
    }
    @Step
    public void clickButton(){
        LoginElements.LOGIN_BUTTON.click();
    }
    @Step
    public String error(){
       return LoginElements.ERROR_INVALID_DATA.getText();
    }
    @Step
    public String loginError(){
        return LoginElements.ERROR_LOGIN.getText();
    }
    @Step
    public String passwordError(){
        return LoginElements.ERROR_PASSWORD.getText();
    }
    @Step
    public String getLogName() {
        return LoginElements.LOGNAME.getText();
    }

    public void selectDummyByValue(String value) {
        Select select = new Select(LoginElements.DUMMY_SELECT.getWebElement());
        select.selectByValue(value);
    }

}
