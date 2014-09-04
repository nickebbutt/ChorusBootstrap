Uses: Gilded Rose

Feature: Gilded Rose Items Degrade

  Scenario: At the end of a day items degrade in both quality and sellIn
    Given an item "foo"
    And the quality is 10
    And the sell in is 10
    When I process end of day
    Then the item's name is "foo"
    Then the quality is updated to 9
    And the sell in is updated to 9

  Scenario: An item degrades in quality twice as fast if sell in is negative
    Given an item "foo" with quality 10 and sell in -10
    When I process end of day
    Then the quality becomes 8 and sell in becomes -11

  Scenario: An item degrades in quality twice as fast if sell in is zero
    Given an item "foo" with quality 10 and sell in 0
    When I process end of day
    Then the quality becomes 8 and sell in becomes -1

  Scenario: An item can never degrade below zero quality
    Given an item "foo" with quality 0 and sell in 10
    When I process end of day
    Then the quality becomes 0 and sell in becomes 9





