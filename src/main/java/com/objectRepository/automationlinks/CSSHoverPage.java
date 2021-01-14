package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSSHoverPage {

    /************Initialization****************/
    @FindBy(id="hoverpara")
    private WebElement hoverParaButton;
    @FindBy(id="hoverparaeffect")
    private WebElement hoverParaText;
    @FindBy(id="hoverdivpara")
    private WebElement hoverDivParaButton;
    @FindBy(partialLinkText = "Can you click")
    private WebElement clickMeLink;
    @FindBy(xpath = "//div[@class='page-body']/div[2]/p")
    private WebElement actionCompleteText;
    @FindBy(id="returnlink")
    private WebElement returnPageButton;

    /***************Getters Usage**************/
    public WebElement getHoverParaButton() {
        return hoverParaButton;
    }

    public WebElement getHoverParaText() {
        return hoverParaText;
    }

    public WebElement getHoverDivParaButton() {
        return hoverDivParaButton;
    }

    public WebElement getClickMeLink() {
        return clickMeLink;
    }

    public WebElement getActionCompleteText() {
        return actionCompleteText;
    }

    public WebElement getReturnPageButton() {
        return returnPageButton;
    }

    /****************Utilization***************/

}
