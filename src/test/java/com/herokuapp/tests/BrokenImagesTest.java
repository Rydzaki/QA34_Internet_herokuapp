package com.herokuapp.tests;

import com.herokuapp.pages.BrokeImagesPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTest extends TestBase
{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectBrokenImages();
    }

    @Test
    public void brokenImagesTest(){
        new BrokeImagesPage(driver).checkBrokenImages();

    }


}
