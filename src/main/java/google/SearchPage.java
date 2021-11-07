package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static google.PageBase.driver;

public class SearchPage {
    private By searchBoxLocator = By.name("q");
    private String pageUrl="https://www.google.com/ncr";
    // locator to search results excluding "people also search for" results
    //reconsider this locator
    private String searchResultsContainers = "(//div[@class='tF2Cxc'][.//div[contains(@class,'VwiC3b ')]])";

    //navigate to the page URL upon page object creation
    public SearchPage(){
        driver.get(pageUrl);
    }

    /*
     perform a search with given text
     @param
     String searchKeyword : keyword to search for
     */
    public void searchWithString(String searchKeyword){
        driver.findElement(searchBoxLocator).sendKeys(searchKeyword);
        driver.findElement(searchBoxLocator).sendKeys(Keys.ENTER);
    }

    // get the textual content of a given search result
    public String getNthResultText(int resultIndex){
        return driver.findElement(getXpathForNthSearchResult(resultIndex)).getText();
    }
    /*
    for internal use
    to allow for dynamic selection of search results
     */
    private By getXpathForNthSearchResult(int resultIndex){
        /*
            TODO
            error handling if input exceeds number of search results
         */
        String locatorToSpecificSearchResult = searchResultsContainers+"["+resultIndex+"]";
        return By.xpath(locatorToSpecificSearchResult);
    }
}
