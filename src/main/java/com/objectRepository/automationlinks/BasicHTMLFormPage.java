package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicHTMLFormPage {
    /**************Initialization********************/
    @FindBy(xpath="//form[@id='HTMLFormElements']/table/tbody/tr[1]/td/input")
    private WebElement username;
    @FindBy(xpath="//form[@id='HTMLFormElements']/table/tbody/tr[2]/td/input")
    private WebElement password;
    @FindBy(name="comments")
    private WebElement textAreaComments;
    @FindBy(name="filename")
    private WebElement chooseFileButton;
    @FindBy(name="multipleselect[]")
    private WebElement multiSelectDropdown;
    @FindBy(name="dropdown")
    private WebElement selectDropdown;
    @FindBy(name="submitbutton")
    private WebElement submitButton;
    @FindBy(xpath = "//ul/li[@id='_valueusername']")
    private WebElement verifyUsername;
    @FindBy(xpath = "//div[@id='_valuepassword']/ul/li")
    private WebElement verifyPassword;


    /***************Getters Usage*****************/
    public WebElement getVerifyUsername() {
        return verifyUsername;
    }
    public WebElement getVerifyPassword() {
        return verifyPassword;
    }
    public WebElement getSubmitButton() {
        return submitButton;
    }
    public WebElement getSelectDropdown() {
        return selectDropdown;
    }
    public WebElement getMultiSelectDropdown() {
        return multiSelectDropdown;
    }
    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getTextAreaComments() {
        return textAreaComments;
    }

    public WebElement getChooseFileButton() {
        return chooseFileButton;
    }
/******************Utilization*******************/







}
