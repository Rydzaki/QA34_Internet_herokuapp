package com.herokuapp.tests;

import com.herokuapp.pages.FileUploaderPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploaderTest extends TestBase{
    
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).selectFileUploader();
    }
    
    @Test
    public void downloadFileTest(){
        new FileUploaderPage(driver).chooseFile("R:/BM.jpg").upload().verifySuccessTitle("BM.jpg");
        
    }
    
}


//./src/main/java/com/herokuapp/files/BM.jpg