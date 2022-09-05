package awesomecucumber.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import awesomecucumber.utils.ConfigLoader;

public class BasePage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;

	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		PageFactory.initElements(driver, this);
	}

	//load a page
	public void load(String endPoint) {   // use the singleton class in BasePage
		driver.get(ConfigLoader.getInstance().getBaseUrl()+endPoint);
	}
	
}
