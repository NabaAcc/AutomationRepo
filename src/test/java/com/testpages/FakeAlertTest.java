package com.testpages;
import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.FakeAlertPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FakeAlertTest extends BaseClass {

    @Test()
    public static void verifyShowAlertBox() throws InterruptedException, IOException {
        //Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on FakeAlert link
        WebDriverUtils.clickElement(apl.getFakeAlertLink());
        FakeAlertPage fap= PageFactory.initElements(driver, FakeAlertPage.class);
        //Click on show alertbox
        WebDriverUtils.clickElement(fap.getShowAlertBox());
        String expDialogText= fil.getPropertyTestData().getProperty("fakeShowAlertText");
        String actDialogText= fap.getDilogText().getText();
        //Click on okay button
        WebDriverUtils.clickElement(fap.getDilogOkay());
        Assert.assertEquals(actDialogText, expDialogText);
        System.out.println("The dialog text is :"+actDialogText);

    }
    @Test()
    public static void verifyShowModalDialog() throws InterruptedException, IOException {
//Call the AutomationPage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on FakeAlert link
        WebDriverUtils.clickElement(apl.getFakeAlertLink());
        FakeAlertPage fap= PageFactory.initElements(driver, FakeAlertPage.class);
        WebDriverUtils.clickElement(fap.getShowModalDialog());
        String expDialogText=fil.getPropertyTestData().getProperty("fakeModelDivText");
        String actDialogText=fap.getDilogText().getText();
        //Click on okay button
        WebDriverUtils.clickElement(fap.getDilogOkay());
        Assert.assertEquals(actDialogText, expDialogText);
        System.out.println("The dialog text is :"+actDialogText);
    }
}
