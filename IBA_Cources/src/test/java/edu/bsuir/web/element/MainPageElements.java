package edu.bsuir.web.element;

import org.openqa.selenium.By;

public class MainPageElements {

    public static final By HEAD_IMAGE = By.xpath("div[@id=\"heading\"]");

    public static final By LOGOUT = By.xpath("//a[@href='/c/portal/logout']");
    //сделать через layout

    public static final By PROFILE = By.xpath("//a[contains(@href,'home/profile')]");
    public static final By RECRUITING = By.xpath("//a[@aria-labelledby=\"layout_2\"]");

    public static final By APPLICATIONS = By.xpath("//a[contains(@href,'recruiting/applications')]");
    public static final By VACANCIES = By.xpath("//a[contains(@href,'recruiting/vacancies')]");
    public static final By CANDIDATES = By.xpath("//a[contains(@href,'recruiting/candidates')]");
    public static final By QUESTIONS = By.xpath("//a[contains(@href,'recruiting/questions')]");
    public static final By TEMPALATE = By.xpath("//a[contains(@href,'recruiting/templates')]");
    public static final By ON_BOARDING = By.xpath("//a[contains(@href,'recruiting/onboarding')]");
    public static final By REPORTS = By.xpath("//a[contains(@href,'recruiting/reports')]");
    public static final By FUNNEL = By.xpath("//a[contains(@href,'recruiting/funnel')]");

    public static final By DIRECTORY = By.xpath("//a[contains(@href,'directories')]");

    public static final By MODEL = By.xpath("//a[contains(@href,'directories/model')]");
    public static final By EMPLOYEES = By.xpath("//a[contains(@href,'directories/employees')]");
    public static final By POSITION = By.xpath("//a[contains(@href,'directories/positions')]");
    public static final By DIVISION = By.xpath("//a[contains(@href,'directories/divisions')]");

    public static final By TEMPLATES = By.xpath("//a[contains(@href,'bpm/templates')]");
    public static final By ROLESASSIGNMENT = By.xpath("//a[contains(@href,'rolesassignment')]");

    public static final By USERNAME = By.xpath("//a[@class='signed-in']");

}
