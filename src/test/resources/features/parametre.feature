Feature:Amazon testi
  Scenario: TC01_amazon_iphone_arama
    Given kullanici "amazonUrl" gider
    When kullanici "iphone" için arama yapar
    Then sayfa basliginin "iphone" icerdigini test eder
    And sayfayi kapatir