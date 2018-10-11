Feature: As a user of capitalfm want to be able to view to currently playing and recently played tracks

  Scenario:
    Given I am on the capitalfm landing page
    When I click on the Last Played Songs
    And I select any Calvin Harris song
    Then the album page should be displayed


