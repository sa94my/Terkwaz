package herokuApp_tests;

import herokuappPages.FileUploadPage;
import herokuappPages.HomePage;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.json.JsonInput;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.JsonData;

public class TestFileUpload extends HerokuTestBase{
    private String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
    Object testData = JsonData.read("src/test/resources/TestData/HerokuTestData.json");
    private String fileName = JsonData.getAttribute(testData,0,"FileUpload","fileName");
    @Test(description = "check file uploading functioality")
    public void testUpload(){
        HomePage homePageObject = new HomePage();
        homePageObject.navigateToFileUploadPage();
        FileUploadPage fileUploadObject = new FileUploadPage();
        fileUploadObject.FileUpload(filePath+fileName);
        Assert.assertEquals(fileUploadObject.getUploadedFileName(),fileName);
    }
}
