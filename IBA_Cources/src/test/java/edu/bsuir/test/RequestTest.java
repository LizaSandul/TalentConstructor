package edu.bsuir.test;

import edu.bsuir.general.Login;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import org.junit.Assert;
import org.junit.Test;

import static edu.bsuir.test.MenuTest.REQUEST_PAGE;

public class RequestTest extends Login {

    private MainPage mp = new MainPage();
    private RequestPage rp = new RequestPage();

    public static final String REQUEST_PAGE = "Создание заявки на подбор персонала - Конструктор Талантов";

    @Test
    public void addRequest() throws InterruptedException {
        super.loginUser("HR");
        mp.clickRecruiting();
        rp.clickCreateButton();
        Assert.assertEquals(REQUEST_PAGE,mp.getTitle());
    }
}
