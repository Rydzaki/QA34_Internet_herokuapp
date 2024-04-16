package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.MultipleWindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectMultipleWindows();

    }

    @Test
    public void newMultipleWindowsTest(){
        new MultipleWindowsPage(driver).switchToNextWindow(1).verifyNewWindowMessage("New Window");
    }
    
    
    
}
