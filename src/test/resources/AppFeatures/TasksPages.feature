Feature: Tasks Page feature



Scenario: Tasks page title
Given user3 is on Home page3
When  get title of Tasks page3
Then  title3 of page should be ""

Scenario: click Tasks page
Given user3 is on home page3
When user click on Tasks page link
Then Deals3 page should display fieldsetCaption "Task Information"
