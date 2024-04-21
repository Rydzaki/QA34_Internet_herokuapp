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

    @FindBy(css = "a[href='/checkboxes']")
    WebElement checkboxes;

    public CheckboxesPage selectCheckboxes() {
        click(checkboxes);
        return new CheckboxesPage(driver);
    }


    @FindBy(css = "a[href='/dropdown']")
    WebElement dropdown;

    public DropdownPage selectDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(css = "a[href='/upload']")
    WebElement upload;

    public FileUploaderPage selectFileUploader() {
        //clickWithJS(upload, 0, 300);
        click(upload);
        //pause(500);
        return new FileUploaderPage(driver);
    }


    @FindBy(css = "a[href='/broken_images']")
    WebElement brokenImages;
    public BrokeImagesPage selectBrokenImages() {
        click(brokenImages);
        return new BrokeImagesPage(driver);
    }

    @FindBy(css = "a[href='/drag_and_drop']")
    WebElement dragAndDropMenu;

    public DragAndDropPage selectDragAndDrop() {
        click(dragAndDropMenu);
        return new DragAndDropPage(driver);
    }
}
