package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class LoginElements {

    public static final String URL = "http://testing.cld.iba.by/";
    public static final Element USERNAME = new Element("Поле логина", By.xpath("//*[@id=\"_58_login\"]"));
    public static final Element PASSWORD = new Element("Поле пароля",By.xpath("//*[@id=\"_58_password\"]"));
    public static final Element LOGIN_BUTTON = new Element("Кнопка входа", By.xpath("//button[@class='btn btn-primary']"));
    public static final Element REMEMBER_ME = new Element("CheckBox Запомнить",By.xpath("//input[@id=\"_58_rememberMeCheckbox\"]"));

    public static final Element LOGNAME = new Element("Имя входа",By.xpath("//a[@class='signed-in']"));
    public static final Element ERROR_LOGIN =new Element("Оповещение ошибка логина",By.xpath("//div[./input[@id='_58_login']]/div[@class='form-validator-stack help-inline']/div"));
    public static final Element ERROR_PASSWORD =new Element("Оповещение ошибка пароля",By.xpath("//div[./input[@id='_58_password']]/div[@class='form-validator-stack help-inline']/div"));
    public static final Element ERROR_INVALID_DATA =new Element("Оповещение не валидные значения",By.xpath("//div[@class='portlet-body']/div[@class='alert alert-error']"));

    public static final Element DUMMY_SELECT = new Element("Пример выпадающего списка",
            By.xpath("//input[@class='123']"));

    public static final By getLogin(String name)
    {
        return By.xpath("//button[text()=' " + name + " ']");
    }
}
