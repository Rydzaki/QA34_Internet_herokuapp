package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage{
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/windows/new']")
    WebElement newWindow;

    public MultipleWindowsPage switchToNextWindow(int index) {
        click(newWindow);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(css = "h3:first-child")
    WebElement newWindowMessage;

    public MultipleWindowsPage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(newWindowMessage, text, 5));
        return this;
    }
}
