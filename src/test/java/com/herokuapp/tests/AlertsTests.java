package com.herokuapp.tests;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectAlerts();
        
    }
    
    @Test
    public void clickForAlertTest(){
        new AlertsPage(driver).alertButton();

        
    }
    @Test
    public void clickForConfirmTest(){
        new AlertsPage(driver).confirmButton("cancel").verifyResult("Cancel");

    }
    @Test
    public void clickForPromptTest(){
        new AlertsPage(driver).promptButtonSentMessage("Hello world!").verifyPrompt("Hello world!");


    }
    
    
    
}
