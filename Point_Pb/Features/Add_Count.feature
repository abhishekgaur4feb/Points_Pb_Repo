Feature: Points Add Counts 

Scenario Outline: Points Application Add Counts 
	Given Open browser for Add Counts in Points application 
	When NewUser select "<center>" for Add Counts in Points application
	And I click on Add Counts and Enter "<count_type>" and "<mall_type>" and "<count>" and "<sort_code>"
	Then Message displayed Login Successful for Add Counts in Points application 

	Examples: 
		| center       | count_type    |mall_type|count|sort_code		|
		| AUS  		   |Sorter Machine |Letter	 |150  |AUSHandsortLog  |
		
		

		
		
		
