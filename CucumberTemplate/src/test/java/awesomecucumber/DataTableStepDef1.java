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
	public Customer customerEntry(DataTable dataTable) {
		
		return new Customer(dataTable.row(0).get(1), dataTable.row(1).get(1));
	}

	@Given("mycredentials")
	public void mycredentials(Customer customer) {

		System.out.println(" USERNAME = " + customer.getUsername());
		System.out.println(" PASSWORD = " + customer.getPassword());
	}

}
