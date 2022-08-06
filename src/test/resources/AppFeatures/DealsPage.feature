Feature: Deals Page feature

Background:
Given user has already login to Application5
|username|password|
|premrji20|premrji20|

Scenario: Deals page title
Given user is on Homepage
When  get title of Dealspage
Then  title5 of page should be ""

Scenario: click Deals page
Given user is on home page
When user click on Deals page link
Then Deals page should display fieldsetCaption "Contact Information"