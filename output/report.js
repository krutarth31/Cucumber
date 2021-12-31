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
  "duration": 4351467812,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.click_on_Sign_In()"
});
formatter.result({
  "duration": 1020976858,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_title_on_Sign_In_page()"
});
formatter.result({
  "duration": 8406248,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.close_the_browser()"
});
formatter.result({
  "duration": 93815660,
  "status": "passed"
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
  "duration": 3587327572,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.user_check_information_links()"
});
formatter.result({
  "duration": 115149420,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.close_the_broser()"
});
formatter.result({
  "duration": 89948924,
  "status": "passed"
});
});