
Feature: Calculator

  This example demonstrates a simple feature which tests the Calculator class
  In this test we'll check our Calculator can add and subtract numbers

  Scenario: Add two numbers
    Given I enter 50 into the calculator
    When I press add
    And I enter 70 into the calculator
    Then the result is 120

  Scenario: I subtract a number
    Given I enter 100 into the calculator
    When I press subtract
    And I enter 50 into the calculator
    Then the result is 50

