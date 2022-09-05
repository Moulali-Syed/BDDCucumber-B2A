package awesomecucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue = {"awesomecucumber"},
		features = "src/test/resources/awesomecucumber"
		)
public class MyJUnitRunnerTest {

}
