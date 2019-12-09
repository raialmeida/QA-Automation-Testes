package TesteWebJump.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", 
glue = "TesteWebJump.steps", 
features = "src\\test\\resources\\Feature\\TesteWebJump.feature",
monochrome = true,
snippets = SnippetType.CAMELCASE,
dryRun = false,
strict = false)

public class Runner {

}
