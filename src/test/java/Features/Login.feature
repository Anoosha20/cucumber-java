Feature:Application Login

Scenario:Homepage default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Homepage is populated
And Cards displayed are "true"

  Scenario:Homepage default login
    Given User is on NetBanking landing page
    When User login into application with "john" and password "4321"
    Then Homepage is populated
    And Cards displayed are "false"