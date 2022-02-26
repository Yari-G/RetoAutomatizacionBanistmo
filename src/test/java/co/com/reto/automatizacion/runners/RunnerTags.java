package co.com.reto.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/retoBanistmo.feature",
        tags = "@Scenario1",
        glue = "co.com.reto.automatizacion",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
