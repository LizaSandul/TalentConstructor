package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterLoginPage(){
        driver.get(LoginElements.URL);
    }

    public void typeUsername(String username){
        WebElement element = driver.findElement(LoginElements.USERNAME);
        element.clear();
        element.sendKeys(username);
    }

    public void typePassword(String password){
        WebElement element = driver.findElement(LoginElements.PASSWORD);
        element.clear();
        element.sendKeys(password);
    }

    public void checkRememberMe(){
        WebElement element = driver.findElement(LoginElements.REMEMBER_ME);
        element.click();
    }

    public void clickButton(){
        WebElement element = driver.findElement(LoginElements.LOGIN_BUTTON);
        element.click();
    }

    public String error(){
        WebElement error = driver.findElement(LoginElements.ERROR_INVALID_DATA);
        return error.getText();

    }

    public String loginError(){
        WebElement error = driver.findElement(LoginElements.ERROR_LOGIN);
        return error.getText();

    }

    public String passwordError(){
        WebElement error = driver.findElement(LoginElements.ERROR_PASSWORD);
        return error.getText();

    }

    public String getLogName() {
        WebElement name = driver.findElement(LoginElements.LOGNAME);
        return name.getText();

    }

}
