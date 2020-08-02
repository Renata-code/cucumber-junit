@smartBear
Feature: Smart Bear Order process

  Agile story User verifies John Wick is on the list

  Scenario: User Wick is on the list verification

 Given User is on the SmartBear Tester account and on Order page

  Then User selects "FamilyAlbum" from product dropdown
  Then User enters "4" to quantity
  Then User enters "John Wick" to costumer name
  Then User enters "Kinzie Ave" to street
  Then User enters "Chicago" to city
  Then User enters "IL" to state
  Then User enters "60056"
  Then User selects Visa as card type
  Then User enters "1111222233334444" to card number
  Then User enters "12/22" to expiration date
  Then User clicks process button
  Then User verifiesJohn Wick is in the list
