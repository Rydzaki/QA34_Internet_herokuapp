package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploaderPage extends BasePage{
    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#file-upload")
    WebElement fileUpload;

    public FileUploaderPage chooseFile(String path) {

        click(fileUpload);
        fileUpload.sendKeys(path);
        return this;
    }

    @FindBy(id = "file-submit")
    WebElement fileSubmit;

    public FileUploaderPage upload() {
        click(fileSubmit);
        return this;
    }

    @FindBy(tagName = "h1")
    WebElement successTitle;

    public FileUploaderPage verifySuccessTitle(String title) {
        Assert.assertTrue(shouldHaveText(successTitle, title, 10));
        return this;
    }
}
