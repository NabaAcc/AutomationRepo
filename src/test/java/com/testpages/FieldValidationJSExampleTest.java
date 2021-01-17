package com.testpages;
import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.FieldValidationJavaScriptExamplePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class FieldValidationJSExampleTest extends BaseClass {
    @Test()
    public static void verifyEditbox() throws InterruptedException {
        //Call the automation page link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on the fieldValidation JS example Test
        WebDriverUtils.clickElement(apl.getFileUploadExampleLink());
        //Call the fieldValidation example page
        FieldValidationJavaScriptExamplePage fjs = PageFactory.initElements(driver, FieldValidationJavaScriptExamplePage.class);
        fjs.getValueEditbox().sendKeys("Submit");
        Dimension editboxSize = fjs.getValueEditbox().getSize();
        System.out.println(editboxSize);
    }
}