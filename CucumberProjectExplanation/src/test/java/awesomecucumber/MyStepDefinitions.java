package awesomecucumber;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import awesomecucumber.constants.EndPoint;
import awesomecucumber.constants.MyConstants;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import awesomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyStepDefinitions {

	private WebDriver driver;
	private String billingFirstName;
	private String billingLastName;
	private String billingAddressOne;
	private String billingCity;
	private String billingStateName;
	private String billingZip;
	private String billingEmail;
	
	@Given("I'm on the Store Page")
	public void i_m_on_the_store_page() {
		driver = DriverFactory.getDriver();
		new StorePage(driver).load(EndPoint.STORE.url);
	}

	@When("I add a {string} to the cart")
	public void i_add_a_to_the_cart(String productName) {

		new StorePage(driver).addToCart(productName);
	}

	@Then("I should see {int} {string} in the cart")
	public void i_should_see_in_the_cart(int quantity, String productName) {
		CartPage cartPage = new CartPage(driver);

		Assert.assertEquals(productName, cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());
	}

	@Given("I'm guest customer")
	public void i_m_guest_customer() {
		driver = DriverFactory.getDriver();
		new StorePage(driver).load(MyConstants.STORE);
	}

	@Given("I have a product in the cart")
	public void i_have_a_product_in_the_cart() throws InterruptedException {
		new StorePage(driver).addToCart("Blue Shoes");
	}

	@Given("I'm on the checkout page")
	public void i_m_on_the_checkout_page() {
		
		new CartPage(driver).checkout();
	}

	@When("I provide billing details")
	public void i_provide_billing_details() {

		CheckoutPage checkoutPage = new CheckoutPage(driver);

//		checkoutPage.enterBillingFirstName(billingDetails.get(0).get("firstName"));
		// like above we can call individual methods or use a single method

		checkoutPage.setBillingDetails(billingFirstName,
				billingLastName,
				billingAddressOne,
				billingCity,
				billingStateName,
				billingZip,
				billingEmail);
	}

	@When("I place an order")
	public void i_place_an_order() {
		new CheckoutPage(driver).placeOrder();
	}

	@Then("the order should be placed successfully")
	public void the_order_should_be_placed_successfully() {

		Assert.assertEquals("Thank you. Your order has been received.", new CheckoutPage(driver).getNotice());
	}
	
	//lets create a step
	@Given("my billing details are")
	public void my_billing_details_are(List<Map<String, String>> billingDetails) {
		billingFirstName = billingDetails.get(0).get("firstname");
		billingLastName = billingDetails.get(0).get("lastname");
		billingAddressOne = billingDetails.get(0).get("address_line1");
		billingCity = billingDetails.get(0).get("city");
		billingStateName = billingDetails.get(0).get("state");
		billingZip = billingDetails.get(0).get("zip");
		billingEmail = billingDetails.get(0).get("email");
	}
}
