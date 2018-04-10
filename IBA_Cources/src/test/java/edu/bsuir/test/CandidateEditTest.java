package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.util.help.Helper;
import edu.bsuir.web.page.CandidatePage;
import edu.bsuir.web.page.ListofCandidatesPage;
import edu.bsuir.web.page.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.nio.file.Path;
import java.nio.file.Paths;

import static edu.bsuir.util.help.GeneratorMode.ALPHA;
import static edu.bsuir.util.help.GeneratorMode.ALPHANUMERIC;
import static edu.bsuir.util.help.GeneratorMode.NUMERIC;
import static edu.bsuir.util.help.Helper.*;

public class CandidateEditTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();
    private CandidatePage cp = new CandidatePage();

    public static final String ERROR_MESSAGE = "Неверно введены контактные данные. Введите правильно адрес электронной почты или телефон";
    public static final String SUCCESS_MESSAGE = "Резюме было успешно сохранено";
    public static final String SAME_EMAIL_MESSAGE = "Кандидат с таким e-mail уже существует";
    public static final String CANDIDATE_LIST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";
    public static final String SUCCESS_DELETE = "Профиль кандидата был успешно удален из системы";
    public static final String NO_AVATAR = "http://testing.cld.iba.by/TC-RecruitingAndOnboarding-portlet/common/css/images/no-avatar.jpg";
    public static final String PHOTO = "resources/human.png";
    public static final String SV = "resources/SV.doc";
    public static final String SV_NAME = "SV.doc";

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
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");

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

    @Test
    public void createCandidateAll() throws InterruptedException {
        cp.enterPage();
        cp.typeSurname(generateRandomString(11,ALPHA));
        cp.typeName(generateRandomString(8,ALPHA));
        cp.typeSecondName(generateRandomString(15,ALPHA));
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");
        cp.clickTabEducation();
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

        cp.clickButtonCreate();
        Thread.sleep(10000);
        Assert.assertEquals(SUCCESS_MESSAGE, cp.getSuccessMessage());
    }

    @Test
    public void addPhotoByClickPhoto () throws Exception {
        cp.enterPage();
        cp.clickToAddPhoto(getAbsolutePath(PHOTO));
        Assert.assertNotEquals(cp.checkPhoto("src"), NO_AVATAR);
    }

    @Test
    public void addPhotoByClickText() {
        cp.enterPage();
        cp.clickButtonPhoto();
        sendFile(getAbsolutePath(PHOTO));
        Assert.assertNotEquals(cp.checkPhoto("src"), NO_AVATAR);
    }


    @Test
    public void loadSV () throws InterruptedException {
        cp.enterPage();
        cp.clickButtonloadSV();
        cp.clickLoadSvOk();
        sendFile(getAbsolutePath(SV));
        Assert.assertNotNull(cp.checkResume());
    }

    @Test
    public void clickAttachFile () throws InterruptedException {
        cp.enterPage();
        cp.clickAttachFile();
        sendFile(getAbsolutePath(SV));
        Assert.assertEquals(cp.checkAttachFile(), SV_NAME);
    }

    @Test
    public void deleteCandidate () throws InterruptedException {
        cp.enterPage();
        cp.typeSurname(generateRandomString(11,ALPHA));
        cp.typeName(generateRandomString(8,ALPHA));
        cp.typeSecondName(generateRandomString(15,ALPHA));
        cp.typePhone(generateRandomString(7,NUMERIC));
        cp.typeEmail(generateRandomString(7,NUMERIC)+"@mail.ru");

        cp.clickDeleteCandidate();
        cp.clickDeleteCandidateOk();
        Assert.assertEquals(SUCCESS_DELETE,cp.getSuccessMessage());
    }

    @Test
    public void checkGoToBack () throws InterruptedException {
        cp.enterPage();
        cp.clickBackToList();
        Assert.assertEquals(CANDIDATE_LIST_PAGE, driver.getTitle());
    }

    @Test
    public void checkEditCandidate () throws InterruptedException {
        cp.enterCandidatePage();
        cp.clickButtonEdit();
        cp.typeSkype(generateRandomString(8,ALPHANUMERIC));
        cp.clickButtonCreate();
        Assert.assertEquals(SUCCESS_MESSAGE, cp.getSuccessMessage());
    }


    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
