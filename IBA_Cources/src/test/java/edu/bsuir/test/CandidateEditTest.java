package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.web.page.CandidatePage;
import edu.bsuir.web.page.ListofCandidatesPage;
import edu.bsuir.web.page.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static edu.bsuir.util.help.GeneratorMode.ALPHA;
import static edu.bsuir.util.help.GeneratorMode.ALPHANUMERIC;
import static edu.bsuir.util.help.GeneratorMode.NUMERIC;
import static edu.bsuir.util.help.Helper.generateRandomString;

public class CandidateEditTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();
    private CandidatePage cp = new CandidatePage();

    public static final String ERROR_MESSAGE = "Неверно введены контактные данные. Введите правильно адрес электронной почты или телефон";
    public static final String SUCCESS_MESSAGE = "Резюме было успешно сохранено";
    public static final String SAME_EMAIL_MESSAGE = "Кандидат с таким e-mail уже существует";


    @Before
    public void init() throws Exception {
        driver = WebDriverSingleton.getInstance();
        super.loginUser("HR");
    }

    @Test
    public void createCandidate () throws InterruptedException {
        cp.enterPage();
        cp.typeSurname(generateRandomString(11,ALPHA));
        cp.typeName(generateRandomString(8,ALPHA));
        cp.typeSecondName(generateRandomString(15,ALPHA));
        cp.typePhone(generateRandomString(7,NUMERIC));
        //cp.typeEmail("121@mail.ru");
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");
       /* cp.clickTabEducation();
        cp.clickButtonAddEducation();
        cp.typeUniversity(generateRandomString(10,ALPHA));
        cp.typeFaculty(generateRandomString(10,ALPHA));
        cp.typeSpecialization(generateRandomString(10,ALPHA));
        cp.selectStartEducation(2000);
        cp.selectEndEducation(2004);

        cp.clickTabExpirence();
        cp.clickButtonAddExpirence();
        cp.typePosition(generateRandomString(10,ALPHA));
        cp.typeCompany(generateRandomString(10,ALPHA));
        cp.selectStartMonthJob(10);
        cp.selectStartYearJob(2000);
        cp.clickInJobNow();

        cp.clickTabRecomendation();
        cp.clickButtonAddREcomendation();
        cp.typeRecomendPosition(generateRandomString(10,ALPHA));
        cp.typeRecomndCompany(generateRandomString(10,ALPHA));
        cp.typeRecomndPhone(generateRandomString(10,NUMERIC));
*/
        cp.clickButtonCreate();
        Thread.sleep(10000);
        Assert.assertEquals(SUCCESS_MESSAGE, cp.getSuccessMessage());
    }

    @Test
    public void createEmptyCandidate () throws InterruptedException {
        cp.enterPage();
        cp.clickButtonCreate();
        Assert.assertEquals(ERROR_MESSAGE, cp.getMessageError());
    }

    @Test
    public void creatCandidateWithSameEmail () throws InterruptedException {
        cp.enterPage();
        cp.typeSurname(generateRandomString(11,ALPHA));
        String email = generateRandomString(8,ALPHANUMERIC);
        cp.typeName(generateRandomString(8,ALPHA));
        cp.typeSecondName(generateRandomString(15,ALPHA));
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(email+"@mail.ru");
        cp.clickButtonCreate();

        cp.enterPage();
        cp.typeSurname(generateRandomString(11,ALPHA));
        cp.typeName(generateRandomString(8,ALPHA));
        cp.typeSecondName(generateRandomString(15,ALPHA));
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(email+"@mail.ru");
        cp.clickButtonCreate();

        Assert.assertEquals(SAME_EMAIL_MESSAGE, cp.getMessageError());
    }


    @Test
    public void creatCandidateWithSameFullName () throws InterruptedException {
        cp.enterPage();
        String surname = generateRandomString(8,ALPHA);

        cp.typeSurname(surname);
        cp.typeName(surname);
        cp.typeSecondName(surname);
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");
        cp.clickButtonCreate();

        cp.enterPage();
        cp.typeSurname(surname);
        cp.typeName(surname);
        cp.typeSecondName(surname);
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");
        cp.clickButtonCreate();

        Assert.assertEquals(SUCCESS_MESSAGE, cp.getSuccessMessage());
    }
/*
    @Test
    public void createCandidateOnlyNecessary () throws InterruptedException {
        lcp.enterPage();
        lcp.clickCreateCandidate();

        // Assert.assertEquals(, driver.getTitle());
    }
*/
    @Test
    public void addPhoto () throws InterruptedException {
        cp.enterPage();
        cp.enterCandidatePage();
        cp.clickButtonEdit();
        Thread.sleep(1000);
        cp.clickPhotoAdd();

Thread.sleep(10000);
        // Assert.assertEquals(, driver.getTitle());
    }
/*
    @Test
    public void addPhotobyClickPhoto () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void loadSV () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickPhoto () throws InterruptedException {
       cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void addComment () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void deleteComment () throws InterruptedException {
       cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void editComment () throws InterruptedException {
       cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickEditCandidate () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void deleteCandidate () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void ExportCantitdateSVtoPDF () throws InterruptedException {
       cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkGoToBack () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkEditCandidate () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void checkclickPhoto () throws InterruptedException {
        cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

    @Test
    public void clickAttachFile () throws InterruptedException {
       cp.enterPage();

        // Assert.assertEquals(, driver.getTitle());
    }

*/
    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
