Feature: Free CRM Login Feature


Scenario Outline:  actitime Login Test Scenario

Given user is  on Login Page
When title of login page is actiitime
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| username | password |
	| admin    | manager  |
	|  admin   | manager  |
	
	
	
	