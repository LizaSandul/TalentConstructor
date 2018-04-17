package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.MainPageElements;
import edu.bsuir.web.element.RequestElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RequestPage {
/*
    WebDriver driver = WebDriverSingleton.getInstance();

    public void clickCreateButton() {
        WebElement element = driver.findElement(RequestElements.CREATE_BUTTON);
        element.click();
    }
    public void getPosition(String position) {
        WebElement element = driver.findElement(RequestElements.POSITION);
        element.sendKeys(position);
    }
    public void getDate(String date) {
        WebElement element = driver.findElement(RequestElements.CLOSING_DATE);
        element.sendKeys(date);
    }
    public void clickPriority0() {
        WebElement element = driver.findElement(RequestElements.PRIORITY_0);
        element.click();
    }
    public void clickPriority1() {
        WebElement element = driver.findElement(RequestElements.PRIORITY_1);
        element.click();
    }
    public void clickPriority2() {
        WebElement element = driver.findElement(RequestElements.PRIORITY_2);
        element.click();
    }
    public void getQuantity(String quantity) {
        WebElement element = driver.findElement(RequestElements.QUANTITY);
        element.sendKeys(quantity);
    }
    public void getReason(String reason) {
        WebElement element = driver.findElement(RequestElements.REASON);
        element.sendKeys(reason);
    }
    public void clickContract0() {
        WebElement element = driver.findElement(RequestElements.CONTRACT_0);
        element.click();
    }
    public void clickContract1() {
        WebElement element = driver.findElement(RequestElements.CONTRACT_1);
        element.click();
    }
    public void clickContract2() {
        WebElement element = driver.findElement(RequestElements.CONTRACT_2);
        element.click();
    }
    public void getSalary(String salary) {
        WebElement element = driver.findElement(RequestElements.SALARY);
        element.sendKeys(salary);
    }
    public void clickSalary() {
        WebElement element = driver.findElement(RequestElements.SALARY_CURRENCY);
        element.click();
    }
    public void getJobType(String jobtype) {
        WebElement element = driver.findElement(RequestElements.JOB_TYPE);
        element.sendKeys(jobtype);
    }
    public void getEmployees(String employees) {
        WebElement element = driver.findElement(RequestElements.EMPLOYEES);
        element.sendKeys(employees);
    }
    public void getBusinessTrip(String businessTrip) {
        WebElement element = driver.findElement(RequestElements.BUSINESS_TRIP);
        element.sendKeys(businessTrip);
    }


*/



    WebDriver driver = WebDriverSingleton.getInstance();
    @Step
    public void startCreateApi() {
        RequestElements.CREATE_API_BUTTON.click();
    }
    @Step
    public void enterName(String name) {
        RequestElements.NAME.type(name);
    }
    @Step
    public void enterDate() {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 1);
        String tomorrow = (String)(formattedDate.format(c.getTime()));

        RequestElements.DATE.type(tomorrow);

    }

    @Step
    public void enterQuantity(String quantity) {
        RequestElements.QUANTITY.type(quantity);
    }
    @Step
    public void enterPriority() {
        RequestElements.PRIORITY.click();
    }
    @Step
    public void enterSalary(String salary) {
        RequestElements.SALARY.type(salary);
    }

    @Step
    public void enterContractType() {
        RequestElements.CONTRACT_TYPE.click();
    }

    @Step
    public void enterEmployees(String employees) {
        RequestElements.EMPLOYEES.type(employees);
    }
    @Step
    public void enterBusinessTrip(String businessTrip) {
        RequestElements.BUSINESS_TRIP.type(businessTrip);
    }
    @Step
    public void enterTimetable(String timetable) {
        RequestElements.TIMETABLE.type(timetable);
    }
    @Step
    public void enterProbationPeriod(String probationPeriod) {
        RequestElements.PROBATION_PERIOD.type(probationPeriod);

    }
    @Step
    public void enterReason(String reason) {
        RequestElements.REASON.type(reason);
    }
    @Step
    public void enterCandidateType() {
        RequestElements.CANDIDATE_TYPE_INTERNAL.click();
    }
    @Step
    public void enterEducationSpecialization(String requiredEducation) {
        RequestElements.EDUCATION_SPECIALIZATION.type(requiredEducation);
    }
    @Step
    public void enterResponsibilities(String responsibilities) {
        RequestElements.RESPONSIBILITIES.type(responsibilities);

    }
    @Step
    public void enterPriorityWorkingExperience(String priorityWorkingExperience) {
        RequestElements.PRIORITY_ORGANISATIONS.type(priorityWorkingExperience);

    }
    @Step
    public void enterUndesirableWorkingExperience(String undesirableWorkingExperience) {
        RequestElements.UNDESIRABLE_WORKING_EXPERIENCE.type(undesirableWorkingExperience);

    }
    @Step
    public void setEditRequiredCompetence() throws InterruptedException {
        RequestElements.REQUIRED_COMPETENCE.click();
        RequestElements.BASIC.click();
        RequestElements.LEARNABILITY.doubleClick();
        Thread.sleep(5000);
        RequestElements.OK_BUTTON.click();
    }
    @Step
    public void setEditNotRequiredCompetence() throws InterruptedException {
        RequestElements.NOT_REQUIRED_COMPETENCE.click();
        RequestElements.BASIC.click();
        RequestElements.LEARNABILITY.doubleClick();
        Thread.sleep(5000);
        RequestElements.OK_BUTTON.click();
    }
    @Step
    public void enterComment(String comment) {
        RequestElements.COMMENT.type(comment);
    }
    @Step
    public void saveApplication() {
        RequestElements.SAVE_BUTTON.click();
    }
}
