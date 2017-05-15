package steps;

import PageObjects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.LandingPage;
import org.testng.Assert;

/**
 * Created by Juan on 15/05/2017.
 */
public class SearchSteps {

    private WebDriver driver;
    private LandingPage currentPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "d:/downloads/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^the user is on landing page$")
    public void theUserIsOnLandingPage() {
        driver.get("http://www.ebay.com");
        currentPage = new LandingPage(driver);
    }

    @When("^the user searches for \"([^\"]*)\"$")
    public void theUserSearchesFor(String target) {
        currentPage.simpleSearch(target);
    }

    @Then("^he should see \"([^\"]*)\" in the results$")
    public void heShouldSeeInTheResults(String result) {
        String actualResult = ((ResultsPage)currentPage).getFirstResultTitle();
        Assert.assertTrue(((ResultsPage)currentPage).getFirstResultTitle().contains(result),"Product not found");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
