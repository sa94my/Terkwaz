package herokuApp_tests;

import herokuappPages.HerokuPageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class HerokuTestBase {
    private WebDriver driver ;
    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTestMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        HerokuPageBase HerokuPageBaseObject = new HerokuPageBase(driver);

    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }
}
