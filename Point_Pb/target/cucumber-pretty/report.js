$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login_Points.feature");
formatter.feature({
  "line": 1,
  "name": "Points Centers",
  "description": "",
  "id": "points-centers",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Points Application Login",
  "description": "",
  "id": "points-centers;points-application-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser for Points application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "NewUser enters \"\u003cuname\u003e\" and \"\u003cpassword\u003e\" for Points application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Message displayed Login Successful for Points application",
  "rows": [
    {
      "comments": [
        {
          "line": 7,
          "value": "#datatables"
        },
        {
          "line": 8,
          "value": "#Sample"
        }
      ],
      "cells": [
        "First Name",
        "Last Name",
        "Phone No",
        "Password",
        "DOB Day",
        "DOB Month",
        "DOB Year",
        "Gender"
      ],
      "line": 9
    },
    {
      "cells": [
        "Abc FN",
        "Abc LN",
        "0123123123",
        "Pass1234",
        "01",
        "Jan",
        "1990",
        "Male"
      ],
      "line": 10
    },
    {
      "cells": [
        "Def FN",
        "Def LN",
        "0456456456",
        "Abcd1234",
        "01",
        "Feb",
        "1990",
        "Female"
      ],
      "line": 11
    },
    {
      "cells": [
        "Xyz FN",
        "Xyz LN",
        "0789789789",
        "Pass2018",
        "01",
        "Mar",
        "1990",
        "Female"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 14,
      "value": "#Step should not be duplicated in another Feature File."
    },
    {
      "line": 15,
      "value": "# when paremeters are given in Examples always use Scenario Outline instead of Scenario"
    }
  ],
  "line": 16,
  "name": "",
  "description": "",
  "id": "points-centers;points-application-login;",
  "rows": [
    {
      "cells": [
        "uname",
        "password"
      ],
      "line": 17,
      "id": "points-centers;points-application-login;;1"
    },
    {
      "cells": [
        "PBI\\AB008GA",
        "Sparkle7@"
      ],
      "line": 18,
      "id": "points-centers;points-application-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 16176141091,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Points Application Login",
  "description": "",
  "id": "points-centers;points-application-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser for Points application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "NewUser enters \"PBI\\AB008GA\" and \"Sparkle7@\" for Points application",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Message displayed Login Successful for Points application",
  "rows": [
    {
      "comments": [
        {
          "line": 7,
          "value": "#datatables"
        },
        {
          "line": 8,
          "value": "#Sample"
        }
      ],
      "cells": [
        "First Name",
        "Last Name",
        "Phone No",
        "Password",
        "DOB Day",
        "DOB Month",
        "DOB Year",
        "Gender"
      ],
      "line": 9
    },
    {
      "cells": [
        "Abc FN",
        "Abc LN",
        "0123123123",
        "Pass1234",
        "01",
        "Jan",
        "1990",
        "Male"
      ],
      "line": 10
    },
    {
      "cells": [
        "Def FN",
        "Def LN",
        "0456456456",
        "Abcd1234",
        "01",
        "Feb",
        "1990",
        "Female"
      ],
      "line": 11
    },
    {
      "cells": [
        "Xyz FN",
        "Xyz LN",
        "0789789789",
        "Pass2018",
        "01",
        "Mar",
        "1990",
        "Female"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Centers_step.Open_firefox_and_start_application()"
});
formatter.result({
  "duration": 70424727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PBI\\AB008GA",
      "offset": 16
    },
    {
      "val": "Sparkle7@",
      "offset": 34
    }
  ],
  "location": "Centers_step.user_enters_and(String,String)"
});
formatter.result({
  "duration": 36376338424,
  "status": "passed"
});
formatter.match({
  "location": "Centers_step.message_displayed_Login_Successful(DataTable)"
});
formatter.result({
  "duration": 1568000,
  "status": "passed"
});
formatter.after({
  "duration": 51879,
  "status": "passed"
});
});