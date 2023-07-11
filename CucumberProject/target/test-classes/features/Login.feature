Feature: Application Login

Background:
Given Validate the browser
When Browser is triggered
Then Ckeck if the browser is started

@RegTest @SmokeTest
Scenario: Homepage default login
Given user is on netbanking landing page
When user login into application "jhn" and "123"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
Scenario: Homepage default login
Given user is on netbanking landing page
When user login into application "rahul" and "321"
Then Home page is populated
And Cards displayed are "false"

@MobileTest
Scenario: Homepage default login
Given user is on netbanking landing page
When user sign up with follwoing details
|lalita|abcd|lalita@gmail.com|Meerut|12345678|
Then Home page is populated
And Cards displayed are "false"

@WebTest
Scenario Outline: Homepage default login
Given user is on netbanking landing page
When user login into application <Username> and <Password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|Username|Password|
|user1|123|
|us|ftf|
|user|12334|
