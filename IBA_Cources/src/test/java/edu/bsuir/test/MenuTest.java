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

    public static final String ROLE = "HR";
    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";
    public static final String NEW_REQUST_PAGE = "programmer - Конструктор Талантов";

    @Before
    public void init() throws InterruptedException {
        driver = WebDriverSingleton.getInstance();
        super.loginUser(ROLE);
    }

    @Test
    public void clickImageTC() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickExpandMenu() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickNotification() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickAddNotification() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickCalendar() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickSettings() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickSettingsUser() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickSettingsPage() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickHelp() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @Test
    public void clickExit() throws InterruptedException {
        Assert.assertEquals(REQUEST_PAGE,mp.getPageTitle());
    }

    @After
    public void shutDown() {
        driver.close();
        WebDriverSingleton.destroyInstance();
    }
}
