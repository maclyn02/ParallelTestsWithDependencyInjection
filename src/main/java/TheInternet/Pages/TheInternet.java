package TheInternet.Pages;

import TheInternet.Library.Utils;
import org.openqa.selenium.*;

public class TheInternet extends BasePage{

    Utils utils;
    public TheInternet(WebDriver driver){
        super(driver);
        utils = new Utils(driver);

    }
    public Boolean isUserOnHomePage(){
        WebElement heading = driver.findElement(By.cssSelector("h1.heading"));
        utils.waitForVisibility(heading,20);
        return heading.isDisplayed() && heading.getText().equals("Welcome to the-internet");
    }

    public void clickOnLink(String linkTitle){
        utils.staticWait(1000);
        try{
            WebElement link = getDriver().findElement(By.xpath("//a[text()='"+linkTitle+"']"));
            link.click();
        }
        catch(NotFoundException ex){
            System.out.println("Cannot find the element... "+ex.getMessage());
        }
    }

    public String getLinkHeader(){
        WebElement linkHeader = getDriver().findElement(By.cssSelector(".example>h3"));
        utils.waitForVisibility(linkHeader,20);
        return linkHeader.getText();
    }

}
