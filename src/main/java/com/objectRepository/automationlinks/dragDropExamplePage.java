package com.objectRepository.automationlinks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dragDropExamplePage {
    /*************Initialization***************/
    @FindBy(id="draggable1")
    private WebElement dragMe1;
    @FindBy(id="draggable2")
    private WebElement dragMe2;
    @FindBy(id="droppable1")
    private WebElement dropHere1;
    @FindBy(id="droppable2")
    private WebElement dropHere2;

    /*************Getters Usage***************/
    public WebElement getDragMe1() {
        return dragMe1;
    }

    public WebElement getDragMe2() {
        return dragMe2;
    }

    public WebElement getDropHere1() {
        return dropHere1;
    }

    public WebElement getDropHere2() {
        return dropHere2;
    }
    /*************Utilization***************/


}
