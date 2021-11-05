package herokuFileUpload_2;

import herokuappPages.DynamicLoadingPage;
import herokuappPages.Example2Page;
import herokuappPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDynamicLoading extends HerokuTestBase{
    String expectedText = "Hello World!";
    @Test
    public void testDynamicWaiting(){
        HomePage homePageObject = new HomePage();
        homePageObject.navigateToDynamicLoadingPage();
        DynamicLoadingPage DynamicLoadingPageObject = new DynamicLoadingPage();
        DynamicLoadingPageObject.navigateToExample2Page();
        Example2Page Example2PageObject = new Example2Page();
        Example2PageObject.startLoadingElement();
        Assert.assertEquals( Example2PageObject.getElementText(),expectedText);
    }
}