
  Feature: Amazon'da urun arama favoriye ekleme
    Scenario Outline:
      Given Kullanici Amazona gider
      When Anasayfanin acildigi kontrol edilir.
      And Cerez tercihlerinden cerezler kabul edilir.
      Then Siteye login olunur.
      And login islemi kontrol edilir.
     And Arama butonu yanindaki kategoriler tabindan bilgisayar seçilir.
     Then Bilgisayar kategorisi seçildiği kontrol edilir.
      And Arama alanına "<Aranacak Kelime>" yazilir ve arama yapilir.
     Then Arama yapıldığı kontrol edilir.
      And  Arama sonuçları sayfasından 3. sayfa açılır.
      Then  3. sayfanın açıldığı kontrol edilir.
      And Sayfadaki 2. ürün favorilere eklenir.
      Then 2. Ürünün favorilere eklendiği kontrol edilir.
      And Hesabım > Favori Listem sayfasına gidilir.
     Then "Favori Listem" sayfasi acildigi kontrol edilir.
      And Eklenen ürün favorilerden silinir.
      And Silme işleminin gerçekleştiği kontrol edilir.
      And Üye çıkış işlemi yapılır.
      And  Cikis isleminin yapildigi kontrol edilir.
      Examples:
      |Aranacak Kelime|
      |HP    |
      |APPLE |
      |ASUS  |