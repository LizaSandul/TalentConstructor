package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
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

import static org.junit.Assert.assertEquals;

public class MenuTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();

    public static final String ADAPTATION_PAGE = "Подбор и адаптация - Конструктор Талантов";
    public static final String CANDIDATE_PAGE = "Кандидаты - Конструктор Талантов";

    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }

    @Test
    public void clickAdaptationPage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        Assert.assertEquals(ADAPTATION_PAGE, driver.getTitle());
    }

    @Test
    public void clickCandidatePage () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        mp.clickMenu();
        Thread.sleep(1000);
        mp.clickCandidate();
        Assert.assertEquals(CANDIDATE_PAGE, driver.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
    }
}
