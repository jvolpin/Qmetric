package PageObjects;

import org.apache.bcel.generic.LAND;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 15/05/2017.
 */
public class ResultsPage extends LandingPage {

    @FindBy(xpath = "id('ListViewInner')/li[1]/h3/a")
    private WebElement firstSearchResult;

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public String getFirstResultTitle() {
        try {
            return firstSearchResult.getText();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            return "";
        }
    }

}
