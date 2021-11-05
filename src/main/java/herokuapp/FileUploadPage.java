package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static herokuapp.HerokuPageBase.driver;

public class FileUploadPage {

    private String pageUrl ="https://the-internet.herokuapp.com/upload";
    private By uploadBtnLocator = By.id("file-upload");
    private By submitBtnLocator = By.id("file-submit");
    private By pageHeader = By.tagName("h3");
    private By fileNameContainer =  By.id("uploaded-files");

    WebDriverWait wait;

    /*
    navigate directly to the test page rather than home page > test page
     */
    public FileUploadPage(){
        driver.get(pageUrl);
    }

    public void FileUpload(String pathToFile){
        driver.findElement(uploadBtnLocator).sendKeys(pathToFile);
        driver.findElement(submitBtnLocator).click();

    }

    public String getUploadedFileName(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.textToBe(pageHeader,"File Uploaded!"));
        return driver.findElement(fileNameContainer).getText();
    }

}
