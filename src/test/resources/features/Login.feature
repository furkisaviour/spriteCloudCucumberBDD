@miniRegression
Feature: Sample app login
  User Story: As a user
  I should be able to login and dashboard should be displayed.

  Background: user is on login page
    Given user is on login page


 Scenario: login with valid credentials
    When user enters username
    And user enters password
    And user clicks login button
    Then user should see Welcome text

  Scenario: login with invalid credentials
    When user enters invalid username
    And user enters invalid password
    And user clicks login button
    Then user should see Invalid username-password text

