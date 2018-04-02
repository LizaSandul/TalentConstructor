package edu.bsuir.web.page;

import edu.bsuir.driver.WebDriverSingleton;
import edu.bsuir.web.element.MainPageElements;
import edu.bsuir.web.element.RequestElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestPage {

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



}
