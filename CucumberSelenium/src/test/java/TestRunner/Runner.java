package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		dryRun = true,
		glue="Steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)

public class Runner extends AbstractTestNGCucumberTests{

}
