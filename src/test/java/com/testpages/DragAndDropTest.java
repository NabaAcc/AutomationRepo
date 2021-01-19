
package com.testpages;
import com.genericLibraries.BaseClass;
import com.genericLibraries.WebDriverUtils;
import com.objectRepository.automationlinks.AutomationPageLink;
import com.objectRepository.automationlinks.dragDropExamplePage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DragAndDropTest extends BaseClass {
    @Test()
    public static void verifyDragAndDrop() throws InterruptedException {
        //Call the Automationpage link
        AutomationPageLink apl = PageFactory.initElements(driver, AutomationPageLink.class);
        //Click on drag and drop
        WebDriverUtils.clickElement(apl.getDragDropExampleLink());
        //Call the drag and drop class
        dragDropExamplePage ddt= PageFactory.initElements(driver, dragDropExamplePage.class);
        //Declare the action class to perform drag and drop
        Actions act= new Actions(driver);
        act.dragAndDrop(ddt.getDragMe1(), ddt.getDropHere1()).build().perform();
        act.dragAndDrop(ddt.getDragMe2(), ddt.getDropHere2()).build().perform();
        String dropHereText1= ddt.getDropHere1().getText();
        String dropHereText2= ddt.getDropHere2().getText();
        System.out.println(dropHereText1);
        System.out.println(dropHereText2);
        //Verify the drag and drop
        Assert.assertTrue(dropHereText1.contains("Dropped"));
        Assert.assertTrue(dropHereText2.contains("Dropped"));
    }

}

