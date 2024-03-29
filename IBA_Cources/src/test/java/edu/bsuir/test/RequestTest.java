package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static edu.bsuir.util.help.Helper.closeBrowser;

public class RequestTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();
    private RequestPage cap = new RequestPage();

    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";
    public static final String NEW_REQUST_PAGE = "programmer - Конструктор Талантов";

    public static final String ROLE = "HR";
    public static final String NAME = "Programmer";
    public static final String QUANTITY = "20";
    public static final String REASON = "Expansion of the department";
    public static final String SALARY = "800";
    public static final String EMLOYEE = "No";
    public static final String BUSINESS_TRIP = "Twice a week";
    public static final String TIMETABLE = "5 day a week";
    public static final String PROBATATION_PERIOD = "1 month";
    public static final String RESPONSABILITY = "Bug fixing";
    public static final String SPECIALIZATION = "Technical";
    public static final String WORKING_EXPIRIENCE = "IBA";
    public static final String COMMENT = "Urgently";


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
    public void searchRequst() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void searchRequstWithSpace() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void searchRequstWithSpaceBetweenLetters() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void searchRequstWithWrongLetters() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void filterRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void clickRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void createNewRequst() throws Exception {
        mp.clickRecruiting();
        cap.startCreateApi();

        cap.enterName(NAME);
        cap.enterDate();
        cap.enterPriority();
        cap.enterQuantity(QUANTITY);
        cap.enterReason(REASON);
        cap.enterContractType();
        cap.enterSalary(SALARY);
        cap.enterEmployees(EMLOYEE);
        cap.enterBusinessTrip(BUSINESS_TRIP);
        cap.enterTimetable(TIMETABLE);
        cap.enterProbationPeriod(PROBATATION_PERIOD);
        cap.enterResponsibilities(RESPONSABILITY);
        cap.enterCandidateType();
        cap.enterEducationSpecialization(SPECIALIZATION);
        cap.enterPriorityWorkingExperience(WORKING_EXPIRIENCE);
        cap.enterUndesirableWorkingExperience("-");
        cap.setEditRequiredCompetence();
        cap.enterComment(COMMENT);

        Thread.sleep(5000);
        cap.saveApplication();
        Thread.sleep(5000);

        Assert.assertEquals(NEW_REQUST_PAGE, driver.getTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkNewRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkNegativeRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void editRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void deleteRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void sendToAgreementRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void sendToArchiveRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void createVacancyFromRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    @DisplayName("Ввод логина и пароля")
    @Description("Неравильные логин и пароль")
    @Feature("Вход")
    @Story("Сценарий 5 – Негативный тест")
    @Severity(SeverityLevel.BLOCKER)
    public void checkProtocolRequest() throws InterruptedException {
        mp.clickRecruiting();
        cap.startCreateApi();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @After
    public void shutDown() throws IOException {
        closeBrowser();
    }

}
