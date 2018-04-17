package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.general.Login;
import edu.bsuir.util.help.Helper;
import edu.bsuir.web.page.QuestionsPage;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static edu.bsuir.util.help.GeneratorMode.ALPHA;
import static edu.bsuir.util.help.Helper.closeBrowser;
import static edu.bsuir.util.help.Helper.generateRandomString;

public class QuestionTest extends Login {

    private WebDriver driver = WebDriverSingleton.getInstance();
    private QuestionsPage qp = new QuestionsPage();

    private static  final String SUCCESS_MESSAGE = "1";
    private static  final String ERROR_MESSAGE = "1";
    private static  final String INFO_MESSAGE = "1";
    private static  final String WARNING_MESSAGE = "1";
    private static  final String QUESTION = "1";
    private static  final String TITLE = "1";

    @Before
    public void init() throws Exception {
        driver = WebDriverSingleton.getInstance();
        super.loginUser("Question");
    }

    @Test
    @DisplayName("Создание вопросв")
    @Description("Создание персонального вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 1 – Положительный тест")
    @Severity(SeverityLevel.MINOR)
    public void createQuestion () throws InterruptedException {
        qp.enterPersonalQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.typeQuestion(generateRandomString(50,ALPHA));
        qp.typeAnswer(generateRandomString(20,ALPHA));
        qp.typeCompetence("MSSQL");
        qp.clickQuestionSave();
        Assert.assertEquals(SUCCESS_MESSAGE, qp.messageSuccess());
    }
    @Test
    @DisplayName("Создание вопросв")
    @Description("Создание вопроса без компетенции")
    @Feature("Вопросы")
    @Story("Сценарий 2 – Негативный тест")
    @Severity(SeverityLevel.MINOR)
    public void createQuestionWithoutCompetence () throws InterruptedException {
        qp.enterPersonalQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.typeQuestion(generateRandomString(50,ALPHA));
        qp.typeAnswer(generateRandomString(20,ALPHA));
        qp.clickQuestionSave();
        Assert.assertEquals(ERROR_MESSAGE, qp.messageError());
    }

    @Test
    @DisplayName("Создание вопросв")
    @Description("Создание вопроса без пункта вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 2 – Негативный тест")
    @Severity(SeverityLevel.MINOR)
    public void createQuestionWithputQuestion () throws InterruptedException {
        qp.enterPersonalQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.typeAnswer(generateRandomString(20,ALPHA));
        qp.typeCompetence("MSSQL");
        qp.clickQuestionSave();
        Assert.assertEquals(ERROR_MESSAGE, qp.messageError());
    }

    @Test
    @DisplayName("Создание вопросв")
    @Description("Создание вопроса без пункта вопроса  и компетенции, добавить компетенцию")
    @Feature("Вопросы")
    @Story("Сценарий 2 – Негативный тест")
    @Severity(SeverityLevel.MINOR)
    public void createNegativeQuestion () throws InterruptedException {
        qp.enterPersonalQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.typeAnswer(generateRandomString(20,ALPHA));
        qp.clickQuestionSave();
        qp.typeCompetence("MSSQL");
        qp.clickQuestionSave();
        Assert.assertEquals(ERROR_MESSAGE, qp.messageError());
    }

    @Test
    @DisplayName("Отмена вопроса")
    @Description("Отмена создания вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 3 – Отмена теста")
    @Severity(SeverityLevel.MINOR)
    public void typeCancelQuestion () throws InterruptedException {
        qp.enterPersonalQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.clickCancel();
        Assert.assertEquals(TITLE, qp.getTitle());
    }

    @Test
    @DisplayName("Создание вопроса")
    @Description("Создание вопроса для базы вопросов")
    @Feature("Вопросы")
    @Story("Сценарий 1 – Позитивный тест")
    @Severity(SeverityLevel.MINOR)
    public void createBaseQuestion () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.clickButtonAddQuestion();
        qp.typeQuestion(generateRandomString(20,ALPHA));
        qp.typeAnswer(generateRandomString(20,ALPHA));
        qp.typeCompetence("MSSQL");
        qp.clickQuestionSave();
        Assert.assertEquals(SUCCESS_MESSAGE, qp.messageSuccess());
    }
    @Test
    @DisplayName("Открыть вопрос")
    @Description("Нажать на название вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 4 – Определенный вопрос")
    @Severity(SeverityLevel.MINOR)
    public void clickFirstQuestion () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.clickQuestionFirst();
        Assert.assertEquals(TITLE, qp.getTitle());
    }

    @Test
    @DisplayName("Добавить вопрос в базу")
    @Description("Добавиьт вопрос в базу.Нажать на кнопку")
    @Feature("Вопросы")
    @Story("Сценарий 4 – Определенный вопрос")
    @Severity(SeverityLevel.MINOR)
    public void addQuestionToBase () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.clickQuestionFirst();
        qp.clickButtonAddToBaseQuestion();
        Assert.assertEquals(SUCCESS_MESSAGE, qp.messageSuccess());
    }

    @Test
    @DisplayName("Удалить вопрос из базы")
    @Description("Удалить вопрос из базы.Нажать на картинку")
    @Feature("Вопросы")
    @Story("Сценарий 4 – Определенный вопрос")
    @Severity(SeverityLevel.MINOR)
    public void removeQuestionToBase () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.clickQuestionFirstChange();
        Assert.assertEquals(SUCCESS_MESSAGE, qp.messageSuccess());
    }

    @Test
    @DisplayName("Проверка фильтра")
    @Description("Проверка фильтра и поиск вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 5 – Поиск вопроса")
    @Severity(SeverityLevel.MINOR)
    public void searchByFilter () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.selectCompetence(1);
        qp.selectAuthor(1);
        qp.checkPersonalQuestions();
        qp.checkQuestionsWithAnswer();
        //Проверить первый вопрос
    }

    @Test
    @DisplayName("Очистить фильтр")
    @Description("Ввести данные в фильтр и очистить")
    @Feature("Вопросы")
    @Story("Сценарий 5 – Поиск вопроса")
    @Severity(SeverityLevel.MINOR)
    public void clearFilter () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.selectCompetence(1);
        qp.selectAuthor(1);
        qp.checkPersonalQuestions();
        qp.checkQuestionsWithAnswer();
        qp.clickFilterClean();
        //проверить первый вопрос
    }

    @Test
    @DisplayName("Поиск вопроса")
    @Description("Поиск вопроса")
    @Feature("Вопросы")
    @Story("Сценарий 5 – Поиск вопроса")
    @Severity(SeverityLevel.MINOR)
    public void searchQuestion () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.searchQuestions(QUESTION);
        //Проверить первый вопрос
    }

    @Test
    @DisplayName("Переход по вкладкам")
    @Description("На базу и обратно")
    @Feature("Вопросы")
    @Story("Сценарий 6 – Вкладки вопросов")
    @Severity(SeverityLevel.MINOR)
    public void clickPages () throws InterruptedException {
        qp.enterBaseQuestionsPage();
        qp.clickButtonBaseQuestions();
        Assert.assertEquals(TITLE,qp.getTitle());
        qp.clickButtonPersonalQuestions();
        Assert.assertEquals(TITLE,qp.getTitle());
    }

    @After
    public void shutDown() throws IOException {
        closeBrowser();

    }
}
