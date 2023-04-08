Feature: Sample

@tag1
  Scenario: To match sign in content in two different pages
    Given User is into at login page
    When Fetch sign in
    Then Home page is populated
    And UI is also looking proper
