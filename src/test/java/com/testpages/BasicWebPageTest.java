package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.BasicWebPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BasicWebPageTest extends BaseClass {
    @Test()
    public static void verifyParaTexts() throws Exception {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the basic webpage link
        WebDriverUtils.clickElement(apl.getBasicWebPageLink());
        //Call the basic webpage link
        BasicWebPage bwp = PageFactory.initElements(driver, BasicWebPage.class);
        //Capture the expected data
        List<String> expData= fil.getExcelData("Paragraphs",0,0);
        //Get the actual paragraphs
        List<String> actData = bwp.printParagraphs();
        //Verify the paragraphs
        Assert.assertEquals(actData, expData);
        System.out.println(actData);

    }

}
