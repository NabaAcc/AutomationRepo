package com.objectRepository.automationlinks;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadExamplePage {
    /***********Initialization***********/
    @FindBy(xpath="//div[@class='page-body']/div[3]/form/div[1]/input")
    private WebElement chooseFileButton;
    @FindBy(id="itsanimage")
    private WebElement imageRadioButton;
    @FindBy(id="itsafile")
    private WebElement fileRadioButton;
    @FindBy(name="upload")
    private WebElement uploadButton;
    @FindBy(id="goback")
    private WebElement uploadAnotherButton;
    @FindBy(id="uploadedfilename")
    private WebElement uploadedFileName;

/***********Getters Usage***********/

    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }

    public WebElement getImageRadioButton() {
        return imageRadioButton;
    }

    public WebElement getFileRadioButton() {
        return fileRadioButton;
    }

    public WebElement getUploadButton() {
        return uploadButton;
    }

    public WebElement getUploadAnotherButton() {
        return uploadAnotherButton;
    }

    public WebElement getUploadedFileName() {
        return uploadedFileName;
    }

/***********Utilization***********/
public  void clickAnduploadDocument(WebElement element, String filepath) throws AWTException, InterruptedException {
    Actions action = new Actions(BaseClass.driver);
    Thread.sleep(5000);
    action.moveToElement(element).click().perform();
    Thread.sleep(5000);
    StringSelection path = new StringSelection(filepath);
    // pass the driver control to system
    Toolkit t = Toolkit.getDefaultToolkit();
    // pass the driver control to mousesrc\main\resources\TestData\src\main\resources\TestData\hd_picture_of_the_beautiful_natural_scenery_03_166249
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



}
