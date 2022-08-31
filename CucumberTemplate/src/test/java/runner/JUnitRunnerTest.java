package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html",
		"summary" }, snippets = CAMELCASE, dryRun = false, monochrome = false
		,tags="@Scenario1",
		glue="awesomecucumber",
		features = "resourceFiles") // -----[1]
public class JUnitRunnerTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
}
