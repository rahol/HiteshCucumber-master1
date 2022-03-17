Feature: Customer


Scenario Outline: Create new customer
Given User launch chrome browser
When User opens GCR shop site
Then User verify the title of page
When User click on Account button
And click on continue button for new customer
Then user should be at create an account section
When User selects gender as "<Gender>"
And User enters "<FirstName>" and "<LastName>"
And User enters Birthdate as "<DOB>"
And User enters Email as "<email>"
And User enters as "<street>" , "<suburb>", "<pincode>", "<city>" and "<state>"
And user selects from dropdown "<country>"
And User enter contact as "<TelNo>" and "<FaxNo>"
And User Enter credential as "<password>" and "<confirmpassword>"
And click on continue button
Then user should get confirmation message as "<message>"
And close browser

Examples:
|FirstName |LastName  |Gender|DOB        |email   |street  |suburb|pincode|city|state|country|TelNo    |FaxNo|password|confirmpassword|message|
|Vaish     |bach      |female|30/11/2000 |abc@g.co|abcdefs |wakads|399231 |pune|goa  |India  |982443872|124  |asd@12  |asd@12         |Your Account Has Been Created!|
