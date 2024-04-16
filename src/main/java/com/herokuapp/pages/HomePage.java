package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.event.ActionListener;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        click(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(css = "a[href='/windows']")
    WebElement windows;

    public MultipleWindowsPage selectMultipleWindows() {
        click(windows);
        return new MultipleWindowsPage(driver);
    }
}
