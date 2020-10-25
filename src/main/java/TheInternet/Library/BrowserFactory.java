package TheInternet.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {

    private WebDriver driver;

    public void initBrowser(){
        try {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
            driver = new ChromeDriver(chromeOptions);
            driver.get("https://the-internet.herokuapp.com/");
            System.out.println("Started Chromedriver in headless mode.....");
        }
        catch(Exception ex)
        {
            System.out.println("EXCEPTION OCCURED "+ex.getLocalizedMessage());
        }
    }

    public void closeBrowser(){
        try {
            driver.quit();
            System.out.println("Closed Browser...");
        }
        catch(Exception ex)
        {
            System.out.println("EXCEPTION OCCURED "+ex.getMessage());
        }
    }

    public WebDriver getDriver(){
        if(driver == null)
            initBrowser();
        return driver;
    }
}
