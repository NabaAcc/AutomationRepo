package com.objectRepository.automationlinks;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasicAjaxPage {
    /**********Initialization************/
    @FindBy(id="combo1")
    private WebElement categoryDropdown;
    @FindBy(id = "combo2")
    private WebElement languageDropdown;
    @FindBy(name="submitbutton")
    private WebElement codeInItButton;
    @FindBy(xpath="//select[@id='combo2']/option")
    List<WebElement> languageDropdownValues;
    @FindBy(xpath = "//select[@id='combo2']/option[text()='C++']")
    private WebElement cLanguage;


    /**************Getters Usage*********/
    public WebElement getcLanguage() {
        return cLanguage;
    }

    public WebElement getCategoryDropdown() {
        return categoryDropdown;
    }

    public WebElement getLanguageDropdown() {
        return languageDropdown;
    }

    public WebElement getCodeInItButton() {
        return codeInItButton;
    }

/****************Utilization*********/

public  List<String> getLanguages() {
    List<String> val = new ArrayList<String>();
    for (int i = 0; i < languageDropdownValues.size(); i++) {
        WebDriverUtils.waitForElement(BaseClass.driver, languageDropdownValues.get(i));
      val.add(languageDropdownValues.get(i).getText());
    }
    return val;
}

}
