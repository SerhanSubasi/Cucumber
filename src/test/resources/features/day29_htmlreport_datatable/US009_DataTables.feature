@US009
Feature: US009 Google Testi

  Scenario: TC01 Google sayfasinda arama yapilir
    Given kullanici "https://google.com" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir

  Scenario: TC02 Google sayfasinda arama yapilir
    Given kullanici "https://google.com" sayfasina gider
    When kullanici verilen bilgiler ile arama yapar ikinci yol
      | volvo |
      | audi  |
      | honda |
    And sayfayi kapatir