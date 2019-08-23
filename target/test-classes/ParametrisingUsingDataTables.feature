Feature: Login verify

Scenario:  Login with  Credentials
	Given On Home Page
	When User Navigate to Login screen
	And User enters valid credentials
	| batman | batman |
	Then   Login Message displayed Successfully

