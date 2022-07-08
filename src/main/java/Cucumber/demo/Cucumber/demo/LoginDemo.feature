
@tag
Feature: Login Functionolity

  @tag1
  Scenario: Open Browser
    Given open browser
    And enter URL
    When enter username
    And enter password
    And click login
    Then succussfully login
