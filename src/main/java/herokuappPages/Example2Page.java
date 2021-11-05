package herokuappPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static herokuappPages.HerokuPageBase.driver;

public class Example2Page {
    WebDriverWait wait ;
    private By startBtnLocator = By.tagName("button");
    private By loadingElementLocator = By.id("finish");

    public void startLoadingElement(){

        driver.findElement(startBtnLocator).click();
    }

    public String getElementText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadingElementLocator));
        return  driver.findElement(loadingElementLocator).getText();
    }

}
