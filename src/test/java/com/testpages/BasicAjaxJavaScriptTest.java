package com.testpages;
import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.BasicAjaxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class BasicAjaxJavaScriptTest extends BaseClass {
 @Test()
 public static void pickCategoryAndVerifyLanguage() throws Exception {
  //Call the Automation page link
     AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
     //Click on the Ajax link
     WebDriverUtils.clickElement(apl.getBasicAjaxJavaScriptPageLink());
     BasicAjaxPage bap= PageFactory.initElements(driver, BasicAjaxPage.class);
     //Call the select class
     WebDriverUtils.selectElement(bap.getCategoryDropdown(), "Desktop");
     //Wait for the specific language to display
     WebDriverUtils.waitForElement(driver, bap.getcLanguage());
     //Varify the Category dropdown values
     List<String> expValues= fil.getExcelData("Ajax1", 0,0);
     //Capture the expected values
     List<String> actValues= bap.getLanguages();
     System.out.println(actValues);
     System.out.println(expValues);
     //Verify the languages for Desktop category
     Assert.assertEquals(actValues, expValues);
     System.out.println("Expected values are :"+actValues);
  }
  @Test()
    public static void submitBasicAjaxAndVerifyTitle() throws InterruptedException {
      //Call the Automation page link
      AutomationPageLink apl= PageFactory.initElements(driver, AutomationPageLink.class);
      //Click on the Ajax link
      WebDriverUtils.clickElement(apl.getBasicAjaxJavaScriptPageLink());
      //Click on the code in it
      BasicAjaxPage bap= PageFactory.initElements(driver, BasicAjaxPage.class);
      WebDriverUtils.clickElement(bap.getCodeInItButton());
      String title= driver.getTitle();
      //Verify the title
      Assert.assertTrue(title.contains("Processed"));
      System.out.println(title);
  }

  @Test(enabled=false)
    public static void verifySubmittedBasicAjax() throws InterruptedException {
      //Call the Automation page link
      AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
      //Click on the Ajax link
      WebDriverUtils.clickElement(apl.getBasicAjaxJavaScriptPageLink());
      BasicAjaxPage bap = PageFactory.initElements(driver, BasicAjaxPage.class);
      String category = bap.getCategoryDropdown().getText();
      String language = bap.getLanguageDropdown().getText();
      bap.getCodeInItButton().click();
      WebDriverUtils.waitForPageLoad(driver);
      String idTxt = driver.findElement(By.id("_id")).getText();
      Assert.assertTrue(idTxt.contains("Web"));

  }

}
