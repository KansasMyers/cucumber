package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty", 
		features = "classpath:features/",
		// monochrome = true,
		snippets = SnippetType.CAMELCASE,
		glue = { "steps" },
		dryRun = false
)
public class TestRunner {

}
