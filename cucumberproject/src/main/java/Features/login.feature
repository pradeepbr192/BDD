Feature: login page
Scenario Outline: entering username and password to login

Given user is on login page
When i enter "<username>" and "<password>"
Then i land on home page
Examples:
|username | password|
|pradeep| welcome|

