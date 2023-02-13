package co.com.company.certificacion.training.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\company\\features\\login.feature",
        glue = "co.com.company.certificacion.training.stepdefinitios",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Login {
}
