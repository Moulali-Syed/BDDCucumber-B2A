package awesomecucumber;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import objects.Customer;

public class DataTableStepDef1 {

	@DataTableType
	public Customer customerEntry(List<String> entry) {
		return new Customer(entry.get(0), entry.get(1));
	}

	@Given("mycredentials")
	public void mycredentials(@Transpose Customer customer) {

		System.out.println(" USERNAME = " + customer.getUsername());
		System.out.println(" PASSWORD = " + customer.getPassword());
	}

}
