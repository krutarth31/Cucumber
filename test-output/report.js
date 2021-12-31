$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Practice Home Page",
  "description": "",
  "id": "automation-practice-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Automation Home Page Test",
  "description": "",
  "id": "automation-practice-home-page;automation-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on Sign In",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "verify title on Sign In page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 4158720907,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.click_on_Sign_In()"
});
formatter.result({
  "duration": 1139710416,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_title_on_Sign_In_page()"
});
formatter.result({
  "duration": 10424732,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cLogin - My Stor[e]\u003e but was:\u003cLogin - My Stor[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat stepDefinitions.HomePageTest.verify_title_on_Sign_In_page(HomePageTest.java:39)\n\tat ✽.Then verify title on Sign In page(login.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageTest.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 10,
  "name": "Foother information link Test",
  "description": "",
  "id": "automation-practice-home-page;foother-information-link-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user is on home page to check links",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user check information links",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the broser",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_is_on_home_page_to_check_links()"
});
formatter.result({
  "duration": 3710283447,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.user_check_information_links()"
});
formatter.result({
  "duration": 109535381,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.close_the_broser()"
});
formatter.result({
  "duration": 94021609,
  "status": "passed"
});
});