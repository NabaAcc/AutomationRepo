package com.genericLibraries;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

    public class WebDriverUtils {
        /********Wait for the page to load*******/
        public static void waitForPageLoad(WebDriver driver) {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }

        /************Wait for the element to visible***************************/
        public static void waitForElement(WebDriver driver, WebElement wb) {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until((ExpectedConditions.elementToBeClickable(wb)));
        }

        // Method to click an element
        public static void clickElement(WebElement element) throws InterruptedException {
            WebDriverWait wait = new WebDriverWait(BaseClass.driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }

        // Method to click using action class for mouse over
        public static void actionClick(WebElement element) {
            Actions action = new Actions(BaseClass.driver);
            action.moveToElement(element).click().perform();
        }


        /*************Method to handle stale*******************/
        public static boolean handleStale(WebElement element) {
            boolean result = false;
            int count = 0;
            while (count < 2) {
                try {
                    element.isDisplayed();
                    result = true;
                    break;
                } catch (StaleElementReferenceException e) {
                    count++;
                }
            }
            return result;
        }
        //Method to upload//Method to upload document
        public static void clickAnduploadDocument(WebElement element, String filepath) throws AWTException, InterruptedException {
            JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
            js.executeScript("arguments[0].click();", element);
            Thread.sleep(2000);
            StringSelection path = new StringSelection(filepath);
            // pass the driver control to system
            Toolkit t = Toolkit.getDefaultToolkit();
            // pass the driver control to mouse
            Clipboard c = t.getSystemClipboard();
            // Copy the path into mouse clipboard
            c.setContents(path, null);
            // Declare the Robot class
            Robot rob = new Robot();
            // Press control + V
            rob.keyPress(KeyEvent.VK_CONTROL);
            rob.keyPress(KeyEvent.VK_V);
            // Release control+V
            rob.keyRelease(KeyEvent.VK_CONTROL);
            rob.keyRelease(KeyEvent.VK_V);
            Thread.sleep(2000);
            // press enter
            rob.keyPress(KeyEvent.VK_ENTER);
            // Release Enter
            rob.keyRelease(KeyEvent.VK_ENTER);
        }

        /*****Method to switch to alert*******/
        public static void Alert(WebDriver driver) {
            Alert alt= driver.switchTo().alert();
            alt.accept();
        }
        //Method to enter text using java script
        public static void textUsingJS(WebElement element, String text){
            JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseClass.driver;
            jsExecutor.executeScript("arguments[0].value='text'", element);
        }

        public static void clickUsingJS(WebElement element) {
            JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
            executor.executeScript("arguments[0].click();", element);
        }
        // Method to use Select class
        public static void selectElement(WebElement element, String text) {
            Select sel= new Select(element);
            sel.selectByVisibleText(text);

        }

    }

