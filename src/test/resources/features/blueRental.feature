@rental_car
Feature:US167854_manager_login_test
  Scenario Outline:kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given kullanici ana sayfada
    When kullanici login sayfasina gider
    And kullanıcı adini "<kullanıcı_adi>" girer
    And sifreyi "<sifre>" girer
    And login buttoning basar
    Then login islemi gerçekleşir

    Examples: manager_login_bilgileri
    |kullanıcı_adi|sifre|
    |sam.walker@bluerentalcars.com|c!fas_art|
    |kate.brown@bluerentalcars.com|tad1$Fas|
    |raj.khan@bluerentalcars.com|v7Hg_va^|
    |pam.raymond@bluerentalcars.com|Nga^g6!|