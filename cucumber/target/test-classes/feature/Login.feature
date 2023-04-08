Feature: Application Login

  Scenario: 
    Given User is at login page
    When User login into page with it username and password
    Then Home page is populated
    And UI is also looking proper

  Scenario: Home Page default login
    Given User is at login page
    When User login into page with it username and password
    Then Home page is populated
    And UI is also looking proper

  Scenario Outline: Home Page sucessful login
    Given User is at login page
    When User login to the page with "pragya" and password "pragya123"
    Then Home page is populated
    And UI is not proper

  Scenario Outline: Home Page sucessful login
    Given User is at login page
    When User sign up with below details
      | pragya | pragya123 | pragya@gmail.com | 123456 |
      | rekha  | rekha123  | rekha@gmail.com  | 123456 |
    Then Home page is populated
    And UI is not proper

  Scenario Outline: Home Page sucessful login
    Given User is at login page
    When User login to the page with it <username> and <password>
    Then Home page is populated
    And UI is also looking proper

    Examples: 
      | username | password  |
      | pragya   | pragya123 |
      | kaveri2  | kaveri123 |
      | user3    | pass3     |
      | user4    | pass4     |

@sanity1
  Scenario: To match sign in content in two different pages
    Given User is at login page
    When Fetch sign in content from login page
    Then Click on Sign up link and land to sign up page
    And Fetch sign in content from sign up page
    And Match actual content and expected sign in content

    