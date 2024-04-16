package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.tethering.model.Accepted;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlert;
    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement jsConfirm;
    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement jsPrompt;


    public AlertsPage alertButton() {
        click(jsAlert);
        AlertsPage alert = new AlertsPage(driver);
        Assert.assertTrue(alert.isAlertPresent());
        return this;
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            driver.switchTo().alert().accept();
            return true;

        }
    }

    public AlertsPage confirmButton(String confirm) {
        click(jsConfirm);
        if(confirm != null && confirm.equalsIgnoreCase("Ok")){
            driver.switchTo().alert().accept();
        } else if(confirm != null && confirm.equalsIgnoreCase("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    public AlertsPage promptButtonSentMessage(String message) {
        click(jsPrompt);
        if(message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    public AlertsPage verifyPrompt(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }
}
