package heroku_2;

import herokuapp.FileUploadPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFileUpload extends HerokuTestBase{
    private String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\";
    private String fileName = "Capture3.PNG";
    @Test
    public void testUpload(){
        FileUploadPage fileUploadObject = new FileUploadPage();
        fileUploadObject.FileUpload(filePath+fileName);
        Assert.assertEquals(fileUploadObject.getUploadedFileName(),fileName);
    }
}
