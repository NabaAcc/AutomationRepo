package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FieldValidationJavaScriptExamplePage {
  /******************Initialization*************/
 @FindBy(xpath="//div[@class='form-label']/input")
  private WebElement valueEditbox;
 @FindBy(name="submitbutton")
  private WebElement submitButton;


  /******************Getters Usage**************/

  public WebElement getValueEditbox() {
    return valueEditbox;
  }

  public WebElement getSubmitButton() {
    return submitButton;
  }

/*******************Utilization***************/




}
