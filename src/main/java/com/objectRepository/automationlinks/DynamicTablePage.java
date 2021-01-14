package com.objectRepository.automationlinks;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicTablePage {
    /**********Initialization**************/
    @FindBy(id="tablehere")
    private WebElement tableDataButton;
    @FindBy(id="caption")
    private WebElement caption;
    @FindBy(id="tableid")
    private WebElement Id;
    @FindBy(id="refreshtable")
    private WebElement refreshTableButton;
    @FindBy(id="jsondata")
    private  WebElement textArea;

    /**********Getters Usage**************/

    public WebElement getTableDataButton() {
        return tableDataButton;
    }

    public WebElement getCaption() {
        return caption;
    }

    public WebElement getId() {
        return Id;
    }

    public WebElement getRefreshTableButton() {
        return refreshTableButton;
    }
    public  WebElement getTextArea() {
        return textArea;
    }
    
    /**********Utilization**************/
//Method to read Json test
    public  int readJason(String name) throws ParseException {
        //Creating a json parser
        JSONParser jsonParser= new JSONParser();
        //Creating json object
        JSONObject jsonObject= (JSONObject) jsonParser.parse(textArea.getText().toString());
        //Reading Data from the Jason File
      int age= (Integer) jsonObject.get(name);
      return age;

    }

}


