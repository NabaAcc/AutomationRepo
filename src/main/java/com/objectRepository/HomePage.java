package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
/************Initialization***************/
@FindBy(xpath="//ul[@id='menu-main-menu']/li[2]")
private WebElement platformIcon;
@FindBy(xpath = "//ul[@class='inner-menu']/li/a[text()='Mobile Test Recorder']")
private WebElement mobileRecorder;
@FindBy(xpath="//h1[text()='Mobile Test Recorder']")
private WebElement mobRecorderText;



/*****************Getters Usage***********/
    public WebElement getPlatformIcon() {
        return platformIcon;
    }

    public WebElement getMobileRecorder() {
        return mobileRecorder;
    }
    public WebElement getMobRecorderText() {
        return mobRecorderText;
    }

/********************Utilization***********/


}