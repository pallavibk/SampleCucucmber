Feature: Login feature

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<username>"
	Then Message displayed Login Successfully

Examples:
| username   | password |
    | batman | batman |
    | batman | batman |

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully