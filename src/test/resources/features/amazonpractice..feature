Feature: amazon saftasında arama yapma

  @amazon
  Scenario: amazon sayfasında dil change etmek
    Given kullanıcı anasayfaya gider
      When dil menusune gelelim
    And Change butonuna basiniz
    And DropDownVisibleText kullanarak TRY Turkish Lira optionunu secin ve yazdırın
    And Tüm option'ları yazdırın
    And dropdowndaki tum optionlarin toplam sayısının 68 ye esit oldugunu test edin
    When Save Changes butonuna basınız
  And arama motoruna Kitap yazip aratin
  And ilk cikan urunun parabiriminin TRY oldugunu test edin
 # And sayfa kapatılır
    #Then sayfa kapatılır


