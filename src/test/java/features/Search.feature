Feature:
  As a user
  I want to be able to search for products using filters and sort features
  So that I can find what I am looking for in a reliable way


  Scenario: Simple search
    Given the user is on landing page
    When the user searches for "Catan 5th Edition"
    Then he should see "Settlers of Catan Board Game 5th" in the results