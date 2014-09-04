Uses: Gilded Rose

Feature: Gilded Rose Special Items

 Scenario: Aged Brie increases in quality with end of day
   Given an item "Aged Brie" with quality 10 and sell in 10
   When I process end of day
   Then the quality becomes 11 and sell in becomes 9


  Scenario: Aged Brie never increases in quality above 50
    Given an item "Aged Brie" with quality 50 and sell in 10
    When I process end of day
    Then the quality becomes 50 and sell in becomes 9


  Scenario: Sulfuras never changes in quality or sell in
    Given an item "Sulfuras, Hand of Ragnaros" with quality 50 and sell in 10
    When I process end of day
    Then the quality becomes 50 and sell in becomes 10


  Scenario: Backstage pass increases by one when there are more than 10 days to go
    Given an item "Backstage passes to a TAFKAL80ETC concert" with quality 10 and sell in 11
    When I process end of day
    Then the quality becomes 11 and sell in becomes 10

  Scenario: Backstage pass increases by one when there are more than 5 and less than 11 days to go
    Given an item "Backstage passes to a TAFKAL80ETC concert" with quality 10 and sell in 8
    When I process end of day
    Then the quality becomes 11 and sell in becomes 7


#  Scenario: Conjured items degrade twice as fast
#    Given an item "Conjured Bread Sticks" with quality 50 and sell in 10
#    When I process end of day
#    Then the quality becomes 48 and sell in becomes 10




