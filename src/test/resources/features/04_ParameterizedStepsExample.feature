Feature: Parametreli Step kullanimi


  Scenario: Cucumber step definition (Cucumber edition)
    Given  Ilk sayi 5
    And Ikınci sayi 3
    When Bu sayilari + opeartörüne sokarsam
    Then sonuc 8 olmalidir


  Scenario Outline: CucumberStep Definiton
    Given Ilk sayi <sayi1>
    And Ikınci sayi <sayi2>
    When Bu sayilari <operator> opeartörüne sokarsam
    Then sonuc <sonuc> olmalidir
    Examples:
      | sayi1 | sayi2 | operator | sonuc |
      | 10    | 15    | +       | 25    |
      | 5     | 2     | -       | 3     |
      | 4     | 7     | *       | 26    |
      | 9     | 2     | /       | 4     |


  Scenario: Cucumber Step Definition (Regex Edition)

