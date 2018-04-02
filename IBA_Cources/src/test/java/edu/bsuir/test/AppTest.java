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

    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }
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

   /* @Test
    public void createRequest() throws InterruptedException {
        Login();
        mp.clickRecruiting();
        rp.clickCreateButton();
 }*/


    @After
    public void shutDown() {
        driver.close();
    }
}
