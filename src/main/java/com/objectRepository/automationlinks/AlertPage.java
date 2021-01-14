package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage {
    /**********Initialiation*************/
    @FindBy(id="alertexamples")
    private WebElement showAlertboxButton;
    @FindBy(id="confirmexample")
    private WebElement showConfirmBoxButton;
    @FindBy(id="confirmreturn")
    private WebElement confirmReturn;
    @FindBy(id="promptexample")
    private WebElement showPromptBoxButton;
    @FindBy(id="promptreturn")
    private WebElement promptReturn;


/***************Getters Usage******************/
public WebElement getShowAlertboxButton() {

    return showAlertboxButton;
}

    public WebElement getShowConfirmBoxButton() {
        return showConfirmBoxButton;
    }

    public WebElement getConfirmReturn() {
        return confirmReturn;
    }

    public WebElement getShowPromptBoxButton() {
        return showPromptBoxButton;
    }

    public WebElement getPromptReturn() {
        return promptReturn;
    }
    /***************Utilization************/
}
