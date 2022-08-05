Feature: Cases page feature

Background:
Given user has already login to Application1
|username|password|
|premrji20|premrji20|

Scenario: Cases page title
Given user is on Home page
When  get title of Cases page
Then  title1 of page should be "xyz"

Scenario: click Cases page
Given user is on homepage
When user click on Cases page link
Then Cases page should display fieldsetCaption "Call Information"