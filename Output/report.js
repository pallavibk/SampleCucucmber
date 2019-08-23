$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ABC.feature");
formatter.feature({
  "line": 1,
  "name": "Test End to End scenario for Mahajeevan Plan",
  "description": "",
  "id": "test-end-to-end-scenario-for-mahajeevan-plan",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the login functionality",
  "description": "",
  "id": "test-end-to-end-scenario-for-mahajeevan-plan;verify-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Browser and enter URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "XYz.open_Browser_and_enter_URL()"
});
formatter.result({
  "duration": 153498545,
  "status": "passed"
});
formatter.match({
  "location": "ABC.user_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 188416,
  "status": "passed"
});
formatter.uri("XYZ.feature");
formatter.feature({
  "line": 1,
  "name": "Test End to End scenario for CashBack Plan",
  "description": "",
  "id": "test-end-to-end-scenario-for-cashback-plan",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the login functionality",
  "description": "",
  "id": "test-end-to-end-scenario-for-cashback-plan;verify-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User enter valid username And password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on Sign in",
  "keyword": "When "
});
formatter.match({
  "location": "XYz.user_enter_valid_username_And_password()"
});
formatter.result({
  "duration": 218112,
  "status": "passed"
});
formatter.match({
  "location": "ABC.click_on_Sign_in()"
});
formatter.result({
  "duration": 136704,
  "status": "passed"
});
});