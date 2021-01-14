package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BasicWebPage {

    /***********Initialization*************/
    @FindBy(xpath="//div[@class='centered']/p")
    private List<WebElement> paragraphs;


    /***********Getters Usage*************/


    /***********Utilization*************/

    public List<String> printParagraphs() {
        List<String> data= new ArrayList<String>();
        for(int i=0; i<paragraphs.size(); i++) {
            data.add(paragraphs.get(i).getText());
        }
        return data;
    }
}
