Feature: Google search test
  Scenario: Google da bir kelime arandiginda ilgili kelimeyi barindiran sonuclar görüntülenmelidir
    Given Kullanici Google sayfasindadir
    When Kullanici samsung kelimesini aarar
    Then Kullanici Google da sanmsung gectigini dogrular