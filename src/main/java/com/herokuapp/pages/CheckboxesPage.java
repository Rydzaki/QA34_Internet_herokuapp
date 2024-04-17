package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(css = "[type='checkbox']:nth-of-type(1)")
//    WebElement checkbox1;
    @FindBy(css = "[type='checkbox']:nth-of-type(2)")
    WebElement checkbox2;

    public CheckboxesPage selectCheckbox(/*int choice*/) {
//        switch (choice){
//            case 1: click(checkbox1);break;
//            case 2: click(checkbox2);break;
//        }
        click(checkbox2);
        return this;
    }
}
