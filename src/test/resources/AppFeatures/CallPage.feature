Feature: call page feature

Background:
Given user1 has already login to Application
|username|password|
|premrji20|premrji20|

Scenario: call page title
Given user is on call page
When  get title of call page
Then  title of page1 should be "Pro"

Scenario: click call page
Given user is on homepage
When user click on call page link
Then call page should display fieldsetCaption "Targets"