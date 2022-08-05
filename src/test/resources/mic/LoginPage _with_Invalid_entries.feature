Feature: login with invalid credential

Scenario: unsucesful login with blank credential
Given user on the login page
And enter username as ""
And enter password as ""
But user entered wrong password
Then Login must be unsuccesful


Scenario: Unsuccessful Login with Invalid entries
Given user navigates to the website facebook.com
When username is incorrect, but the password is correct user Login by using Username as "premrj" and Password as "premrji20"
When username is correct, but the password is incorrect user Login by using username as "premrji20" and Password as "12345678"
Then login must be unsuccessful.
