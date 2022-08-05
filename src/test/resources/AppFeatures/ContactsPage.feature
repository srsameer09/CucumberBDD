Feature: Contacts Page feature

Background:
Given user2 has already login to Application
|username|password|
|premrji20|premrji20|

Scenario: Contacts page title
Given user is on Home page
When  get title of Contactspage
Then  title of page should be "".

Scenario: click Contacts page
Given user2 is on home page
When user click on Contacts page link
Then Contacts page should display fieldsetCaption "Contact Information"