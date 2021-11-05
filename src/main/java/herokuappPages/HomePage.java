package herokuappPages;

import org.openqa.selenium.By;
import static herokuappPages.HerokuPageBase.driver;

public class HomePage {
    private String pageUrl = "https://the-internet.herokuapp.com/";
    private By fileUploadPage = By.linkText("File Upload");

    public HomePage() {
        driver.get(pageUrl);
    }

    public void navigateToFileUploadPage(){
        driver.findElement(fileUploadPage).click();
    }

}
