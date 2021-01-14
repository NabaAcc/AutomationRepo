package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FakeAlertPage {

    /*******Initialization***********/
  @FindBy(id="fakealert")
    private WebElement showAlertBox;
  @FindBy(id="modaldialog")
    private WebElement showModalDialog;
   @FindBy(id="dialog-text")
   private WebElement dilogText;
   @FindBy(id="dialog-ok")
   private WebElement dilogOkay;
    /*******Getters Usage***********/
    public WebElement getShowAlertBox() {
        return showAlertBox;
    }
    public WebElement getShowModalDialog() {
        return showModalDialog;
    }

    public WebElement getDilogText() {
        return dilogText;
    }

    public WebElement getDilogOkay() {
        return dilogOkay;
    }
/*******Utilization***********/
}
