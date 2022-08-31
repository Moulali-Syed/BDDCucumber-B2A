package awesomecucumber;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import objects.Customer;

public class DataTableStepDef1 {

	@DataTableType
	public Customer customerEntry(List<String> entry) {
		return new Customer(entry.get(0), entry.get(1));
	}

	@Given("mycredentials")
	public void mycredentials(List<Map<String, String>> customers) {

		System.out.println("ROW 0 USERNAME = " + customers.get(0).get("username"));
		System.out.println("ROW 0 PASSWORD = " + customers.get(0).get("password"));

		System.out.println("ROW 1 USERNAME = " + customers.get(1).get("username"));
		System.out.println("ROW 1 PASSWORD = " + customers.get(1).get("password"));

	}

}
