Feature: CompaniesPage feature

Background:
Given user3 has already login to Application
|username|password|
|premrji20|premrji20|

Scenario: Companies page title
Given user is on Companies page
When  get title of Companies page
Then  Title3 of page should be ""

Scenario: click Companies page
Given User is on home page3
When user click on Companies page link
Then Companies page should display fieldsetCaption5 "Create New  Company"