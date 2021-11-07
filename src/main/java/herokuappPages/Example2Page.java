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
/*
clicks on the start button
Behaviour : the WebElement takes some undefined time to load

 */
    public void startLoadingElement(){

        driver.findElement(startBtnLocator).click();
    }
/*
wait untill the element is loaded
then
get the textual content of the dynamically loadded element
 */
    public String getElementText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadingElementLocator));
        return  driver.findElement(loadingElementLocator).getText();
    }

}
