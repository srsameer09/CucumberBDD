Feature: Login page feature

@Sanity
Scenario: Login page title
Given user is on login page
When User opens URL "https://classic.freecrm.com/" 
Then page title should be "Free CRM - CRM software for customer relationship management, sales, and support."

@SmokeTest
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@Sanity @SmokeTest
Scenario: Successful Login with Valid Credentials 
	Given user is on login page
	When User opens URL "https://classic.freecrm.com/" 
	And User enters username as "premrji20" and Password as "premrji20" 
	Then Page Title should be "CRMPRO" 

	When User click on Log out link 
	Then Page Title should be "Free CRM - CRM software for customer relationship management, sales, and support." 

