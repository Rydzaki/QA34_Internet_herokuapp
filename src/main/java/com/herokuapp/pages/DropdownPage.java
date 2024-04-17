package com.herokuapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdownContainer;

    public DropdownPage selectOption(int option) {
        click(dropdownContainer);
        for (int i = 1; i <= option; i++) {
            dropdownContainer.sendKeys(Keys.DOWN);
        }
        dropdownContainer.sendKeys(Keys.ENTER);
        return this;
    }
}
