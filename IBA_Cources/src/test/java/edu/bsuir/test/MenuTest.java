package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.LoginPage;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static edu.bsuir.util.help.Helper.closeBrowser;
import static org.junit.Assert.assertEquals;

public class MenuTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();

    public static final String ROLE = "HR";
    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";
    public static final String NEW_REQUST_PAGE = "programmer - Конструктор Талантов";

    @Before
    public void init() throws InterruptedException {
        driver = WebDriverSingleton.getInstance();
        super.loginUser(ROLE);
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickImageTC() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickExpandMenu() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickNotification() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickAddNotification() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickCalendar() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickSettings() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickSettingsUser() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickSettingsPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickHelp() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickExit() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @After
    public void shutDown() throws IOException {
        closeBrowser();
    }
}
