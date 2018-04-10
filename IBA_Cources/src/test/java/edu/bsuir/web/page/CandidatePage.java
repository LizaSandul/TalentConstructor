package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.util.help.Helper;
import edu.bsuir.web.element.CandidatePageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CandidatePage {



    WebDriver driver =  WebDriverSingleton.getInstance();


    public String checkResume(){return CandidatePageElement.CHECK_RESUME.getText();}
    public String checkAttachFile(){return CandidatePageElement.CHECK_ATTACH_FILE.getText();}

    public String checkPhoto(String text){return CandidatePageElement.CHECK_PHOTO.getAttribute(text);}

    public void enterPage(){
        driver.get(CandidatePageElement.URL);
    }
    public void enterCandidatePage(){
        driver.get(CandidatePageElement.URL_CANDIDATE);
    }
/*
    public void clickPhotoAdd( ){
        WebElement element = driver.findElement(By.xpath("//div[@id='profilePhoto']//img"));
        element.sendKeys("//foto1.jpg");
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
       // executor.executeScript("arguments[0].click();", element);
    }*/
    public void clickButtonCreate(){CandidatePageElement.SAVE_BUTTON.click();}
    public String getMessageError(){
        return CandidatePageElement.ERROR_MESSAGE.getText();
    }

    public void clickBackToList(){
        CandidatePageElement.BUTTON_BACK_TO_LIST.click();
    }
    public void clickButtonloadSV(){
        CandidatePageElement.BUTTON_LOAD_SV.click();
    }
    public void clickLoadSvOk(){
        CandidatePageElement.BUTTON_LOAD_SV_OK.click();
    }
    public void clickLoadSvCancel(){
        CandidatePageElement.BUTTON_LOAD_SV_CANCEL.click();
    }

    public void clickButtonCancel(){
        CandidatePageElement.BUTTON_EDIT_CANCEL.click();
    }

    public void clickButtonEdit(){CandidatePageElement.BUTTON_EDIT.click();}
    public void clickButtonPhoto(){
        CandidatePageElement.BUTTON_PHOTO.click();
    }

    public void clickToAddPhoto(String path){
        CandidatePageElement.CHANGE_PHOTO.sendKeys(path);
    }

    public void sendPhoto(){

    }
    public void typeComment(String comment){
        CandidatePageElement.TEXTAREA_COMMENT.type(comment);
    }

    public void typeSurname(String surname){
        CandidatePageElement.SURNAME.type(surname);
    }
    public void typeName(String name){
        CandidatePageElement.NAME.type(name);
    }
    public void typeSecondName(String secondName){
        CandidatePageElement.SECOND_NAME.type(secondName);
    }
    public void typePhone(String phone){
            CandidatePageElement.PHONE.type(phone);
    }
    public void typeEmail(String email){
        CandidatePageElement.EMAIL.type(email);
    }
    public void typeSkype(String skype){
        CandidatePageElement.SKYPE.type(skype);
    }
    public void typeCountry(String country){
        CandidatePageElement.COUNTRY.type(country);
    }
    public void typeCity(String city){
        CandidatePageElement.CITY.type(city);
    }
    public void clickRelocationAvailable(){
        CandidatePageElement.RELOCATION.click();
    }


    public void typeDayBD(int value){
        Select select = new Select(CandidatePageElement.BD_DAY.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void typeMonthBD(int value){
        Select select = new Select(CandidatePageElement.BD_MONTH.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void typeYearBD(int value){
        Select select = new Select(CandidatePageElement.BD_YEAR.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void selectEducation(int value){
        Select select = new Select(CandidatePageElement.EDUCATION.getWebElement());
        select.selectByValue(String.valueOf(value));
    }

    public String getSuccessMessage(){return CandidatePageElement.SUCCESS_MESSAGE.getText();
    }


    public void typeVacancy(String vacancy){
        CandidatePageElement.DESIRED_POSITION.type(vacancy);
    }

    public void clickButtonAddCompetence(){
        CandidatePageElement.BUTTON_COMPETENCE.click();
    }

    public void clickButtonAddEducation(){
        CandidatePageElement.ADD_EDUCATION_BUTTON.click();
    }
    public void typeUniversity(String university){
        CandidatePageElement.UNIVERSITY.type(university);
    }
    public void typeFaculty(String faculty){
        CandidatePageElement.FACULTY.type(faculty);
    }
    public void typeSpecialization(String specialization){
        CandidatePageElement.SPECIALIZATION.type(specialization);
    }


    public void selectStartEducation(int value){
        Select select = new Select(CandidatePageElement.CHOOSE_START_EDUCATION_BUTTON.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void selectEndEducation(int value){
        Select select = new Select(CandidatePageElement.CHOOSEN_FINISH_EDUCATION_BUTTON.getWebElement());
        select.selectByValue(String.valueOf(value));
    }



    public void clickButtonDeleteEdutaion(){
        CandidatePageElement.BUTTON_EDUCATION_REMOVE.click();
    }

    public void clickButtonAddExpirence(){
        CandidatePageElement.ADD_INFORMATION_ABOUT_EXPERIENCE.click();
    }
    public void typePosition(String position){
        CandidatePageElement.ADD_POSITION.type(position);
    }
    public void typeCompany(String company){
        CandidatePageElement.COMPANY.type(company);
    }



    public void selectStartMonthJob(int value){
        Select select = new Select(CandidatePageElement.JOB_START_MONTH.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void selectStartYearJob(int value){
        Select select = new Select(CandidatePageElement.JOB_START_YEAR.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void selectEndMonthjob(int value){
        Select select = new Select(CandidatePageElement.JOB_END_MONTH.getWebElement());
        select.selectByValue(String.valueOf(value));
    }
    public void selectEndYearJob(int value){
        Select select = new Select(CandidatePageElement.JOB_END_YEAR.getWebElement());
        select.selectByValue(String.valueOf(value));
    }



    public void clickInJobNow(){
        CandidatePageElement.CHECKBOX_JOB_NOW.click();
    }

    public void typeDescriptionJob(String description){
        CandidatePageElement.DESCRIPTION_JOB.type(description);
    }

    public void clickDeleteJob(){
        CandidatePageElement.DELETED_WORKING_INFORMATION.click();
    }

    public void clickButtonAddREcomendation(){
        CandidatePageElement.RECOMINDATION_BUTTON.click();
    }
    public void typeRecomendPosition(String position){
        CandidatePageElement.ADD_POSITION_RECOMINDATION.type(position);
    }
    public void typeRecomndCompany(String company){
        CandidatePageElement.ADD_COMPANY_RECOMINDATION.type(company);
    }
    public void typeRecomndPhone(String phone){
        CandidatePageElement.ADD_PHONE_RECOMINDATION.type(phone);
    }

    /*
    public void clickTabCompetence(){
        CandidatePageElement.TAB_EXPIRIENCE.click();
    }*/
    public void clickTabEducation(){
        CandidatePageElement.TAB_EDUCATION.click();
    }
    public void clickTabExpirence(){
        CandidatePageElement.TAB_EXPIRIENCE.click();
    }
    public void clickTabMotivation(){
        CandidatePageElement.TAB_MOTIVATION.click();
    }
    public void clickTabRecomendation(){
        CandidatePageElement.TAB_RECOMMENDATIONS.click();
    }
    public void clickAttachFile(){
        CandidatePageElement.ATTACH_FILE.click();
    }

    public void clickDeleteCandidate(){
        CandidatePageElement.BUTTON_DELETE_CANDIDATE.click();
    }

    public void clickDeleteCandidateOk(){
        CandidatePageElement.BUTTON_DELETE_OK.click();
    }
    public void GoToCreateSummaryPage()
    {
        driver.get(CandidatePageElement.URL);
    }

}
