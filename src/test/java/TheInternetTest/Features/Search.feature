@Search
  Feature: The Internet

    Scenario Outline: Open link: "<link>"
      Given User is on homepage
      When user clicks link for "<link>"
      Then user must see "<link>" in results

      Examples:
      |         link          |
      |       Checkboxes      |
      |     Drag and Drop     |
      |      Context Menu     |
      |      Broken Images    |
      |   Dynamic Content     |
      |     Floating Menu     |
      |     Key Presses       |
      |    Shifting Content   |
      |     Status Codes      |
      |    Slow Resources     |
      |       Checkboxes      |
      |     Drag and Drop     |
      |      Context Menu     |
      |      Broken Images    |
      |   Dynamic Content     |
      |     Floating Menu     |
      |     Key Presses       |
      |    Shifting Content   |
      |     Status Codes      |
      |    Slow Resources     |
