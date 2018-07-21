$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTest.feature");
formatter.feature({
  "line": 2,
  "name": "Login test validation",
  "description": "",
  "id": "login-test-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate login successful scenarios",
  "description": "",
  "id": "login-test-validation;validate-login-successful-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I navigate to Gurukula home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on link to Login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify user has logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I validate the username displayed is \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Logout option from Account dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "Login credentials",
  "description": "",
  "id": "login-test-validation;validate-login-successful-scenarios;login-credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-test-validation;validate-login-successful-scenarios;login-credentials;1"
    },
    {
      "cells": [
        "admin",
        "admin"
      ],
      "line": 19,
      "id": "login-test-validation;validate-login-successful-scenarios;login-credentials;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Validate login successful scenarios",
  "description": "",
  "id": "login-test-validation;validate-login-successful-scenarios;login-credentials;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to Gurukula home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on link to Login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter username as \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter password as \"admin\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify user has logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I validate the username displayed is \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Logout option from Account dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "WelcomeSteps.iNavigateToGurukulaLoginPage()"
});
formatter.result({
  "duration": 8041180120,
  "status": "passed"
});
formatter.match({
  "location": "WelcomeSteps.iClickOnLogin()"
});
formatter.result({
  "duration": 426128912,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.iEnterUserName(String)"
});
formatter.result({
  "duration": 199029481,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 103824641,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginBtn()"
});
formatter.result({
  "duration": 103712596,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.verifyUserLoggedIn()"
});
formatter.result({
  "duration": 777460221,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 38
    }
  ],
  "location": "LandingPageSteps.validateUsername(String)"
});
formatter.result({
  "duration": 1089327586,
  "status": "passed"
});
formatter.match({
  "location": "LandingPageSteps.iSelectLogoutAccountDropdownBtn()"
});
formatter.result({
  "duration": 481150920,
  "status": "passed"
});
formatter.match({
  "location": "WelcomeSteps.i_close_the_browser()"
});
formatter.result({
  "duration": 263112204,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Validate login unsuccessful scenarios",
  "description": "",
  "id": "login-test-validation;validate-login-unsuccessful-scenarios",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I navigate to Gurukula home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click on link to Login page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter username as \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I validate Login failure",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "Login credentials",
  "description": "",
  "id": "login-test-validation;validate-login-unsuccessful-scenarios;login-credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 33,
      "id": "login-test-validation;validate-login-unsuccessful-scenarios;login-credentials;1"
    },
    {
      "cells": [
        "admin",
        "notadmin"
      ],
      "line": 34,
      "id": "login-test-validation;validate-login-unsuccessful-scenarios;login-credentials;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 34,
  "name": "Validate login unsuccessful scenarios",
  "description": "",
  "id": "login-test-validation;validate-login-unsuccessful-scenarios;login-credentials;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I navigate to Gurukula home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click on link to Login page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter username as \"admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter password as \"notadmin\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I validate Login failure",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "WelcomeSteps.iNavigateToGurukulaLoginPage()"
});
formatter.result({
  "duration": 7570242013,
  "status": "passed"
});
formatter.match({
  "location": "WelcomeSteps.iClickOnLogin()"
});
formatter.result({
  "duration": 390542938,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.iEnterUserName(String)"
});
formatter.result({
  "duration": 941472508,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "notadmin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 195526136,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iClickLoginBtn()"
});
formatter.result({
  "duration": 123133235,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iValidateLoginFailure()"
});
formatter.result({
  "duration": 792916932,
  "status": "passed"
});
formatter.match({
  "location": "WelcomeSteps.i_close_the_browser()"
});
formatter.result({
  "duration": 321225298,
  "status": "passed"
});
});