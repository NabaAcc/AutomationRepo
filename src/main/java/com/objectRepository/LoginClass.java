package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginClass {
    /************Initialization***************/
    @FindBy(linkText="Free Sign Up")
    private WebElement freeSignUP;



    /*****************Getters Usage***********/
    public WebElement getFreeSignUP() {
        return freeSignUP;
    }
    /********************Utilization***********/
}
