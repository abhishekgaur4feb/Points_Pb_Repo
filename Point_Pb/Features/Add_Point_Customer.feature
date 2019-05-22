Feature: Points Add Customer 

Scenario Outline: Points Application Add Customer 
	Given Open browser for Add Customer in Points application 
	When NewUser select "<Center>" for Add Customer in Points application
	And Customer click on Add Customer and Enter Customer with details "<Customer_Name>" , "<Customer_Type>" , "<Industry>" , "<Acquisition_Method>" , "<Payment_Terms>" and "<Start_Date>"
	And Customer enters PrimaryMailingAddress with details "<Address>" and "<City>" and "<State>" and "<Zip_Code>"
	Then Message displayed Login Successful for Add Customer in Points application 

	Examples: 
		| Center       | Customer_Name|Customer_Type		 |Industry|Acquisition_Method|Payment_Terms|Start_Date|Address|City   |State |Zip_Code|
		| AUS  		   |CBI			  |	Regular/recurring	 |Utility |					|			  |			 |India	 |Mumbai |	AL  |247001  |
		
		

		
		
		
