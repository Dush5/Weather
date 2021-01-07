Feature: Weather report

  Scenario:  Verify given weather report is correct
    Given City location is given
    When  I fetch the weather temp by city name
    Then I should get the Earth_Id
    When I fetch weather temp by Earth_id
    Then I should get the min_temp and max_temp
