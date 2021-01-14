package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.BasicHTMLFormPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicHTMLFormTest extends BaseClass {

    @Test()
    public static void submitHtmlFormAndVerify() throws InterruptedException, IOException, AWTException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on htmlform link
       WebDriverUtils.clickElement(apl.getHtmlFormExample());
     //  Call the Basic html page
        BasicHTMLFormPage bhp= PageFactory.initElements(driver, BasicHTMLFormPage.class);
        //Enter the username
        bhp.getUsername().sendKeys(fil.getPropertyTestData().getProperty("username"));
        bhp.getPassword().sendKeys(fil.getPropertyTestData().getProperty("password"));
        //Clear and enter the comment
        bhp.getTextAreaComments().clear();
        bhp.getTextAreaComments().sendKeys(fil.getPropertyTestData().getProperty("comments"));
        WebDriverUtils.waitForElement(driver, bhp.getChooseFileButton());
        //Click and upload documents
       // WebDriverUtils.clickAnduploadDocument(fil.getPropertyTestData().getProperty("pdf"),bhp.getChooseFileButton());
       //Select multiple dropdowns
        Select sel= new Select(bhp.getMultiSelectDropdown());
        sel.selectByIndex(0);
        sel.selectByIndex(1);
        //Click and select dropdown
        Select sel1= new Select(bhp.getSelectDropdown());
        sel1.selectByIndex(0);
      WebDriverUtils.clickUsingJS(bhp.getSubmitButton());
      Thread.sleep(5000);

    }
    @Test()
    public static void verifyUserNameAndPassword() throws InterruptedException, IOException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on htmlform link
        WebDriverUtils.clickElement(apl.getHtmlFormExample());
        //  Call the Basic html page
        BasicHTMLFormPage bhp= PageFactory.initElements(driver, BasicHTMLFormPage.class);
        WebDriverUtils.clickElement(bhp.getUsername());
        Thread.sleep(4000);
        WebDriverUtils.textUsingJS(bhp.getUsername(), fil.getPropertyTestData().getProperty("username"));
        WebDriverUtils.textUsingJS(bhp.getPassword(), fil.getPropertyTestData().getProperty("password"));
       // bhp.getUsername().sendKeys(fil.getPropertyTestData().getProperty("username"));
       // bhp.getPassword().sendKeys(fil.getPropertyTestData().getProperty("password"));
        WebDriverUtils.clickElement(bhp.getSubmitButton());
        //Verify the submitted username and password
        String uName=bhp.getVerifyUsername().getAttribute("value");
        String pName=bhp.getVerifyPassword().getText();
        Assert.assertTrue(uName.contains(fil.getPropertyTestData().getProperty("username")));
        Assert.assertTrue(pName.contains(fil.getPropertyTestData().getProperty("password")));
    }

}
