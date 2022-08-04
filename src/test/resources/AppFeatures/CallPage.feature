Feature: call page feature

Background:
Given user has already login to Application
|username|password|
|premrji20|premrji20|

Scenario: call page title
Given user is on call page
When  get title of call page
Then  title of page should be ""
