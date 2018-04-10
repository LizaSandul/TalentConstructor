package edu.bsuir.util.help;

import edu.bsuir.driver.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Helper {

    public static void waitForTime(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitForTimeInMilliseconds(long timeout) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String generateRandomString(int length, GeneratorMode mode) {
        StringBuffer buffer = new StringBuffer();
        String characters = "";
        switch (mode) {
            case ALPHA:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;
            case ALPHANUMERIC:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                break;
            case NUMERIC:
                characters = "1234567890";
                break;
            case ANY_CHARACTERS:
                characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*()_+=-<>?/.,|}{][";
                break;
        }
        int charactersLength = characters.length();
        for (int i = 0; i < length; i++) {
            double index = Math.random() * charactersLength;
            buffer.append(characters.charAt((int) index));
        }
        return buffer.toString();
    }

    public static void closeBrowser() throws IOException {
        WebDriverSingleton.getInstance().close();
        WebDriverSingleton.destroyInstance();
    }

    public static String getAbsolutePath(String file) {
        Path path = Paths.get(file);
        return path.toAbsolutePath().toString();
    }


    public static void sendFile(String path) {
        try {
            setClipboardData(path);
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }


    public static void setAttributeValue(String webElementId, String attr, String value){
        JavascriptExecutor js = (JavascriptExecutor) WebDriverSingleton.getInstance();
        js.executeScript("document.getElementById('" + webElementId + "').setAttribute('" + attr + "', '" + value + "')");
    }
}
