package com.testpages;
import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class DragAndDropTest extends BaseClass {
    @Test()
    public static void verifyDragAndDrop() throws InterruptedException {
        //Call the Automationpage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on drag and drop
        WebDriverUtils.clickElement(apl.getDragDropExampleLink());
        //Call the

    }

}
