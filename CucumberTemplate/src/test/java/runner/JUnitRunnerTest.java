package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions()
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
