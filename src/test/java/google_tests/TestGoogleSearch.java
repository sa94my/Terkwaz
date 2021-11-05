package google_tests;

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
        Assert.assertEquals(searchPageObject.getNthResultText(indexOfSearchResult),expectedText);
    }
}
