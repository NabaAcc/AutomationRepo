package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.FileUploadExamplePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FileUploadTest extends BaseClass {
    @Test
    public static void uploadImageAndVerify() throws InterruptedException, AWTException {
    //Call the Automation page
        AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the fileupload example link
        WebDriverUtils.clickElement(apl.getFileUploadExampleLink());
        //Call the fileupload example link page
        FileUploadExamplePage fup= PageFactory.initElements(driver, FileUploadExamplePage.class);
        //Call the function to upload image
        fup.clickAnduploadDocument(fup.getChooseFileButton(), "E:\\InteliJIdea\\src\\main\\resources\\TestData\\hd_picture_of_the_beautiful_natural_scenery_03_166249.jpg");
        //Select the image radio button
        WebDriverUtils.clickElement(fup.getImageRadioButton());
        //Click on upload button
        WebDriverUtils.clickElement(fup.getUploadButton());
        WebDriverUtils.waitForPageLoad(driver);
        Assert.assertTrue(fup.getUploadedFileName().getText().contains("hd_picture"));
        System.out.println("Uploaded image is :"+ fup.getUploadedFileName().getText());
    }
   @Test()
    public static void uploadDocumentAndVerify() throws InterruptedException, AWTException {
       AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
       //Click on the fileupload example link
       WebDriverUtils.clickElement(apl.getFileUploadExampleLink());
       //Call the fileupload example link page
       FileUploadExamplePage fup= PageFactory.initElements(driver, FileUploadExamplePage.class);
       //Call the function to upload the file
       fup.clickAnduploadDocument(fup.getChooseFileButton(), "E:\\InteliJIdea\\src\\main\\resources\\TestData\\Document.rtf");
       //Select the file radio button
       WebDriverUtils.clickElement(fup.getFileRadioButton());
       //Click on upload button
       WebDriverUtils.clickElement(fup.getUploadButton());
       Assert.assertTrue(fup.getUploadedFileName().getText().contains("Document"));
       System.out.println("The file name is :"+fup.getUploadedFileName().getText());
   }
   @Test()
    public static void clickAndVerifyUploadAnother() throws InterruptedException {
       AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
       //Click on the fileupload example link
       WebDriverUtils.clickElement(apl.getFileUploadExampleLink());
       //Click on upload button
       FileUploadExamplePage fup= PageFactory.initElements(driver, FileUploadExamplePage.class);
       //Click on upload button
       WebDriverUtils.clickUsingJS(fup.getUploadButton());
       //Click on upload another button
       WebDriverUtils.clickUsingJS(fup.getUploadAnotherButton());
       String title= driver.getTitle();
       //Verify the page title
       Assert.assertTrue(title.contains("Upload a File"));
       System.out.println("The page title is :"+title);
   }

}
