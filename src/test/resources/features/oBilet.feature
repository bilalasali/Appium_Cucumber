Feature: Kullanici verilen gorevler uzerinden OBilet sayfasindaki fonksiyonlari dogrular
  @obilet
  Scenario: Kullanici dil ve para pirimi degistirme sayfasindaki islemleri dogrular

  * "url" sayfasina gidilir
  * dil olarak turkce secilir
  * para birimi olarak tl secilir
  * otobus bileti bul a tiklanir
  * gelen bilet fiyatlarinin tl oldugu dogrulanir