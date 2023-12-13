Feature: US005 Google Testi
  
  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "ford" aratir
    Then sayfa basliginin "ford" icerdigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir