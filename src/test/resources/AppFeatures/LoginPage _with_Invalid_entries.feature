Feature: login with invalid credential

Scenario: unsucesful login with invalid credential
Given user on the login page
And enter username as ""
And enter password as ""
But user entered wrong password
Then Login must be unsuccesful
