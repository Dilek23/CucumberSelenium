Feature:Google Arama Feuture

  Background:
    Given Kullanici Google sayfasindadir

    Scenario: cucumber search
      When Kullanici arama kutusuna "cucumber" aratiginda
      Then Kullanici title de "cucumber" gormelidir
