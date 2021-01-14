package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.CSSHoverPage;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends BaseClass {
    @Test(priority=3)
    public static void verifyHoverPara() throws InterruptedException {
        //Call the Automation page
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on hovertest page link
        WebDriverUtils.clickElement(apl.getHoverTestLink());
        // Call the hovertestpage
        CSSHoverPage chp= PageFactory.initElements(driver, CSSHoverPage.class);
        //Keep the mouse pointer on hover para button
        Actions act= new Actions(driver);
        act.moveToElement(chp.getHoverParaButton()).perform();
        //Capture the text
        WebDriverUtils.waitForElement(driver, chp.getHoverParaText());
        String actText= chp.getHoverParaText().getText();
        Assert.assertTrue(actText.contains("hovered"));
        System.out.println("The available text in hover para is :" +actText);

    }
 @Test(priority=2)
    public static void verifyHoverDivLink() throws InterruptedException {
     //Call the Automation page
     AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
     //Click on hovertest page link
     WebDriverUtils.clickElement(apl.getHoverTestLink());
     // Call the hovertestpage
     CSSHoverPage chp= PageFactory.initElements(driver, CSSHoverPage.class);
     //Keep the mouse pointer on Hover div button
     Actions act= new Actions(driver);
     act.moveToElement(chp.getHoverDivParaButton()).perform();
     //Click on the link
     WebDriverUtils.waitForElement(driver, chp.getClickMeLink());
     WebDriverUtils.clickElement(chp.getClickMeLink());
     WebDriverUtils.waitForElement(driver, chp.getActionCompleteText());
     String actText= chp.getActionCompleteText().getText();
     //System.out.println(actText);
     //Verify the text
     Assert.assertTrue(actText.contains("performed"));
     System.out.println("Link has verified and the text is :"+actText);
 }
 @Test(priority=1)
    public static void verifyReturnButton() throws InterruptedException {
     //Call the Automation page
     AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
     //Click on hovertest page link
     WebDriverUtils.clickElement(apl.getHoverTestLink());
     // Call the hovertestpage
     CSSHoverPage chp= PageFactory.initElements(driver, CSSHoverPage.class);
     //Keep the mouse pointer on Hover div button
     Actions act= new Actions(driver);
     act.moveToElement(chp.getHoverDivParaButton()).perform();
     //Click on the link
     WebDriverUtils.waitForElement(driver, chp.getClickMeLink());
     WebDriverUtils.clickElement(chp.getClickMeLink());
     //Click on the returnprevious page button
     WebDriverUtils.waitForElement(driver, chp.getReturnPageButton());
     WebDriverUtils.clickElement(chp.getReturnPageButton());
     WebDriverUtils.waitForPageLoad(driver);
     Assert.assertTrue(chp.getHoverDivParaButton().isDisplayed());
     System.out.println("The return previous page link has verified successfully");
 }

}
