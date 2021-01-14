package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AlertPage;
import com.objectRepository.automationlinks.AutomationPageLink;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AlertTest extends BaseClass {
    @Test()
    public static void verifyShowAlertBox() throws InterruptedException, IOException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on alert link
        WebDriverUtils.clickElement(apl.getAlertLinkPage());
        WebDriverUtils.waitForPageLoad(driver);
        //Declare the expected show alert text box message
        String expAlertMessage = fil.getPropertyTestData().getProperty("ShowAlertBox");
        //Click on show alert box
        AlertPage alertpage = PageFactory.initElements(driver, AlertPage.class);
        WebDriverUtils.clickElement(alertpage.getShowAlertboxButton());
        Alert alt = driver.switchTo().alert();
        String actualAlertMessage = alt.getText();
        alt.accept();
        Assert.assertEquals(actualAlertMessage, expAlertMessage);
        System.out.println("The alert message is :" + actualAlertMessage);
    }

    @Test()
    public static void verifyShowConfirmBox() throws InterruptedException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on alert link
        WebDriverUtils.clickElement(apl.getAlertLinkPage());
        WebDriverUtils.waitForPageLoad(driver);
        //Click on show confirm box button
        AlertPage alp = PageFactory.initElements(driver, AlertPage.class);
        //Click on show confirmbox
        WebDriverUtils.clickElement(alp.getShowConfirmBoxButton());
        Alert alt = driver.switchTo().alert();
        alt.accept();
        Assert.assertTrue(alp.getConfirmReturn().isDisplayed());
        System.out.println("The expected behaviour is :" + alp.getConfirmReturn().getText());
    }
    @Test()
    public static void verifyShowPromptBox() throws InterruptedException, IOException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on alert link
        WebDriverUtils.clickElement(apl.getAlertLinkPage());
        WebDriverUtils.waitForPageLoad(driver);
        //Click on show showpromptbox
        AlertPage alp = PageFactory.initElements(driver, AlertPage.class);
        WebDriverUtils.clickElement(alp.getShowPromptBoxButton());
        //Switch to alert
        Alert alt= driver.switchTo().alert();
        alt.sendKeys(fil.getPropertyTestData().getProperty("PromptMessage"));
        alt.accept();
        Assert.assertTrue(alp.getPromptReturn().isDisplayed());
        System.out.println("The prompt message is :"+alp.getPromptReturn().getText());

    }


}
