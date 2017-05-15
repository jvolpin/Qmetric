package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 15/05/2017.
 */
public class LandingPage extends AbstractPage {

    @FindBy(id = "gh-ac")
    private WebElement searchBar;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public ResultsPage simpleSearch(String target) {
        searchBar.sendKeys(target);
        searchButton.click();
        return new ResultsPage(driver);
    }
}