Feature: Application Login

@SmokeTest
Scenario: Homepage default login
Given user is on netbanking landing page
When user login into application "jhn" and "123"
Then Home page is populated
And Cards displayed are "true"


