package TheInternetTest.StepDefinitions;

import TheInternet.BaseContext;
import TheInternet.Library.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchStep {

    BrowserFactory browserFactory = new BrowserFactory();
    BaseContext baseContext;

    public SearchStep(BaseContext baseContext){
        this.baseContext = baseContext;
    }

    @Before
    public void startup(){
        browserFactory.initBrowser();
        WebDriver driver = browserFactory.getDriver();
        baseContext.setDriver(driver);
        baseContext.initializePageFactory(driver);
    }

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        Assert.assertTrue(baseContext.getTheInternet().isUserOnHomePage());
    }

    @When("user clicks link for {string}")
    public void userEntersCountryNameAs(String link) {
        baseContext.getTheInternet().clickOnLink(link);
    }

    @Then("user must see {string} in results")
    public void userMustSeeInResults(String link) {
        Assert.assertEquals(baseContext.getTheInternet().getLinkHeader(),link);
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed())
            System.out.println("FAILED: --------------------- "+scenario.getName());
        else
            System.out.println("PASSED: --------------------- "+scenario.getName());

        baseContext.getDriver().quit();
    }
}
