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

public class AppTest {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();
    private LoginPage lp = new LoginPage();
    private RequestPage rp = new RequestPage();

    public static final String ADAPTATION_PAGE = "Подбор и адаптация - Конструктор Талантов";
    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";

    public void Login() {
        lp.enterLoginPage();
        lp.typeUsername("kabanov@tc.by");
        lp.typePassword("welcome");
        lp.clickButton();
    }
    @Test
    public void clickAdaptation () throws InterruptedException {
        Login();
        mp.clickRecruiting();
        Thread.sleep(100000);
        Assert.assertEquals(ADAPTATION_PAGE, mp.getTitle());
    }

    @Test
    public void addRequest(){
        Login();
        mp.clickRecruiting();
        rp.clickCreateButton();
        Assert.assertEquals(REQUEST_PAGE,mp.getTitle());
    }

    @Test
    public void createRequest() throws InterruptedException {
        Login();
        mp.clickRecruiting();
        rp.clickCreateButton();

        WebElement position = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        position.sendKeys("Дизайнер");

        WebElement plannedClosingDate = driver.findElement(By.xpath("//*[@id=\"plannedClosingDate\"]"));
        plannedClosingDate.sendKeys("11.04.2018");

        WebElement priorityRadioBtn = driver.findElement(By.xpath("//*[@id=\"priority-1\"]"));
        priorityRadioBtn.click();

        WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
        quantity.sendKeys("2");

        WebElement creationReason = driver.findElement(By.xpath("//*[@id=\"creationReason\"]"));
        creationReason.sendKeys("НАМ НУЖНЫ ДИЗАЙНЕРЫ !");

        WebElement type = driver.findElement(By.xpath("//*[@id=\"contractType-2\"]"));
        type.click();

        WebElement salary = driver.findElement(By.xpath("//*[@id=\"salary\"]"));
        salary.sendKeys("500");

        WebElement employees = driver.findElement(By.xpath("//*[@id=\"employees\"]"));
        employees.sendKeys("Присутсвуют");

        WebElement businessTrip = driver.findElement(By.xpath("//*[@id=\"businessTrip\"]"));
        businessTrip.sendKeys("США, 3 месяца");

        WebElement timetable = driver.findElement(By.xpath("//*[@id=\"timetable\"]"));
        timetable.sendKeys("40 часов");

        WebElement probationPeriod = driver.findElement(By.xpath("//*[@id=\"probationPeriod\"]"));
        probationPeriod.sendKeys("2 месяца");

        WebElement responsibilities = driver.findElement(By.xpath("//*[@id=\"responsibilities\"]"));
        responsibilities.sendKeys("WORK HARD,  PLAY HARD");

        WebElement candidateType = driver.findElement(By.xpath("//*[@id=\"candidateTypeInternal\"]"));
        candidateType.click();

        WebElement educationSpecialization = driver.findElement(By.xpath("//*[@id=\"educationSpecialization\"]"));
        educationSpecialization.sendKeys("Студенты 3-4 курса приветствуются");

        WebElement priorityWorkingExperience = driver.findElement(By.xpath("//*[@id=\"priority.working.experience\"]"));
        priorityWorkingExperience.sendKeys("не имеет значения");

        WebElement undesirableWorkingExperience = driver.findElement(By.xpath("//*[@id=\"undesirableWorkingExperience\"]"));
        undesirableWorkingExperience.sendKeys("не имеет значения");

        WebElement editrequiredCompetence = driver.findElement(By.xpath("//*[@id=\"editrequiredCompetence\"]"));
        editrequiredCompetence.click();
        /*WebElement searchVompetenceField = driver.findElement(By.xpath("//*[@id=\"searchCompetenceWord\"]"));
        searchVompetenceField.sendKeys("Англ");
        driver.wait(10000);
        WebElement english = driver.findElement(By.xpath("//*[@id='competence_222']"));

        Actions action = new Actions(driver);
        action.doubleClick(english);
            action.perform();*/
        WebElement input = driver.findElement(By.xpath("//*[@id=\"searchCompetenceWord\"]"));
        input.sendKeys("Обучаемость");
        Thread.sleep(10000);
//        driver.wait(10000);
        WebElement addCompetence = driver.findElement(By.cssSelector("//*[contains(@class, 'icon-arrow-right')]\n"));
        addCompetence.click();
        //driver.wait(10000);
        WebElement okButton = driver.findElement(By.xpath("//*[@class='btn btn-primary-modal btn-primary-modal-content yui3-widget btn-content']"));
        okButton.click();

        WebElement saveButton = driver.findElement(By.xpath("//*[@id='save']"));
        saveButton.click();

        WebElement message = driver.findElement(By.xpath("//*[@id=\"successMessage\"]"));
        Assert.assertEquals("Заявка успешно сохранена",message.getText());
    }


    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }


    @After
    public void shutDown() {
        driver.close();
    }
}
