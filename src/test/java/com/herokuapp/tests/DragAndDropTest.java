package com.herokuapp.tests;

import com.herokuapp.pages.DragAndDropPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectDragAndDrop();
    }
    
    @Test   
    public void dragAndDropTest(){
        new DragAndDropPage(driver).actionDragAndDrop();

    }
    
    
}
