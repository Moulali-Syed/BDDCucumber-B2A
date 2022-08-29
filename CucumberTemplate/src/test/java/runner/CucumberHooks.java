package runner;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("In before all");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("In after all");
	}
}
