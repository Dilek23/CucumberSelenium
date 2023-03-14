Feature:Google da selenium arama
  Scenario: Kullanici Googlede selenium arar vekelimenin titleni dogrular
    Given Kullanici Google gider.
    When Kullanici Selenium kelimesini arar
    Then Kullanici Selenium kelimesini aradini dogrular