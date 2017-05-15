package steps; /**
 * Created by Juan on 15/05/2017.
 */

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"html:target/cucumber-html-report"},
        features = {"Search.feature"}
)
public class RunCukesTest {
}