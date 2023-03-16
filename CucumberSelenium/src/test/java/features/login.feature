Feature: BookCart application demo

Scenario: Login should be success

Given user should navigate to the application
And user clicks on the login button
And user enters the username as ortoni
And user entered the password as pass1234
When user click the login button
Then login should be success
