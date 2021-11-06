package herokuApp_tests;

import herokuappPages.HerokuPageBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;

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
    public void tearDown(ITestResult testResult){
        Allure.addAttachment(testResult.getName(), new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        driver.quit();
    }

    @AfterSuite
    public void closureActivity(){
        //open Allure report
        try {
            Runtime.getRuntime().exec("cmd /c allure serve target/allure-results");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
