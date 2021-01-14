package com.testpages;

import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.DynamicTablePage;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.http.JsonHttpResponseCodec;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class DynamicTableTest extends BaseClass {
    @Test()
    public static void verifyDynamicTable() throws InterruptedException, ParseException {
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on dynamic table link
        WebDriverUtils.clickElement(apl.getDynamicTestPage());
        DynamicTablePage dtp= PageFactory.initElements(driver, DynamicTablePage.class);
        //Click on  table data
        WebDriverUtils.clickElement(dtp.getTableDataButton());
        //Capture the age
    Map<String, Integer> text= new HashMap<String, Integer>();
           text.put(dtp.getTextArea().getText(),null);
     System.out.println(text);
        /*JSONObject jsonobject = new JSONObject(text);
        System.out.println(jsonobject.getName("George"));
        System.out.println(jsonobject.getInt("id"));*/





    }


}
