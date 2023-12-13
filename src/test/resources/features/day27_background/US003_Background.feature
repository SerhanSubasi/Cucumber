#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

@US003
Feature: US003 Amazon Testi

  Background: #Ortak olanları Background içine yazarız. Ama başlangıç sadece.
    Given kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 Arama Kutusunda iphone Aratılır
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  @samsung
  Scenario: TC02 Arama Kutusunda samsung Aratılır
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 Arama Kutusunda nokia Aratılır
    When arama kutusunda nokia aratir
    And sayfayi kapatir