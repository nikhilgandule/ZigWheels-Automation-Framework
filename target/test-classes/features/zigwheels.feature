Feature: Zigwheels Application Testing

  Scenario: Google Login
    Given user launches the application
    When user performs google login
    Then login should be successful

  Scenario: Upcoming Honda Bikes
    Given user is on bikes page
    When user selects upcoming bikes and chooses Honda
    Then user should see Honda bikes under 4 lakhs

  Scenario: Electric Cars
    Given user navigates to electric cars page
    When user opens the first electric car
    Then car details should be displayed

  Scenario: User Reviews
    Given user navigates to reviews page
    When user retrieves reviews in descending order
    Then reviews should be displayed correctly

  Scenario: Browse BMW Cruiser Bikes
    Given user scrolls to browse by brand
    When user selects BMW and chooses cruiser bikes
    Then BMW cruiser bikes should be displayed

  Scenario: Car Filters
    Given user navigates to cars section
    When user applies filters for 9 seater, 3000cc, and price
    Then filtered cars should be displayed

  Scenario: Electric Bikes Search
    Given user navigates to electric bikes page
    When user searches for electric bikes
    Then electric bike results should be shown
    
    