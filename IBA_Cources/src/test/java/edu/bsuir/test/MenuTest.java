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

public class MenuTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();

    private MainPage mp = new MainPage();

    public static final String ADAPTATION_PAGE = "Подбор и адаптация - Конструктор Талантов";

    @Before
    public void init(){
        driver = WebDriverSingleton.getInstance();
    }

    @Test
    public void clickAdaptation () throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        Assert.assertEquals(ADAPTATION_PAGE, mp.getTitle());
    }

    @After
    public void shutDown() {
        driver.close();
    }
}
