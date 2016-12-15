Feature: this is my logging feature file

  @TestLink
  Scenario Outline: this is logging scenario
    Given navigate to CPT Portal <URL>
    And logging into the portal using id <User Id>
    And logging into the portal using pass <Password>
    And click on login
    When user clicks on the right arrow
    And user clicks on "Test cases"
    And user clicks on Test Specification "Test specification"
    And user clicks on folder name "TS XXX"
    And user clicks on Test Case Operation button "Create"
    And user fills in "Test Case Title" and "Summary"
    And user clicks on create button "Create"
    And user clicks on delete button "Delete"
    And user clicks on deletion confiramtion button "Yes, delete Test Case"
    Then check if test cases is successfully deleted "Test Case Title was"
    And close the browser

    Examples: 
      | User Id     | Password    | URL                              | Expected text | Comment                      |
      | testanalyst | cptYTP2016! | http://www.yourtestprojects.com/ | Log out       | positive test: ingelogt suc6 |
