package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement a;
    @FindBy(id = "column-b")
    WebElement b;

    public DragAndDropPage  actionDragAndDrop() {
        Actions actions = new Actions(driver);

        int xOffSetA = a.getLocation().getX();
        int yOffSetA = a.getLocation().getY();
        System.out.println("X "+ xOffSetA+ " Y "+ yOffSetA);

        int xOffSetB = b.getLocation().getX();
        int yOffSetB = b.getLocation().getY();
        System.out.println("X "+ xOffSetB+ " Y "+ yOffSetB);

        int xOffset = (xOffSetB - xOffSetA);
        int yOffset= (yOffSetB - yOffSetA);

        actions.dragAndDropBy(a, xOffset, yOffset).perform();

        if(b.getText().equals("A") && a.getText().equals("B")){
            System.out.println("PASS!");
        }else{
            System.out.println("FAIL!");
        }


        return this;

    }
}
