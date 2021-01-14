package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.IframePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class IframeTest extends BaseClass {


    @Test()
    public static void verifyAllFrames() throws Exception {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on frame
        WebDriverUtils.clickElement(apl.getFrameTestLink());
        //Declare the expected framelists
        List<String> exValues= fil.getExcelData("sheet1",0,0);
        //Call the frame page
        IframePage ifp= PageFactory.initElements(driver, IframePage.class);
        driver.switchTo().frame(ifp.getDynamicFrame());
        List<String> actVal= ifp.printFrameList();
        //Verify the framelist
        Assert.assertEquals(actVal, exValues);
        System.out.println("The actual frames are :"+actVal);
    }
    @Test()
    public static void verifyIFrameHeader() throws InterruptedException, IOException {
//Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on frame
        WebDriverUtils.clickElement(apl.getFrameTestLink());
        //Declare the expected framelists
        //Call the frame page
        IframePage ifp= PageFactory.initElements(driver, IframePage.class);
        //Declare expected header
        String expString=fil.getPropertyTestData().getProperty("IFrameExampleHeader");
        String expString1=fil.getPropertyTestData().getProperty("NestedPageExample");
        //Capture the actual string
        String actString=ifp.getIframeExHeader().getText();
        driver.switchTo().frame(ifp.getHeaderFrame());
        String actString1=ifp.getNestedPageEx().getText();
        //Verify the headers
        Assert.assertEquals(actString, expString);
        Assert.assertEquals(actString1, expString1);
        System.out.println("The strings are :"+actString +","+actString1);
    }
}
