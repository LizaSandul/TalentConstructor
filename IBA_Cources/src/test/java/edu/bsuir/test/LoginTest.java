package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.page.LoginPage;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private LoginPage lp = new LoginPage();
    private MainPage mp = new MainPage();
    private RequestPage rp = new RequestPage();

    public static final String ERROR_MESSAGE = "Ваш запрос завершился с ошибкой.";
    public static final String LENINA_PAGE = "Алёна Валентиновна Ленина";
    public static final String REQUIRED_MESSAGE = "Это обязательное поле.";

    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }

    public void Login() {
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
    }

    @Test
    public void checklogin(){
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(LENINA_PAGE, lp.getLogName());
    }

    @Test
    public void checkloginBack(){
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        driver.navigate().back();
        Assert.assertEquals(LENINA_PAGE, lp.getLogName());
    }

    @Test
    public void checklogOutBack(){
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        mp.clickExit();
        driver.navigate().back();
        Assert.assertNotEquals(LENINA_PAGE, lp.getLogName());
    }

    @Test
    public void checkRememberMe()  {

        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome");
        lp.checkRememberMe();
        lp.clickButton();
        //закрыть вкладку
        lp.enterLoginPage();
        Assert.assertEquals(LENINA_PAGE, lp.getLogName());

    }

    @Test
    public void negativeLogin()  {
        lp.enterLoginPage();
        lp.typeUsername("lenin@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void negativePassword()  {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome1");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckEmptyUsername() {
        lp.enterLoginPage();
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(REQUIRED_MESSAGE, lp.loginError());
    }

    @Test
    public void сheckEmptyPassword() {
        lp.enterLoginPage();
        lp.typeUsername("lenin@tc.by");
        lp.clickButton();
        Assert.assertEquals(REQUIRED_MESSAGE, lp.passwordError());
    }

    @Test
    public void сheckUsernameCaseSensitivity() {
        lp.enterLoginPage();
        lp.typeUsername("KABANOV@TC.BY");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckPasswordCaseSensitivity() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("WELCOME");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckUsernameWithDifferentCase() {
        lp.enterLoginPage();
        lp.typeUsername("KaBaNoV@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckScriptAtLogin() {
        lp.enterLoginPage();
        lp.typeUsername("<script>alert(123)</script>");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckScriptAtPassword() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("<script>alert(123)</script>");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }


    @Test
    public void сheckLoginEndsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by    ");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckLoginStartsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("    lenina@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }


    @Test
    public void сheckPasswordEndsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome    ");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckPasswordStartsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("    welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckPasswordDifferentCase() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("wElCoMe");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    public void сheckChangeOfPlacesOfLoginAndPassword() {
        lp.enterLoginPage();
        lp.typeUsername("welcome");
        lp.typePassword("lenina@tc.by");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @After
    public  void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
