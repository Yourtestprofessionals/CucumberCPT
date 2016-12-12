Feature: this is my logging feature file

  @login
  Scenario Outline: this is logging scenario
    Given navigate to CPT Portal <URL>
    When logging into the portal using id <User Id>
    And logging into the portal using pass <Password>
    And click on login
    Then check out login link <Expected text>
    And close the browser

    Examples: 
      | User Id           | Password    | URL                              | Expected text                     | Comment                           |
      | softwaredeveloper | cptYTP2016! | http://www.yourtestprojects.com/ | Log out                           | positive test: ingelogt suc6      |
      | testanalyst       | cptYTP2016! | http://www.yourtestprojects.com/ | Log out                           | positive test: ingelogt suc6      |
      | testleader        | cptYTP2016! | http://www.yourtestprojects.com/ | Log out                           | positive test: ingelogt suc6      |
      | stakeholder       | cptYTP2016! | http://www.yourtestprojects.com/ | Log out                           | positive test: ingelogt suc6      |
      | projectmanager    | cptYTP2016! | http://www.yourtestprojects.com/ | Log out                           | positive test: ingelogt suc6      |
      | donaldduck        | cptYTP2016! | http://www.yourtestprojects.com/ | Have you forgotten your password? | Positive test: Niet ingelogt suc6 |
      | donaldduck        | cptYTP2016! | http://www.yourtestprojects.com/ | Oops                              | negative test: Niet ingelogt suc6 |
