Feature: Dinamik Url
  Scenario Outline: Dinamik Urller
    Given Kullanici "<page_url>"sayfasina gider
    Then Kullanici 4 sn bekler
    And Sayfa basliginin "<kelime>" icerdigini test eder
    And Sayfayi kapatir.

    Examples:
      |page_url|kelime|
      |google_url  |google|
      |amazon_url  |amazon|
      |trendyol_url|trendyol|