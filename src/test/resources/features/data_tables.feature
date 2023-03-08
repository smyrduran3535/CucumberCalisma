Feature:kulanici_giris_bilgileri

  @giris_bilgileri
  Scenario: giris_bilgileri
    Given kullanici "https://www.bluerentalcars.com/login" ana sayfaya girer
    And kullanici email ve sifre girer
      | email                          | sifre    |
      | kate.brown@bluerentalcars.com  | tad1$Fas |
      | raj.khan@bluerentalcars.com    | v7Hg_va^ |
      | pam.raymond@bluerentalcars.com | Nga^g6!  |
