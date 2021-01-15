package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPageLink {

    /*************Initialization**************/
    @FindBy(id="basicpagetest")
    private WebElement basicWebPageLink;
    @FindBy(id = "tablestest")
    private WebElement tableTestPage;
    @FindBy(id = "dynamictablestest")
    private WebElement dynamicTestPage;
    @FindBy(id = "alerttest")
    private WebElement alertLinkPage;
    @FindBy(id = "fakealerttest")
    private WebElement fakeAlertTest;
    @FindBy(id = "iframestest")
    private WebElement frameTestLink;
    @FindBy(id = "htmlformtest")
    private WebElement htmlFormExample;
    @FindBy(id="fakealerttest")
    private WebElement fakeAlertLink;
    @FindBy(id="useragentredirect")
    private WebElement userAgentRedirectLink;
    @FindBy(id="fileuploadtest")
    private WebElement fileUploadExampleLink;
    @FindBy(id="csspseudohover")
    private WebElement hoverTestLink;
    @FindBy(id="basicajaxtest")
    private WebElement basicAjaxJavaScriptPageLink;
    @FindBy(id="useractionstest")
    private WebElement dragDropExampleLink;
    @FindBy(id="javascriptfieldvalidationtest")
    private WebElement fieldValidationJSlink;

    /***************Getters Usage**************/
    public WebElement getFieldValidationJSlink() {
        return fieldValidationJSlink;
    }
    public WebElement getDragDropExampleLink() {
        return dragDropExampleLink;
    }
    public WebElement getBasicAjaxJavaScriptPageLink() {
        return basicAjaxJavaScriptPageLink;
    }
    public WebElement getHoverTestLink() {
        return hoverTestLink;
    }
    public WebElement getFileUploadExampleLink() {
        return fileUploadExampleLink;
    }
    public WebElement getUserAgentRedirectLink() {
        return userAgentRedirectLink;
    }
    public WebElement getFakeAlertLink() {
        return fakeAlertLink;
    }
    public WebElement getBasicWebPageLink() {
        return basicWebPageLink;
    }
    public WebElement getFrameTestLink() {
        return frameTestLink;
    }

    public WebElement getTableTestPage() {

        return tableTestPage;
    }

    public WebElement getDynamicTestPage() {

        return dynamicTestPage;
    }

    public WebElement getAlertLinkPage() {

        return alertLinkPage;
    }

    public WebElement getFakeAlertTest() {
        return fakeAlertTest;
    }
    public WebElement getHtmlFormExample() {
        return htmlFormExample;
    }

    /***************Utilization***************/

}

