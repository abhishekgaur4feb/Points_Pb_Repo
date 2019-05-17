$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Add_Count.feature");
formatter.feature({
  "line": 1,
  "name": "Points Add Counts",
  "description": "",
  "id": "points-add-counts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Points Application Add Counts",
  "description": "",
  "id": "points-add-counts;points-application-add-counts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser for Add Counts in Points application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "NewUser enters \"\u003cuname\u003e\" and \"\u003cpassword\u003e\" for Add Counts in Points application",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Add Counts",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Message displayed Login Successful for Add Counts in Points application",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "points-add-counts;points-application-add-counts;",
  "rows": [
    {
      "cells": [
        "uname",
        "password"
      ],
      "line": 10,
      "id": "points-add-counts;points-application-add-counts;;1"
    },
    {
      "cells": [
        "PBI\\AB008GA",
        "Sparkle7@"
      ],
      "line": 11,
      "id": "points-add-counts;points-application-add-counts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14588525376,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Points Application Add Counts",
  "description": "",
  "id": "points-add-counts;points-application-add-counts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open browser for Add Counts in Points application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "NewUser enters \"PBI\\AB008GA\" and \"Sparkle7@\" for Add Counts in Points application",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Add Counts",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Message displayed Login Successful for Add Counts in Points application",
  "keyword": "Then "
});
formatter.match({
  "location": "Add_Count_Step.open_browser_for_Add_Counts_in_Points_application()"
});
formatter.result({
  "duration": 172249780,
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
  "location": "Add_Count_Step.newuser_enters_and_for_Add_Counts_in_Points_application(String,String)"
});
formatter.result({
  "duration": 9099278108,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d73.0.3683.103)\n  (Driver info: chromedriver\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 4.03 seconds\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027IN-1HS8TQ2-10\u0027, ip: \u002710.120.89.23\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_202\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.37.544315 (730aa6a5fdba159ac9f4c1e8cbc59bf1b5ce12b7), userDataDir\u003dC:\\Users\\ab008ga\\AppData\\Local\\Temp\\1\\scoped_dir29128_20131}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d73.0.3683.103, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e99a3e3c7358c5101da970f4189b73b2\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(text(),\u0027Operations\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:41)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:238)\r\n\tat Step_Defination.Add_Count_Step.newuser_enters_and_for_Add_Counts_in_Points_application(Add_Count_Step.java:46)\r\n\tat ✽.When NewUser enters \"PBI\\AB008GA\" and \"Sparkle7@\" for Add Counts in Points application(Add_Count.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Add_Count_Step.i_click_on_Add_Counts()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Add_Count_Step.message_displayed_Login_Successful_for_Add_Counts_in_Points_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4017698917,
  "status": "passed"
});
formatter.uri("Login_Points.feature");
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
  "duration": 7150693891,
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
  "duration": 5094790,
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
