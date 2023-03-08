@personel_olusturma
Feature: datatables_personel_olusturma
  Scenario Outline: TC01_personel_olustur
    Given kullanıcı "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
And kullanici first name "<firstname>" girer
And kullanici last name "<lastname>" girer
And kullanici positions "<positions>" girer
And kullanici office "<office>" girer
And kullanici extension "<extension>" girer
And kullanici start_date "<start_date>" girer
And kullanici salary "<salary>" girer
    And kullanici create butonuna basar
    And kullanici firstname  "<firstname>" ile arar
    And kullanici  "<firstname>" in olustugunu test eder
    Then sayfayi kapatir



    Examples: personel_bilgileri
|firstname|lastname|positions|office|extension|start_date|salary|
|Tuba|Hayat|QA|Ankara|125|2023-05-21|100000|
|Nese|Gul|QA|Izmir|122|2023-09-21|10000|
|Ali|Bayrak|PO|Istanbul|123|2023-03-21|120000|
|Emir|Buyuk|QA|Adana|128|2023-06-21|500000|
|Nil|Nehir|QA|Maras|127|2023-04-11|800000|