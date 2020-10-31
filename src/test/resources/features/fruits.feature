@fig
Feature: Search on google page

  Background:
    When User is on the google search page

  Scenario Outline: User story1
    Then user search for "<SearchValue>" and "<Action>"
    Examples:
    Examples:
      | SearchValue | Action   |
      | Tesla       | Electric |
      | Lexus       | Good     |
      | BMW         | Perfect  |
      | Audi        | Goods    |
      | Nonda       | Red      |
      | Porshe      | White    |


