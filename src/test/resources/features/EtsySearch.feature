@etsyAll
Feature: Etsy search feature
  Agile story: User should be able to enter search terms and see
  relevant results in the page and in the title

  Background: User is ont the etsy home page
    Given  User is on the etsy home page


  Scenario: Title verification
    Then   User should see title as expected

    #expected : is Etsy - Shop for handmade, vintage,custom,and unique gifts for everyone

  Scenario: Ttile verification after search term
    When User searches "wooden spoon" in the search box
    And user clicks to search button
    Then User should see "Wooden spoon" in the Etsy title


