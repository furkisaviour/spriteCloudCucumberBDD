@miniRegression
  Feature:Input functionality

    Scenario Outline: Input Searching
      Given user is on Text input page
      When user searches "<keyword>"
      And user clicks update button
      Then user should see "<expectedTitle>"

      Examples:
      |keyword        | expectedTitle |
      |spriteCloud    | spriteCloud   |
      |meatball       | meatball      |
      |Captain Price  | Captain Price |