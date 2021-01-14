package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class IframePage {
/************Initialization***************/
@FindBy(xpath="//div[@id='dynamic-iframe']/iframe")
    private WebElement dynamicFrame;
@FindBy(xpath="//div[@id='header-iframe']/iframe")
private WebElement headerFrame;
@FindBy(xpath="//ul/li")
    private List<WebElement> iFrameList;
@FindBy(xpath="//div[@id='dynamic-iframe']/../div[3]/h2")
private WebElement iframeExHeader;
@FindBy(xpath = "//h1[text()='Nested Page Example']")
private WebElement nestedPageEx;

/************Getters Usage***************/
public WebElement getNestedPageEx() {
    return nestedPageEx;
}
public WebElement getIframeExHeader(){
    return iframeExHeader;
}
public WebElement getDynamicFrame() {
    return dynamicFrame;
}
public WebElement getHeaderFrame() {
    return headerFrame;
}

/************Utilization***************/
public List<String> printFrameList() {
    List<String> val= new ArrayList<String>();
    for(int i=0; i<iFrameList.size(); i++) {
        val.add(iFrameList.get(i).getText());
    }
    return val;
}


}
