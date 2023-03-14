Feature:Gogle da cucumber arama

  Scenario: Google da kelime arandigind ilgili kelimeyi title de dogrulama
    Given Kullanici Google sayfasindadir...
    When Kullanici Cucumber kelimesini arar
    Then Kullanici Google da cucumber gectigini dogrular
