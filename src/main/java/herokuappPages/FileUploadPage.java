package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static herokuappPages.HerokuPageBase.driver;

public class FileUploadPage {

    private String pageUrl ="https://the-internet.herokuapp.com/upload";
    private By uploadBtnLocator = By.id("file-upload");
    private By submitBtnLocator = By.id("file-submit");
    private By pageHeader = By.tagName("h3");
    private By fileNameContainer =  By.id("uploaded-files");

    WebDriverWait wait;


/*
Upload file
@param
String pathToFile : full qualified name of the file (filePath/filename.extension)
 */
    public void FileUpload(String pathToFile){
        driver.findElement(uploadBtnLocator).sendKeys(pathToFile);
        driver.findElement(submitBtnLocator).click();

    }
/*
wait untill upload is complete
then get the displayed uploaded file name
 */
    public String getUploadedFileName(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.textToBe(pageHeader,"File Uploaded!"));
        return driver.findElement(fileNameContainer).getText();
    }

}
