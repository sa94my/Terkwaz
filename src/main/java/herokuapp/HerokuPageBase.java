package herokuapp;

import org.openqa.selenium.WebDriver;

public class HerokuPageBase {

    protected static WebDriver driver;

    public HerokuPageBase(WebDriver driver) {
        this.driver = driver;
    }

    public  WebDriver getDriver() {
        return driver ;
    }

}
