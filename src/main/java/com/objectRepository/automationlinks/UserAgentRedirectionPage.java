package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAgentRedirectionPage {
/*****************Initialization*********************/
@FindBy(partialLinkText ="mobile/user-agent-mobile-test")
private WebElement userAgentMobileLink;

/*****************Getters Usage**********************/

public WebElement getUserAgentMobileLink() {
    return userAgentMobileLink;
}

/******************Utilization***********************/


}
