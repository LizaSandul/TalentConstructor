package edu.bsuir.web.element;

import edu.bsuir.element.Element;
import org.openqa.selenium.By;

public class QuestionsPageElement {

    public static final Element TITLE = new Element("Заголовок", By.xpath("//title"));

    public static final Element BUTTON_PERSONAL_QUESTION = new Element("Кнопка персональные вопросы", By.xpath("//div[@class='row-fluid']//a[contains(text(),'Персональные вопросы')]"));
    public static final Element BUTTON_BASE_QUESTIONS = new Element("Кнопка база вопросов", By.xpath("//div[@class='row-fluid']//a[contains(text(),'База вопросов')]"));

    public static final String URL_PERSONAL_QUESTION ="http://testing.cld.iba.by/web/guest/recruiting/questions/-/questions/personal#personalQuestions";
    public static final String URL_BASE_QUESTIONS ="http://testing.cld.iba.by/web/guest/recruiting/questions/-/questions/standard";

    public static final Element SEARCH_QUESTION = new Element("Поиск элемента", By.xpath("//input[@id='searchQuestion']"));
    public static final Element BUTTON_ADD_QUESTION = new Element("Кнопка добавления вопроса", By.xpath("//div//a[@id='addBtn']"));

    public static final Element QUESTION_1 = new Element("Первый вопрос", By.xpath("//div[contains(@class,'question-container') and (@id='1')]"));
    public static final Element QUESTION_1_CHANGE = new Element("Кнопка добавить первый вопрос в базу вопросов", By.xpath("//i[@questionid='1']"));

    public static final Element FILTER_CLEAN = new Element("Кнопка очистить фильтр", By.xpath("//div[@class='tc-filter-header']//a"));
    public static final Element SELECT_COMPETENCE = new Element("Выбрать компетенцию", By.xpath("//select[@name='competences']"));
    public static final Element SELECT_AUTHOR = new Element("Выбрать автора", By.xpath("//select[@name='authors']"));
    public static final Element CHECK_QUESTIONS_WITH_ANSWER = new Element("CheckBox только вопросы с ответами", By.xpath("//input[@name='haveAnswer']"));
    public static final Element CHECK_MY_PERSONAL_QUESTIONS = new Element("CheckBox только персональные вопросы", By.xpath("//input[@name='allPersonal']"));

    public static final Element BUTTON_SAVE_QUESTION = new Element("Кнопка сохранить вопрос", By.xpath("//a[@id='saveQuestionButton']"));
    public static final Element BUTTON_CANCEL_QUESTION = new Element("Кнопка отменить сохранение вопроса", By.xpath("//a[@id='cancelQuestionButton']"));

    public static final Element TYPE_QUESTION = new Element("Поле для ввода вопроса", By.xpath("//textarea[@id='questionText']"));
    public static final Element TYPE_ANSWER = new Element("Поле для ввода ответа", By.xpath("//textarea[@id='questionAnswer']"));
    public static final Element TYPE_COMPETENCE = new Element("Поле выбора компетенции", By.xpath("//div[@class='controls question-competencies']//input"));

    public static final Element MESSAGE_ERROR = new Element("Сообщение  ERROR", By.xpath("//div[@id='LSBTError']//div[@class='message']"));
    public static final Element MESSAGE_SUCCESS = new Element("Сообщение SUCCESS", By.xpath("//div[@id='LSBTSuccess']//div[@class='message']"));
    public static final Element MESSAGE_WARNING = new Element("Сообщение WARNING", By.xpath("//div[@id='LSBTWarning']//div[@class='message']"));
    public static final Element MESSAGE_INFO = new Element("Сообщение INFO", By.xpath("//div[@id='LSBTInfo']//div[@class='message']"));

    public static final Element BUTTON_ADD_BASE_QUESTION = new Element("Кнопка добавить вопрос для базы", By.xpath("//a[@id='addToStandardQuestionButton']"));


}
