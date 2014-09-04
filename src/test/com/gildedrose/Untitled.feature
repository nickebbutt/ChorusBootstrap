Uses: GildedRose

Feature: As a supplier of perishable goods
         I want the system to degrade the inventories stored quality
         Because accurate reporting will help us to avoid customer disappointment

    Scenario: Quality and Sell-In decrement every day before the sell-by day has passed
       Given an item "foo" with quality 10 and sell in 10
        When the day changes
       Then  the item "foo" has quality 9 and sell in 9

    Scenario: Quality reduces twice as fast after the sell-by has passed
        Given an item "foo" with quality 10 and sell in -10
        When the day changes
        Then the item "foo" has quality 9 and sell in -11

   Scenario: Quality can never be negative
        Given an item "foo" with quality 2
        When 4 day changes have passed
        Then the item "foo" has quality 0






