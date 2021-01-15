package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FieldValidationJavaScriptExamplePage {
  /******************Initialization*************/
 @FindBy(name="value")
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
