package TheInternet;

import TheInternet.Pages.TheInternet;
import org.openqa.selenium.WebDriver;

public class BaseContext {

    WebDriver driver;
    TheInternet theInternet;

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public TheInternet getTheInternet(){
        return this.theInternet;
    }

    public void initializePageFactory(WebDriver driver){
        theInternet = new TheInternet(driver);
    }
}
