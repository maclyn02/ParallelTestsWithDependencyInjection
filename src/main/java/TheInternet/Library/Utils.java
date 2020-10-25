package TheInternet.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils{

    private WebDriver driver;
    public Utils(WebDriver driver){
        this.driver = driver;
    }
    public void waitForVisibility(WebElement element, int waitInSeconds){
        WebDriverWait wait=new WebDriverWait(this.driver,waitInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void staticWait(int seconds){
        this.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }
}
