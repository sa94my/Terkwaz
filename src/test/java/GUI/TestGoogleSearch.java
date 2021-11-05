package GUI;

import google.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleSearch extends TestBase{
    String searchKeyword = "selenium webdriver";
    int indexOfSearchResult=3 ;
    String expectedText = "What is Selenium WebDriver?";

    @Test
    public void testSearchWithKeyword(){
        SearchPage searchPageObject = new SearchPage();
        searchPageObject.searchWithString(searchKeyword);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(searchPageObject.getNthResultText(indexOfSearchResult),expectedText);
    }
}
