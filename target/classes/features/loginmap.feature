Feature: Login Test with data table

Scenario: Data Table Test

Given user is on sign in page
Then user enter username and password
|username|password|
|gfhfghfgh@gmail.com|fdfdffdf|
|krutarth|patel|
Then user clicks on sign In 
Then verify sign out button
Then close the browser