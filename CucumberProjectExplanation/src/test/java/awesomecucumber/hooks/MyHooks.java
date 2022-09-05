package awesomecucumber.hooks;

import org.openqa.selenium.WebDriver;

import awesomecucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

	private WebDriver driver;
	
	@Before
	public void before() {
		
		//if we execute from IDE it will run on chrome
		driver = DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
		
		//to run thru maven
//		mvn clean test -Dbrowser=firefox;
	}
	
	
	@After
	public void after() {
		driver.quit();
	}
}
