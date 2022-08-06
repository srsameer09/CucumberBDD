Feature: Tasks Page feature

Background: 
Given user has already login to application6
|username|password|
|premrji20|premrji20|

Scenario: Tasks page title
Given user is on Home page3
When  get title of Tasks page3
Then  title3 of page should be ""

Scenario: click Tasks page
Given user is on home page3
When user click on Tasks page link
Then Deals page should display fieldsetCaption "Task Information"
