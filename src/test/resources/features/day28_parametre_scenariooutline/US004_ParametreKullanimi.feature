@US004
Feature: US004 Amazon Testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  Scenario: TC01 Arama kutusunda nokia aratilir
    And arama kutusunda "nokia" aratir
    And sayfayi kapatir

  Scenario: TC02 Arama kutusunda java aratilir
    And arama kutusunda "java" aratir
    And sayfayi kapatir

  Scenario: TC03 Arama kutusunda selenium aratilir
    And arama kutusunda "selenium" aratir
    And sayfayi kapatir


    #Feature file'ı daha dinamik hale getirebilmek için gitmek istediğimiz url'i ya da
    #aratmak istediğimiz ifadeyi "" (çift tırnak) içinde belirtebiliriz.
    #Çünkü tırnak içinde yazdığımız değer artık stepDefinition class'ındaki method için bir parametreye dönüşür.