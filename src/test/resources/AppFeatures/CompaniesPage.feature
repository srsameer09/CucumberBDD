Feature: CompaniesPage feature

Background:
Given user1 has already login to Application
|username|password|
|premrji20|premrji20|

Scenario: Companies page title
Given user is on Companies page
When  get title of Companies page
Then  Title of page should be ""

Scenario: click Companies page
Given User is on home page
When user click on Companies page link
Then Companies page should display fieldsetCaption "Create New  Company"