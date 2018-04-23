$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/250630.CTS/workspace/cucumberproject/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "entering username and password to login",
  "description": "",
  "id": "login-page;entering-username-and-password-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdefinition.useralreadyonloginpage()"
});
formatter.result({
  "duration": 197789314,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.Loginstepdefinition.useralreadyonloginpage(Loginstepdefinition.java:20)\r\n\tat ✽.Given user is on login page(C:/Users/250630.CTS/workspace/cucumberproject/src/main/java/Features/login.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Loginstepdefinition.i_enter_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Loginstepdefinition.i_land_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
});