package com.testProject;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

    public class FirstTest extends BaseClass {
        @Test()
        public static void verifyPageTitle() throws IOException {
//Declare the expected page title
            String expTitle = fil.getPropertyTestData().getProperty("Title");
            String actualTitle = driver.getTitle();
            //Verify the title of the page
            Assert.assertEquals(actualTitle, expTitle);
            System.out.println("The title is :" + actualTitle);
        }

        @Test
        public static void verifyMobileRecorder() throws InterruptedException, IOException {
            //Call the home page
            HomePage homepage= PageFactory.initElements(driver, HomePage.class);
            //Keep the mouse pointer on Platform link
            WebDriverUtils.waitForElement(driver,homepage.getPlatformIcon());
            WebDriverUtils.actionClick(homepage.getPlatformIcon());
            //Click on mobile recorder
            WebDriverUtils.waitForElement(driver, homepage.getMobileRecorder());
            WebDriverUtils.clickElement(homepage.getMobileRecorder());
            //Declare the expected text
            String expText=fil.getPropertyTestData().getProperty("Text");
            //Capture the actual text
            String actText= homepage.getMobRecorderText().getText();
            //Verify the text
            Assert.assertEquals(expText, actText);
            System.out.println("the expected text is matching with actual text :"+actText);
        }
    }





