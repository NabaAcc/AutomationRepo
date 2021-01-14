package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.TablePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest extends BaseClass  {

    @Test()
    public static void verifyTablePageTitle() throws Exception {
        //Call the AutomationPage link
        AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the table page link
        WebDriverUtils.clickElement(apl.getTableTestPage());
        String expTitle= fil.getPropertyTestData().getProperty("TableTitle");
        //Capture the actual title
        TablePage tp= PageFactory.initElements(driver, TablePage.class);
        String actTitle=tp.getTablePageTitle().getText();
        //Verify the title
        Assert.assertEquals(actTitle, expTitle);
        System.out.println("The title is :"+actTitle);

    }
    @Test()
    public static void getAndVerifyTableData() throws Exception{
        //Call the AutomationPage link
        AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the table page link
        WebDriverUtils.clickElement(apl.getTableTestPage());
        //Call the table page
        TablePage tp= PageFactory.initElements(driver, TablePage.class);
       //Declare the expected string
        String expString= fil.getPropertyTestData().getProperty("Name");
        //Capture the actual string
        String actString= tp.tableValue();
        //Verify the name
        Assert.assertEquals(actString, expString);
        System.out.println("The actual string is :"+actString);
    }


}
