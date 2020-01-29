Feature: Register 
Scenario: Register on TestMe App 
	Given user open TestMeApp 
	When user click signup 
	And enter usename as "rajesh1234" 
	And enter firstname as "rajesh" 
	And enter the lastname as "choudhari" 
	And enter the password as "rajesh217" 
	And enter the confirm password as "rajesh217" 
	And enter gender as "Male" 
	And enter email as "raj21897@gmail.com" 
	And enter mobile number as "7894561330" 
	And enter dob as "21/08/1997" 
	And enter address as "Pune" 
	And enter answer as "red" 
	Then user click on register 
	
	
	
@login	
Scenario: Login using datatable 
			Given user open TestMeApp 
			When user click click signin
			And user enter credentials as 
				|lalitha|
				|Password123| 
@Cart
	Scenario: Add product in cart 
	Given user open TestMeApp
	When  user click click signin
			And user enter credentials as 
				|lalitha|
				|Password123| 
	      And search product
	      |Headphone|
  Then click on add to cart button
  	