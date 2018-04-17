package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.CandidatePageElement;
import edu.bsuir.web.element.ListofCandidatesPageElements;
import edu.bsuir.web.element.QuestionsPageElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class QuestionsPage
{
    WebDriver driver =  WebDriverSingleton.getInstance();

    @Step
    public void enterPersonalQuestionsPage(){
        driver.get(QuestionsPageElement.URL_PERSONAL_QUESTION);
    }
    @Step
    public void enterBaseQuestionsPage(){
        driver.get(QuestionsPageElement.URL_BASE_QUESTIONS);
    }
    @Step
    public String getTitle(){return
    QuestionsPageElement.TITLE.getText();
}
    @Step
    public void clickButtonPersonalQuestions(){
        QuestionsPageElement.BUTTON_PERSONAL_QUESTION.click();
    }
    @Step
    public void clickButtonBaseQuestions(){
        QuestionsPageElement.BUTTON_BASE_QUESTIONS.click();
    }
    @Step
    public void searchQuestions(String text){
        QuestionsPageElement.SEARCH_QUESTION.type(text);
    }
    @Step
    public void clickButtonAddQuestion(){
        QuestionsPageElement.BUTTON_ADD_QUESTION.click();
    }
    @Step
    public void clickQuestionFirst(){
        QuestionsPageElement.QUESTION_1.click();
    }
    @Step
    public void clickQuestionFirstChange(){
        QuestionsPageElement.QUESTION_1_CHANGE.click();
    }
    @Step
    public void clickButtonAddToBaseQuestion(){
        QuestionsPageElement.BUTTON_ADD_BASE_QUESTION.click();
    }
    @Step
    public void clickFilterClean(){
        QuestionsPageElement.FILTER_CLEAN.click();
    }
    @Step
    public void selectCompetence(int value){
        Select select = new Select(QuestionsPageElement.SELECT_COMPETENCE.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    @Step
    public void selectAuthor(int value){
        Select select = new Select(QuestionsPageElement.SELECT_AUTHOR.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    @Step
    public void checkQuestionsWithAnswer(){
        QuestionsPageElement.CHECK_QUESTIONS_WITH_ANSWER.click();
    }
    @Step
    public void checkPersonalQuestions(){
        QuestionsPageElement.CHECK_MY_PERSONAL_QUESTIONS.click();
    }
    @Step
    public void clickQuestionSave(){
        QuestionsPageElement.BUTTON_SAVE_QUESTION.click();
    }
    @Step
    public void clickCancel(){
        QuestionsPageElement.BUTTON_CANCEL_QUESTION.click();
    }
    @Step
    public void typeQuestion(String question){
        QuestionsPageElement.TYPE_QUESTION.type(question);
    }
    @Step
    public void typeAnswer(String answer){
        QuestionsPageElement.TYPE_ANSWER.type(answer);
    }
    @Step
    public void typeCompetence(String competence){
        QuestionsPageElement.TYPE_COMPETENCE.type(competence);
    }
    @Step
    public String messageError(){return
        QuestionsPageElement.MESSAGE_ERROR.getText();
    }
    @Step
    public String messageSuccess(){return
        QuestionsPageElement.MESSAGE_SUCCESS.getText();
    }
    @Step
    public String messageWarning(){return
        QuestionsPageElement.MESSAGE_WARNING.getText();
    }
    @Step
    public String  messageInfo(){return
        QuestionsPageElement.MESSAGE_INFO.getText();
    }

}
