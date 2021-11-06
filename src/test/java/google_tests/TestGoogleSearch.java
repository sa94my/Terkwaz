package google_tests;

import google.SearchPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleSearch extends TestBase{
    String searchKeyword = "selenium webdriver";
    int indexOfSearchResult=3 ;
    String expectedText = "What is Selenium WebDriver?";

    @Test(description = "verify search results contain a specific String ")
    @Description("searching for web driver and checking the results")
    public void testSearchWithKeyword(){
        SearchPage searchPageObject = new SearchPage();
        searchPageObject.searchWithString(searchKeyword);
        Assert.assertEquals(searchPageObject.getNthResultText(indexOfSearchResult),expectedText);
    }
}
