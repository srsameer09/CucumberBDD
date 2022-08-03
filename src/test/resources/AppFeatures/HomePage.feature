Feature: Home Page feature
Background: 
Given user has already login to application
|username|password|
|premrji20|premrji20|


Scenario: Home Page titile
Given user is on Home page
When user get the title of home page
Then page title should be "CRMPRO"

Scenario: get the valid username after login
Given  user is on HomePage
When user get Home Page
Then username should be "premrji20 prem"


Scenario: go to the Home page, and search for an item, expect to see some reference to that item in the result summary
		
Given user already on the Home page
When  add "prem" to the search box
And click the search button
Then "prem" should be mentioned in the result
