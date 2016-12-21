Feature: this is my issue feature file

  @Issues
  Scenario Outline: this is the issue logging scenario(s)
    Given navigate to CPT Portal <URL>
    And logging into the portal using id <User Id>
    And logging into the portal using pass <Password>
    And click on login
    When user clicks on the right arrow
    And user clicks on Issues "Issues"
    And user clicks on Report Issue "Report Issue"
    And user select issue category with value <category>
    And user select issue reproducibility with value <Reproducity>
    And user selct issue severity with value <Severity>
    And user select issue priority with value <Priority>
    And user fills in summary "Summary text" and description "Description text"
    And user submit the issue form
    Then close the browser

    Examples: 
      | Priority | Severity  | Reproducity         | category           | User Id     | Password    | URL                              | Expected text | Comment                      |
      | Medium   | Blocking  | always              | Question           | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | Low      | Very High | sometimes           | Question           | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | Blocking | High      | Unable to reproduce | Question           | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | High     | Medium    | have not tried      | Question           | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | High     | Low       | have not tried      | Question           | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | High     | High      | always              | Issue              | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
      | High     | High      | always              | Request for change | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
