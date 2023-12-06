Feature: I, as a user, want to buy a pair of shoes from the bon-bonite store

  Scenario Outline: Saucedemo
    Given Luis open pages saucelab
    When  I write tha credential <username> and <password> about the search engine
    Then I enter the page correctly

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | performance_glitch_user | secret_sauce |
