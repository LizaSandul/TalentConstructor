package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RequestTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();
    private RequestPage cap = new RequestPage();

    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";

    @Test
    public void addRequest() throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        //rp.clickCreateButton();
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void checkApplicationForWorkTest() throws Exception {
        super.loginUser("HR");
        mp.clickRecruiting();

        cap.startCreateApi();

        cap.enterName("programmer");
        cap.enterDate();
        cap.enterPriority();
        cap.enterQuantity("20");
        cap.enterReason("expansion of the department");
        cap.enterContractType();
        cap.enterSalary("800");
        cap.enterEmployees("no");
        cap.enterBusinessTrip("twice a week");
        cap.enterTimetable("5 day a week");
        cap.enterProbationPeriod("1 month");
        cap.enterResponsibilities("bug fixing");
        cap.enterCandidateType();
        cap.enterEducationSpecialization("technical");
        cap.enterPriorityWorkingExperience("IBA,EPAM");
        cap.enterUndesirableWorkingExperience("-");
        cap.setEditRequiredCompetence();
        cap.enterComment("urgently");

        Thread.sleep(5000);
        cap.saveApplication();
        Thread.sleep(5000);


        Assert.assertEquals("programmer - Конструктор Талантов", driver.getTitle());
    }

}
