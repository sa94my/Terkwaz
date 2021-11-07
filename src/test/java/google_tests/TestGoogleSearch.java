package google_tests;

import google.SearchPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.JsonData;

public class TestGoogleSearch extends TestBase{
    // save the contents of the json file at once
    Object testData = JsonData.read("src/test/resources/TestData/googleTestData.json");
    //get test data from json object
    String searchKeyword = JsonData.getAttribute(testData,0,"searchResult","keyword");
    int indexOfSearchResult=Integer.valueOf(JsonData.getAttribute(testData,0,"searchResult","resultIndex")) ;
    String expectedText = JsonData.getAttribute(testData,0,"searchResult","expectedResult");

    @Test(description = "verify search results contain a specific String ")
    @Description("searching for web driver and checking the results")
    public void testSearchWithKeyword(){
        SearchPage searchPageObject = new SearchPage();
        searchPageObject.searchWithString(searchKeyword);
        Assert.assertEquals(searchPageObject.getNthResultText(indexOfSearchResult),expectedText);
    }
}
