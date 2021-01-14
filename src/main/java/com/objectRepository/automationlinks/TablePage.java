package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablePage {
    /**************Initialization**************/
    @FindBy(xpath = "//h1[text()='HTML TABLE Tag']")
    private WebElement tablePageTitle;
    @FindBy(xpath = "//tbody/tr/td[1]")
    private List<WebElement> nameColumnValues;
    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> amountColumnValues;


    /**************Getters Usage************/

    public WebElement getTablePageTitle() {
        return tablePageTitle;
    }

    /**************Utilization**************/

    public String tableValue() {
        String val=null;
        for(int i=0; i<nameColumnValues.size(); i++) {
            if(nameColumnValues.get(i).getText().equalsIgnoreCase("Alan")) {
                val=nameColumnValues.get(i).getText();
            }
        }
        return val;

    }

}



