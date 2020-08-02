Feature: SmartBear Order Process

  Agile story User is on the SmartBear tester account and fills out the form

  Scenario Outline: User logged into SmartBear account and in order page
    Given User is on the login page and enters credentials
    Then User clicks on Order
    Then User selects "<product>"from product dropdown
    Then User enters "<quantity>"to quantity
    Then User enters "<customer name>"to costumer name
    Then User enters “<street>”to street
    Then User enters “<city>”to city
    Then User enters “<state>”to state
    Then User enters “<zip>” to zip
    Then User selects “<cardType>”as card type
    Then User enters “<card number>”to card number
    Then User enters “<exp date>”to expiration date
    Then User clicks process button
    Then User verifies “<costumer name>”is in the list
    Examples:

      | product | quantity | customer name | street    | city    | state | zip   | cardType | card number   | exp date | expectedName |
      | MyMoney | 1        | Ken Adams     | Kinzie st | Chikago | IL    | 60004 | Visa     | 3285749843943 | 12/22    | KenAdamas    |

