package google_tests;

import google.PageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;

public class TestBase {
    private WebDriver driver ;
    @BeforeTest
    public void setupTest(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setupTestMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        PageBase PageBaseObject = new PageBase(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult testResult){
        Allure.addAttachment(testResult.getName(), new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        driver.quit();
    }
}
