package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Parser;
import edu.bsuir.general.User;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.LoginPage;
import edu.bsuir.web.page.MainPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static edu.bsuir.util.help.Helper.closeBrowser;

public class LoginTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private LoginPage lp = new LoginPage();
    private MainPage mp = new MainPage();

    public static final String ERROR_MESSAGE = "Ваш запрос завершился с ошибкой.";
    public static final String LENINA_PAGE = "Алёна Валентиновна Ленина";
    public static final String KABANOV_PAGE = "Александр Евгеньевич Кабанов";
    public static final String REQUIRED_MESSAGE = "Это обязательное поле.";

    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Правильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 1 – Позитивный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkLogin() throws InterruptedException {
        super.loginUser("HR");
        Assert.assertEquals(KABANOV_PAGE, lp.getLogName());
    }

    @Test
    @DisplayName("Ввод логина и пароля и нажатие кнопки назад")
    @Description("Проверка сохранения данных на странице")
    @Feature("Вход")
    @Story("Сценарий 2 – Позитивный тест")
    @Severity(SeverityLevel.MINOR)
    public void checkloginBack() throws InterruptedException {
        super.loginUser("HR");
        driver.navigate().back();
        Assert.assertEquals(LENINA_PAGE, lp.getLogName());
    }

    @Test
    @DisplayName("Ввод,выход и кнопка вперед")
    @Description("Проверка удаления данных со странице поселе выхода")
    @Feature("Вход")
    @Story("Сценарий 3 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checklogOutBack() throws InterruptedException {
        super.loginUser("HR");
        mp.clickExit();
        driver.navigate().back();
        Assert.assertNotEquals(LENINA_PAGE, lp.getLogName());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неправильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 4 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkNegativeLogin()  {
        lp.enterLoginPage();
        lp.typeUsername("lenin@tc.by");
        lp.typePassword("welcome1");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkNnegativePassword()  {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome1");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Пустой логин")
    @Feature("Вход")
    @Story("Сценарий 6 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckEmptyUsername() {
        lp.enterLoginPage();
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(REQUIRED_MESSAGE, lp.loginError());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Пустой пароль")
    @Feature("Вход")
    @Story("Сценарий 7 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckEmptyPassword() {
        lp.enterLoginPage();
        lp.typeUsername("lenin@tc.by");
        lp.clickButton();
        Assert.assertEquals(REQUIRED_MESSAGE, lp.passwordError());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description(" регистры в логине")
    @Feature("Вход")
    @Story("Сценарий 8 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckUsernameCaseSensitivity() {
        lp.enterLoginPage();
        lp.typeUsername("KABANOV@TC.BY");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Разные регистры пароля")
    @Feature("Вход")
    @Story("Сценарий 10 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckPasswordCaseSensitivity() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("WELCOME");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 11 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckUsernameWithDifferentCase() {
        lp.enterLoginPage();
        lp.typeUsername("KaBaNoV@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 12 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckScriptAtLogin() {
        lp.enterLoginPage();
        lp.typeUsername("<script>alert(123)</script>");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckScriptAtPassword() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("<script>alert(123)</script>");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckLoginEndsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by    ");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckLoginStartsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("    lenina@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckPasswordEndsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("welcome    ");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckPasswordStartsWithSpace() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("    welcome");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckPasswordDifferentCase() {
        lp.enterLoginPage();
        lp.typeUsername("lenina@tc.by");
        lp.typePassword("wElCoMe");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void сheckChangeOfPlacesOfLoginAndPassword() {
        lp.enterLoginPage();
        lp.typeUsername("welcome");
        lp.typePassword("lenina@tc.by");
        lp.clickButton();
        Assert.assertEquals(ERROR_MESSAGE, lp.error());
    }

    @After
    public  void shutDown() throws IOException {
        closeBrowser();
    }
}
