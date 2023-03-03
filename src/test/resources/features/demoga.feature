@demago
Feature:demoga_kullanıcı_olustur

  Scenario Outline:kullanıcı_bilgileri
 Given kullanici ana sayfaya girer
    And kullanicı "<name>" girer
    And kullanicı "<email>" girer
    And kullanici checkbox secer
    And kullanicı "<userPhone>" girer
    And kullanicı "<data_of_birth>" girer
    And kullanicı "<subject>" girer
    And kullanici checkbox secer
    And kullanicı "<subject>" girer
    And kullanicı "<current_address>" girer
    And kullanicı "<state>" girer
    And kullanicı "<city>" girer
    And kullanici submit butonuna basar
    Examples:kullanıcı_bilgileri
    |name|email|userPhone|data_of_birth|subject|current_address|state|city|
    |Ayse|aysezor@gmail.com|55554479845|2011-02-04||current_address|state|city|