SearchPatient.feature
Feature: Checking Search Functionality of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the search functionality of the application is fine

Given the user is on home page
When the user searched a patient
Then the data of selected patient is shown on ui
And there are 11 tabs including hcc and auc on ui


@sanityTest
Scenario: Verify that the Name of searched patient is matching with then Name showing on banner
Given the user is on home page
When the user searched a patient
Then selected patient name is matching with name shown on ui

CareGaps.feature
Feature: Verifying Care Gaps tab of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the Care Gaps has all required columns in application against searched patient

Given the user searched a patient
When the user clicks "tab" of "care gaps"
Then 5 columns are shown on ui of care gaps
And  "Severity" is first column of care gaps
And  "Care Gap" is second column of care gaps
And "Program" is third column of care gaps
And  "Created On" is fourth column of care gaps
And "Status" is fifth column of care gaps

Feature: Verify that the icons links given at the footer of PE app are working fine.

Background:
Given the user has logged in
@sanityTest
Scenario: Verify that the all links are available in the given footer section
Given the user is on home page
Then 6 sections are shown on footer section
And  "View patient's care plans" is first icon of footer
And  "View all care views" is second icon of footer
And "You have 104 new care gaps" is third icon of footer
And  "201 new assessments" is fourth icon of footer
And  "See your Schedules" is fifth icon of footer
And  "Analytics" is sixth icon of footer

@sanityTest
Scenario: Verify that the global schedules toggle is working fine and schedules page is not empty.						
Given the user is on home page
When the user clicks footer "section" of "See your Schedules"
Then the screen is toggled to calendar
And today button is available on calendar screen
And date field has date of today

@sanityTest
Scenario: Verify that the user is able to toggle back from global schedules to home page
Given the user is on home page
And the user clicks footer "section" of "See your Schedules"
When the user clicks footer "section" of "See your Schedules"
Then the user is on home page

@sanityTest
Scenario: Verify that if user clicks on analytics link then a new browser web page is opening successfully.						
Given the user is on home page
When the user clicks footer "section" of "Analytics"
Then the user lands on auc dashboard web page

Feature: Verifying Care Gaps tab of Persivia application is working fine

Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the Care Gaps has all required columns in application against searched patient

Given the user searched a patient
When the user clicks "tab" of "care gaps"
Then 5 columns are shown on ui of care gaps
And  "Severity" is first column of care gaps
And  "Care Gap" is second column of care gaps
And "Program" is third column of care gaps
And  "Created On" is fourth column of care gaps
And "Status" is fifth column of care gaps

Feature: Verifying HCC tab of Persivia application is working fine


Background:
Given the user has logged in

@sanityTest
Scenario: Verify that the HCC tab has all required columns in application against searched patient for active problem lists
Given the user searched a patient
When the user clicks "tab" of "hcc"
Then 4 columns are shown on hcc ui under active problem lists
And  "Source" is first column of active problem lists
And  "Active Problem List" is second column of active problem lists
And "Code" is third column of active problem lists
And  "Action" is fourth column of active problem lists

@sanityTest
Scenario: Verify that the HCC tab has all required columns in application against searched patient for Dropped Codes
Given the user searched a patient
When the user clicks "tab" of "hcc"
Then 4 columns are shown on hcc ui under active dropped codes
And  "Source" is first column of active dropped codes
And  "Potential Gaps" is second column of active dropped codes
And "Code" is third column of active dropped codes
And  "Action" is fourth column of active dropped codes