package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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
    public void clickRecrutingPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickApplicationPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickVacanciesPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickCandidatePage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickQuestionsPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickTemplatePage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        //Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @Test
    public void clickOnBoardingPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        mp.clickMenu();
        Thread.sleep(1000);
        mp.clickCandidate();
        //Assert.assertEquals(CANDIDATE_PAGE, driver.getTitle());
    }

    @Test
    public void clickReportPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickFunnelPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickDirectoryPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickModelPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickEmployeePage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickPositionPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        //Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @Test
    public void clickDivisionPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        mp.clickMenu();
        Thread.sleep(1000);
        mp.clickCandidate();
       // Assert.assertEquals(CANDIDATE_PAGE, driver.getTitle());
    }

    @Test
    public void clickTemplatesPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickRoleAssigmentPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
      //  Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
