package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FileUploaderPage extends BasePage{
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileUpload;

    @FindBy(id = "file-submit")
    WebElement fileSubmit;

    public FileUploaderPage chooseFile(String path) {
        fileUpload.sendKeys(path);
        return this;
    }

    public FileUploaderPage upload() {
        click(fileSubmit);
        return this;
    }

    @FindBy(id = "uploaded-files")
    WebElement successTitle;

    public FileUploaderPage verifySuccessTitle(String title) {
        Assert.assertEquals(title, successTitle.getText());
        return this;
    }
}
