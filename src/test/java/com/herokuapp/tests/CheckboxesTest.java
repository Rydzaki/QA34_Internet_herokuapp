package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectCheckboxes();
    }
    
    @Test
    public void choiceCheckboxTest(){
        new CheckboxesPage(driver).selectCheckbox(2);
    }
}
