package google;

import org.openqa.selenium.WebDriver;
/*
  This class should contain common elements across google website
   */
public class PageBase {
  // a static Webdriver instance that can be accessed
  // from all google page classes within this package
    protected static WebDriver driver;

    //driver is only set at creation
    public  PageBase(WebDriver driver) {
        this.driver = driver;
    }



}
