package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.UserAgentMobilePage;
import com.objectRepository.automationlinks.UserAgentRedirectionPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserAgentTest extends BaseClass {

    @Test()
    public static void  verifyUserAgentRedirection() throws InterruptedException {
        //Call the automation page link
        AutomationPageLink  apl= PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the user agent based redirection
        WebDriverUtils.clickElement(apl.getUserAgentRedirectLink());
        String title1= driver.getTitle();
        //Call the user agent based redirection page
        UserAgentRedirectionPage arp= PageFactory.initElements(driver, UserAgentRedirectionPage.class);
        //click on the mobile user agent link
        WebDriverUtils.clickElement(arp.getUserAgentMobileLink());
        //Capture the page title
        String title2= driver.getTitle();
        //Call the UserAgentMobilePage
        UserAgentMobilePage uamp= PageFactory.initElements(driver, UserAgentMobilePage.class);
        //Click on the link to go back to user agent redirection page
        WebDriverUtils.clickElement(uamp.getRedirectPage());
        String title3= driver.getTitle();
        //Verify the page tiltles
        Assert.assertTrue(title1.contains("Redirection"));
        System.out.println("The first title is :"+title1);
        Assert.assertTrue(title2.contains("Mobile"));
        System.out.println("The second title is :"+title2);
        Assert.assertTrue(title3.contains("Redirection"));
        System.out.println("The title after redirection is :"+title3);

    }

    // Moved to github
}
