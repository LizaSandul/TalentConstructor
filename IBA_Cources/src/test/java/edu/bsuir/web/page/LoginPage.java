package edu.bsuir.web.page;

import com.sun.org.apache.bcel.internal.generic.Select;
import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }

    public void typeUsername(String username){
        LoginElements.USERNAME.type(username);
    }
/*
    public void selectDummyByValue(String value) {
        Select select = new Select(LoginElements.DUMMY_SELECT.getWebElement());
        select.selectByValue(value);
    }*/

    public void typePassword(String password){
        LoginElements.PASSWORD.type(password);
    }

    public void checkRememberMe(){
        LoginElements.REMEMBER_ME.click();
    }

    public void clickButton(){
        LoginElements.LOGIN_BUTTON.click();
    }

    public String error(){
       return LoginElements.ERROR_INVALID_DATA.getText();
    }

    public String loginError(){
        return LoginElements.ERROR_LOGIN.getText();
    }

    public String passwordError(){
        return LoginElements.ERROR_PASSWORD.getText();
    }

    public String getLogName() {
        return LoginElements.LOGNAME.getText();
    }

}
