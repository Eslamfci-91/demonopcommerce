@smoke
Feature: users will be able to search for products with different parameters
  Scenario: user could search using product name
    When click on search field in home page
    And search for product "Apple"
    Then search result appear successfully

  Scenario: user could search using sku
    When click on search field in home page
    And search for product "AP_MBP_13"
    Then search result appear successfully