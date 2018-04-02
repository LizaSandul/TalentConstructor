package edu.bsuir.web.element;

import edu.bsuir.driver.WebDriverSingleton;
import org.openqa.selenium.By;

public class LoginElements {

    public static final String URL = "http://testing.cld.iba.by/";
    public static final By USERNAME = By.xpath("//*[@id=\"_58_login\"]");
    public static final By PASSWORD = By.xpath("//*[@id=\"_58_password\"]");
    public static final By LOGIN_BUTTON = By.xpath("//button[@class='btn btn-primary']");
    public static final By REMEMBER_ME = By.xpath("//input[@id=\"_58_rememberMeCheckbox\"]");

    public static final By LOGNAME = By.xpath("//a[@class='signed-in']");
    public static final By ERROR_LOGIN =By.xpath("//div[./input[@id='_58_login']]/div[@class='form-validator-stack help-inline']/div");
    public static final By ERROR_PASSWORD =By.xpath("//div[./input[@id='_58_password']]/div[@class='form-validator-stack help-inline']/div");
    public static final By ERROR_INVALID_DATA =By.xpath("//div[@class='portlet-body']/div[@class='alert alert-error']");


    public static final By getLogin(String name)
    {
        return By.xpath("//button[text()=' " + name + " ']");
    }
}
