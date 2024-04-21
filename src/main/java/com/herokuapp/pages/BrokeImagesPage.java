package com.herokuapp.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BrokeImagesPage extends BasePage {
    public BrokeImagesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "img")
    List<WebElement> images;

    public BrokeImagesPage checkBrokenImages() {

        System.out.println("We have "+ images.size() + " images");

        for (WebElement image : images) {
            String imageUrl = image.getAttribute("src");
            verifyLinks(imageUrl);

            try {
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth != undefined && arguments[0].naturalWidth > 0);", image);
                if (imageDisplayed) {
                    System.out.println("DISPLAY - OK");
                    System.out.println("====================================");
                } else {
                    System.out.println("DISPLAY - BROKEN");
                    System.out.println("==================================");
                }
            } catch (Exception e) {
                System.out.println("Error occurred");
            }
        }
        return this;
    }
}
