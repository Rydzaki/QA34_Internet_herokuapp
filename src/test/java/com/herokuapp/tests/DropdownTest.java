package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectDropdown();
    }
    
    @Test
    public void selectDropdownTest(){
        new DropdownPage(driver).selectOption(1);

    }
    
    
}
