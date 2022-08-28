Feature: dummy feature[title]
	I want to add product to cart[desc of feature]

	#Background
	Background: This is a background
		Given I'm bill
		And I'm logged in
		
		@dummyScenario
		Scenario: dummy scenario
			This is a scenario
			Given my account balance is $100
			When I withdraw $50
			Then the account balance should be $50
			
			
		Scenario Outline: dummy scenario 2
			This is a scenario
			Given my account balance is $<opening balance>
			When I withdraw $<withdrawal amount>
			Then the account balance should be $<closing balance>
			
			@QA
			Examples:
				| opening balance | withdrawal amount | closing balance |
				|	100							|	50								|	50							|
				|	50							|	50								|	0								|
				
			@Stage
			Examples:
				| opening balance | withdrawal amount | closing balance |
				|	100							|	50								|	50							|
				|	50							|	50								|	0								|
			
			