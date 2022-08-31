
Feature: Add to cart
	Rule: Add from store
	
	@Scenario1
	Scenario Outline: Add one quantity to the cart
		Given I'm on the Store page
		When I add a <product_name> to the cart
		Then I see 1 <product_name> in the Cart
		Examples:
			| product_name |
			| Blue Shoes   |