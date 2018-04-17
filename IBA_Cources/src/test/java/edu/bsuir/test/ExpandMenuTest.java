package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
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

public class ExpandMenuTest extends Login{

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
    public void clickRecrutingPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickApplicationPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickVacanciesPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickCandidatePage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickQuestionsPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickTemplatePage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        //Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickOnBoardingPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        mp.clickMenu();
        Thread.sleep(1000);
        mp.clickCandidate();
        //Assert.assertEquals(CANDIDATE_PAGE, driver.getTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickReportPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickFunnelPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test

    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickDirectoryPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickModelPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickEmployeePage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickPositionPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        //Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickDivisionPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        mp.clickMenu();
        Thread.sleep(1000);
        mp.clickCandidate();
       // Assert.assertEquals(CANDIDATE_PAGE, driver.getTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickTemplatesPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickRoleAssigmentPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
      //  Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @After
    public void shutDown() throws IOException {
        closeBrowser();
    }
}
