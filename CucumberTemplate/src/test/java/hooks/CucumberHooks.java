package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("\n In before all \n");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("\nIn after all\n");
	}
	
	@Before("@scenario1")
	public void before1(Scenario scenario) {
		System.out.println("\nIn Before hook\n");
		
		//we can use Scenario object to get screenshot , method name
		System.out.println("Scenario name = "+scenario.getName());
		System.out.println("Scenario line = "+scenario.getLine());
		System.out.println("Scenario tags = "+scenario.getSourceTagNames());
		System.out.println("Scenario status = "+scenario.getStatus());
		System.out.println("Scenario URI = "+scenario.getUri());
		System.out.println("Scenario isFailed = "+scenario.isFailed()+"\n");
		
		
	}
	
	@After("@scenario1")
	public void after1(Scenario scenario) {
		System.out.println("\n In After hook \n");
		
		//we can use Scenario object to get screenshot , method name
		System.out.println("Scenario name = "+scenario.getName());
		System.out.println("Scenario line = "+scenario.getLine());
		System.out.println("Scenario tags = "+scenario.getSourceTagNames());
		System.out.println("Scenario status = "+scenario.getStatus());
		System.out.println("Scenario URI = "+scenario.getUri());
		System.out.println("Scenario isFailed = "+scenario.isFailed()+"\n");
	}
	@Before("@scenario2")
	public void before(Scenario scenario) {
		System.out.println("\nIn Before hook\n");
		
		//we can use Scenario object to get screenshot , method name
		System.out.println("Scenario name = "+scenario.getName());
		System.out.println("Scenario line = "+scenario.getLine());
		System.out.println("Scenario tags = "+scenario.getSourceTagNames());
		System.out.println("Scenario status = "+scenario.getStatus());
		System.out.println("Scenario URI = "+scenario.getUri());
		System.out.println("Scenario isFailed = "+scenario.isFailed()+"\n");
		
		
	}
	
	@After("@scenario2")
	public void after(Scenario scenario) {
		System.out.println("\n In After hook \n");
		
		//we can use Scenario object to get screenshot , method name
		System.out.println("Scenario name = "+scenario.getName());
		System.out.println("Scenario line = "+scenario.getLine());
		System.out.println("Scenario tags = "+scenario.getSourceTagNames());
		System.out.println("Scenario status = "+scenario.getStatus());
		System.out.println("Scenario URI = "+scenario.getUri());
		System.out.println("Scenario isFailed = "+scenario.isFailed()+"\n");
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("\n In before step \n");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("\n In after step \n");
	}
}
