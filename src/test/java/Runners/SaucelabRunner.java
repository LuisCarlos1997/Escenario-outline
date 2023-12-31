package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/abrir.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "Stepdefinitions"
)
public class SaucelabRunner {
}
