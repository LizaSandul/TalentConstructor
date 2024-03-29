package edu.bsuir.element;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Element
{
    private  String name;
    private By by;

    public Element(String name, By by) {
        this.name = name;
        this.by = by;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public By getBy() {
        return by;
    }

    public void setBy(By by) {
        this.by = by;
    }

    public Boolean isElementPresent() {
        try {
            getWebElement();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public WebElement getWebElement() {
        return WebDriverSingleton.getInstance().findElement(by);
    }

    public void assertPresence(){
        Assert.assertTrue("Элемент"+name+"не существует на старнцие",isElementPresent());
    }

    public void click(){
        assertPresence();
        getWebElement().click();

    }

    public String getText(){
        assertPresence();
        return getWebElement().getText();
    }

    public String getAttribute(String text){
        assertPresence();
        return getWebElement().getAttribute(text);
    }

    public void type(String text){
        assertPresence();
        WebElement element = getWebElement();
        element.clear();
        element.sendKeys(text);
    }


    public void sendKeys(String text){
       // assertPresence();
        //WebElement element = getWebElement();
        //element.clear();
        getWebElement().sendKeys(text);
    }



    public void doubleClick(){
        assertPresence();
        Actions actions = new Actions(WebDriverSingleton.getInstance());
        actions.doubleClick(getWebElement());
        actions.perform();
    }

}
