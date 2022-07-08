Feature: Clicking functionality
    Agile Story = As a user , when I click the button
    I should be able to see how many times the link was clicked

@miniRegression
 Scenario: Clicking 2 times
   Given user is on mouseOver page
   When user clicks button
   Then user should see that the clicked 2 times