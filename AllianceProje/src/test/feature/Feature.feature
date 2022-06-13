Feature: Imdb menuden film kontrol etme
  Scenario:Imdb film karsılastırma
    Given Imdb Siteye gidilir
    When Arama çubugunun sol tarafinda bulunan Menu butonuna basilir
    And Gelen ekranda Award & Events basligi altinda bulunan Oscars butonuna tiklanir
    And Event History basligi altinda "1929" degeri secilir
    And Honorary Award başligi altinda The Jazz Singer secilir

