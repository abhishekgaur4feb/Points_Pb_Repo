Feature: Points Centers 

Scenario Outline: Points Application Login 
	Given Open browser for Points application 
	When NewUser enters "<uname>" and "<password>" for Points application
	Then Message displayed Login Successful for Points application 
	#datatables
	#Sample
	| First Name | Last Name | Phone No   | Password | DOB Day  | DOB Month  | DOB Year  | Gender 	|
| Abc FN 	 | Abc LN 	 | 0123123123 | Pass1234 | 01 		| Jan 		 | 1990 	 | Male   	|
| Def FN 	 | Def LN 	 | 0456456456 | Abcd1234 | 01 		| Feb 		 | 1990 	 | Female   |
| Xyz FN 	 | Xyz LN 	 | 0789789789 | Pass2018 | 01 		| Mar 		 | 1990 	 | Female   |
	
	#Step should not be duplicated in another Feature File.
	# when paremeters are given in Examples always use Scenario Outline instead of Scenario
	Examples: 
		| uname        | password   |
		| PBI\AB008GA  | Sparkle7@  |
		
		

		
		
		
