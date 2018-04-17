package edu.bsuir.general;

import edu.bsuir.web.page.LoginPage;
import edu.bsuir.web.page.MainPage;
import edu.bsuir.web.page.RequestPage;
import io.qameta.allure.Step;
import org.junit.Assert;

public abstract class Login {

    private LoginPage lp = new LoginPage();
    Parser parser = new Parser();

    @Step
    public void loginUser(String role) throws InterruptedException {
        User user = parser.ParserXml(role);
        lp.enterLoginPage();
        lp.typeUsername(user.getLogin());
        lp.typePassword(user.getPassword());
        lp.clickButton();
    }
}
