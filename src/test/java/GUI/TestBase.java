package GUI;

import google.PageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestBase {
    private WebDriver driver ;
    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setupTestMethod(){
        driver = new ChromeDriver();
        PageBase PageBaseObject = new PageBase(driver);
    }

    @AfterMethod
    public void tearDown(){
    driver.quit();
    }
}
