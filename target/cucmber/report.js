$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/setColor.feature");
formatter.feature({
  "line": 2,
  "name": "Background color validation;",
  "description": "",
  "id": "background-color-validation;",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 5841486988,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Valid user should be able to set skyBlue backgroung",
  "description": "",
  "id": "background-color-validation;;valid-user-should-be-able-to-set-skyblue-backgroung",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on techfios test Website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the set Skyblue button;",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to skyblue;",
  "keyword": "Then "
});
formatter.match({
  "location": "SetColorStepDefinition.user_is_on_techfios_test_Website()"
});
formatter.result({
  "duration": 600568010,
  "status": "passed"
});
formatter.match({
  "location": "SetColorStepDefinition.user_clicks_on_the_set_Skyblue_button()"
});
formatter.result({
  "duration": 50056066,
  "status": "passed"
});
formatter.match({
  "location": "SetColorStepDefinition.the_background_color_will_change_to_skyblue()"
});
formatter.result({
  "duration": 31371427,
  "status": "passed"
});
formatter.after({
  "duration": 1361733419,
  "status": "passed"
});
formatter.before({
  "duration": 5456200943,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Valid user should be able to set White backgroung color",
  "description": "",
  "id": "background-color-validation;;valid-user-should-be-able-to-set-white-backgroung-color",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on techfios test Website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on the set White background button;",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to white;",
  "keyword": "Then "
});
formatter.match({
  "location": "SetColorStepDefinition.user_is_on_techfios_test_Website()"
});
formatter.result({
  "duration": 543462066,
  "status": "passed"
});
formatter.match({
  "location": "SetColorStepDefinition.user_clicks_on_the_set_White_background_button()"
});
formatter.result({
  "duration": 47532479,
  "status": "passed"
});
formatter.match({
  "location": "SetColorStepDefinition.then_the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 23538513,
  "status": "passed"
});
formatter.after({
  "duration": 740220618,
  "status": "passed"
});
});