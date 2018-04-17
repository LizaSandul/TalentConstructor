package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.ListofCandidatesPageElements;
import edu.bsuir.web.element.LoginElements;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListofCandidatesPage {

    WebDriver driver = WebDriverSingleton.getInstance();
    @Step
    public void enterPage(){
        driver.get(ListofCandidatesPageElements.URL);
    }
    @Step
    public void clickClearFilter( ){
        WebElement element = driver.findElement(By.id("filter-clear-link"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
    @Step
    public void selectExpirience(int value) {
        Select select = new Select(ListofCandidatesPageElements.SELECT_EXPIRIENCE.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    @Step
    public void clickStatusNew( ){
        ListofCandidatesPageElements.STATUS_NEW.click();
    }
    public void clickStatusOnApproval( ){
        ListofCandidatesPageElements.STATUS_ON_APPROVAL.click();
    }
    @Step
    public void clickStatusAvailable( ){
        ListofCandidatesPageElements.STATUS_AVAILABLE_APPROVAL.click();
    }
    public void clickStatusHires(){ListofCandidatesPageElements.STATUS_HIRED.click();
    }
    @Step
    public void clickButtonVacancies( ){
        ListofCandidatesPageElements.BUTTON_VACANCIES.click();
    }
    @Step
    public void clickVacancyDesigner( ){
        ListofCandidatesPageElements.VACANCY_DESIGNER.click();
    }
    public void typeSearchVacancies(String vacancy){
        ListofCandidatesPageElements.SELECT_VACANCIES.type(vacancy);
    }
    @Step
    public void clickRelocationAvailable( ){
        ListofCandidatesPageElements.RELOCATION_AVAILABLE.click();
    }
    public void clickRelocationUnAvailable( ){
        ListofCandidatesPageElements.RELOCATION_UNAVAILABLE.click();
    }
    @Step
    public void clickButtonEducation( ){
        ListofCandidatesPageElements.BUTTON_EDUCATION.click();
    }
    public void clickEducationNonSpecified( ){
        ListofCandidatesPageElements.EDUCATION_NOT_SPECIFIED.click();
    }
    public void clickEducationAvarage( ){
        ListofCandidatesPageElements.EDUCATION_AVERAGE.click();
    }
    @Step
    public void clickHigh( ){
        ListofCandidatesPageElements.EDUCATION_HIGHER.click();
    }
    public void clickEducationVocationAndTechnical( ){
        ListofCandidatesPageElements.EDUCATION_VOCATION_AND_TECHNICAL.click();
    }
    public void clickEducationInconpleteHigh( ){
        ListofCandidatesPageElements.EDUCATION_INCONPLETE_HIGHER.click();
    }
    public void clickSpecializedSecondary( ){
        ListofCandidatesPageElements.EDUCATION_SPECIALIZED_SECONDARY.click();
    }
    public void typeSearchEducation(String education ){
        ListofCandidatesPageElements.SEARCH_EDUCATION.type(education);
    }
    @Step
    public void clickButtonUniversity( ){
        ListofCandidatesPageElements.BUTTON_UNIVERSITY.click();
    }
    @Step
    public void clickUniversityBSU( ){
        ListofCandidatesPageElements.UNIVERSITY_BSU.click();
    }
    public void clickUniversityBSUIR( ){
        ListofCandidatesPageElements.UNIVERSITY_BSUIR.click();
    }
    public void clickUniversityBNTU( ){
        ListofCandidatesPageElements.UNIVERSITY_BNTU.click();
    }
    public void clickUniversityBSEU( ){
        ListofCandidatesPageElements.UNIVERSITY_BSEU.click();
    }
    public void typeSearchUniversity(String university ){
        ListofCandidatesPageElements.SEARCH_UNIVERSITY.type(university);
    }
    @Step
    public void clickButtonCompetence( ){
        ListofCandidatesPageElements.BUTTON_COMPETENCE.click();
    }
    @Step
    public void clickCompetenceMsAccess( ){
        ListofCandidatesPageElements.COMPETENCE_MS_ACCESS.click();
    }
    public void clickCompetenceMsOneNote( ){
        ListofCandidatesPageElements.COMPETENCE_MS_ONENOTE.click();
    }
    public void clickCompetenceEnglish( ){
        ListofCandidatesPageElements.COMPETENCE_ENGLISH.click();
    }
    public void clickCompetenceFrench( ){
        ListofCandidatesPageElements.COMPETENCE_FRENCH.click();
    }
    public void typeSearchCompetence(String competence ){
        ListofCandidatesPageElements.SEARCH_COMPETENCE.type(competence);
    }
    @Step
    public void searchCandidate(String candidate ){
        ListofCandidatesPageElements.SEARCH_CANDIDATE.type(candidate);
    }
    @Step
    public void clickCandidateRogova( ){
        ListofCandidatesPageElements.CANDIDATE_ROGOVA.click();
    }
    @Step
    public void clickCandidateRogovaPhoto(){
        ListofCandidatesPageElements.CANDIDATE_ROGOVA_PHOTO.click();
    }
    @Step
    public String getFirstFindCandidate(){
        return ListofCandidatesPageElements.FIND_FIRST_CANDIDATE.getText();
    }
    @Step
    public String getMessageEmptySearch(){
        return ListofCandidatesPageElements.SEARCH_EMPTY_MESSAGE.getText();
    }
    @Step
    public void clickCreateCandidate(){
        ListofCandidatesPageElements.CANDIDATE_CREATE.click();
    }


}

