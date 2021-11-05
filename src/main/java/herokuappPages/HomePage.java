package herokuappPages;

import org.openqa.selenium.By;
import static herokuappPages.HerokuPageBase.driver;

public class HomePage {
    private String pageUrl = "https://the-internet.herokuapp.com/";
    private By fileUploadPageLink = By.linkText("File Upload");
    private By dynamicLoadingPageLink = By.linkText("Dynamic Loading");

    public HomePage() {
        driver.get(pageUrl);
    }

    public void navigateToFileUploadPage(){
        driver.findElement(fileUploadPageLink).click();
    }

    public void navigateToDynamicLoadingPage(){
        driver.findElement(dynamicLoadingPageLink).click();
    }

}
