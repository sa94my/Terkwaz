package herokuApp_tests;

import herokuappPages.FileUploadPage;
import herokuappPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFileUpload extends HerokuTestBase{
    private String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
    private String fileName = "Capture3.PNG";
    @Test
    public void testUpload(){
        HomePage homePageObject = new HomePage();
        homePageObject.navigateToFileUploadPage();
        FileUploadPage fileUploadObject = new FileUploadPage();
        fileUploadObject.FileUpload(filePath+fileName);
        Assert.assertEquals(fileUploadObject.getUploadedFileName(),fileName);
    }
}
