package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAgentMobilePage {
    /*************Initialization**************/
    @FindBy(xpath ="//div[@class='explanation']/p/a")
    private WebElement redirectPage;

    /*************Getters Usage************/
    public WebElement getRedirectPage() {
        return redirectPage;
    }

    /*************Utilization**************/

}
