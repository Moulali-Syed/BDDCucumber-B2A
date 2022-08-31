package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"})
public class TestNGRunnerTest extends AbstractTestNGCucumberTests{

	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
}
