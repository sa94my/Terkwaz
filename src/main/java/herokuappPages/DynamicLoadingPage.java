package herokuappPages;

import org.openqa.selenium.By;

import static herokuappPages.HerokuPageBase.driver;

public class DynamicLoadingPage {
    private By example2PageLink = By.partialLinkText("Example 2");

    public void navigateToExample2Page(){
        driver.findElement(example2PageLink).click();
    }
}
