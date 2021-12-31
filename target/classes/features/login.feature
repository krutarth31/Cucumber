Feature: Sign In Automation Practice

#without example keyword
#Scenario: Sign In test

#Given user is on sign in page
#Then user enter "krutarth" and "pate"
#Then user clicks on sign In 
#Then verify sign out button
#Then close the browser

#With Example keyword
Scenario Outline:Sign In test

Given user is on sign in page
Then user enter "<username>" and "<password>"
Then user clicks on sign In 
Then verify sign out button
Then close the browser

Examples:
	| username | password |
	| krutarth | patel    |
	| fdgfdgdfg@gmail.com | fdfdffdf |
	| gfhfghfgh@gmail.com | fdfdffdf |