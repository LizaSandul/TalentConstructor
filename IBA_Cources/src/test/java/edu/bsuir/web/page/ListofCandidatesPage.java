package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.ListofCandidatesPageElements;
import edu.bsuir.web.element.LoginElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListofCandidatesPage {

    WebDriver driver = WebDriverSingleton.getInstance();

    public void enterPage(){
        driver.get(ListofCandidatesPageElements.URL);
    }

    public void clickClearFilter( ){
        ListofCandidatesPageElements.CLEAR_FILTER.getText();
    }

    public void selectExpirience(int value) {
        Select select = new Select(ListofCandidatesPageElements.SELECT_EXPIRIENCE.getWebElement());
        select.selectByValue(String.valueOf(value));
    }

    public void clickStatusNew( ){
        ListofCandidatesPageElements.STATUS_NEW.click();
    }
    public void clickStatusOnApproval( ){
        ListofCandidatesPageElements.STATUS_ON_APPROVAL.click();
    }
    public void clickStatusAvailable( ){
        ListofCandidatesPageElements.STATUS_AVAILABLE_APPROVAL.click();
    }

    public void clickButtonVacancies( ){
        ListofCandidatesPageElements.BUTTON_VACANCIES.click();
    }
    public void clickVacancyDesigner( ){
        ListofCandidatesPageElements.VACANCY_DESIGNER.click();
    }
    public void typeSearchVacancies(String vacancy){
        ListofCandidatesPageElements.SELECT_VACANCIES.type(vacancy);
    }

    public void clickRelocationAvailable( ){
        ListofCandidatesPageElements.RELOCATION_AVAILABLE.click();
    }
    public void clickRelocationUnAvailable( ){
        ListofCandidatesPageElements.RELOCATION_UNAVAILABLE.click();
    }

    public void clickButtonEducation( ){
        ListofCandidatesPageElements.BUTTON_EDUCATION.click();
    }
    public void clickEducationNonSpecified( ){
        ListofCandidatesPageElements.EDUCATION_NOT_SPECIFIED.click();
    }
    public void clickEducationAvarage( ){
        ListofCandidatesPageElements.EDUCATION_AVERAGE.click();
    }
    public void typeSearchEducation(String education ){
        ListofCandidatesPageElements.SEARCH_EDUCATION.type(education);
    }

    public void clickButtonUniversity( ){
        ListofCandidatesPageElements.BUTTON_UNIVERSITY.click();
    }
    public void clickUniversityBSU( ){
        ListofCandidatesPageElements.UNIVERSITY_BSU.click();
    }
    public void clickUniversityBSUIR( ){
        ListofCandidatesPageElements.UNIVERSITY_BSUIR.click();
    }
    public void typeSearchUniversity(String university ){
        ListofCandidatesPageElements.SEARCH_UNIVERSITY.type(university);
    }

    public void clickButtonCompetence( ){
        ListofCandidatesPageElements.BUTTON_COMPETENCE.click();
    }
    public void clickCompetenceMsAccess( ){
        ListofCandidatesPageElements.COMPETENCE_MS_ACCESS.click();
    }
    public void typeSearchCompetence(String competence ){
        ListofCandidatesPageElements.SEARCH_COMPETENCE.type(competence);
    }

    public void searchCandidate(String candidate ){
        ListofCandidatesPageElements.SEARCH_CANDIDATE.type(candidate);
    }
    public void clickButtonNewCandidate( ){
        ListofCandidatesPageElements.BUTTON_NEW_CANDIDATE.click();
    }
    public void clickCandidateRogova( ){
        ListofCandidatesPageElements.CANDIDATE_ROGOVA.click();
    }
    public void clickCandidateRogovaPhoto(){
        ListofCandidatesPageElements.CANDIDATE_ROGOVA_PHOTO.click();
    }

    public String getFirstFindCandidate(){
        return ListofCandidatesPageElements.FIND_FIRST_CANDIDATE.getText();
    }

    public String getMessageEmptySearch(){
        return ListofCandidatesPageElements.SEARCH_EMPTY_MESSAGE.getText();
    }

    public void clickCreateCandidate(){
        ListofCandidatesPageElements.CANDIDATE_CREATE.click();
    }
}
