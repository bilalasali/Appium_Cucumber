
Feature: Kullanici aile Butcem uygulamasindaki gorevleri yerine getirir.

  Background: Uygulamaya giris yapilir
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  Scenario Outline: Kullanici uygulamada kullanici bilgilerini degistirir ve degistirildigini dogrular.

  * sol kisimdaki menuden "Hesabım" bolumune gidin
  * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisikleri kaydedin ve değişikleri dogrulayin
  * uygulamayi kapatir
    Examples:
      | isim  | soyisim | sehir | yas | meslek |
      | isim1 | soyisim1| sehir1| yas1| meslek1|
      | isim2 | soyisim2| sehir2| yas2| meslek2|

  Scenario: Kullanici gelir ekleme bolumundeki gorevleri yerine getirir

     * anasayfadaki arti butonuna tiklayin
     * "Gelir Ekle" bolumune tiklayin
     * aciklama kismina "Merhaba yine ben" gonderilir.
     * Gelir tipi "Düzensiz" olarak gonderilir.
     * Kategori bolumunden "Serbest Gelir" secilir.
     * tarih secme bolumunden 4 "18" tarihi secilir.
     * tutar olarak "18500" degeri girilir.
     * "Kaydet" butonuna tiklanir.
     * basariyla eklendigini dogrulayin


   Scenario: Kullanici gider ekler

    * anasayfadaki arti butonuna tiklayin
    * "Gider Ekle" bolumune tiklayin
    * aciklama kismina "Merhaba gider ekleme" gonderilir.
    * Gelir tipi "Düzensiz" olarak gonderilir.
    * Kategori bolumunden "Market" secilir.
    * tarih secme bolumunden 1 "26" tarihi secilir.
    * tutar olarak "1500" degeri girilir.
    * "Kaydet" butonuna tiklanir.
    * basariyla eklendigini dogrulayin

  @ab
  Scenario: Kullanici birikim ekleme kismindaki gorevleri yerine getirir

    * anasayfadaki arti butonuna tiklayin
    * "Birikim Ekle" bolumune tiklayin
    * aciklama kismina "Merhaba birikim ekleme" gonderilir.
    * Gelir tipi "Düzensiz" olarak gonderilir.
    * Kategori bolumunden "Hisse Senedi" secilir.
    * tarih secme bolumunden 3 "8" tarihi secilir.
    * tutar olarak "15000" degeri girilir.
    * "Kaydet" butonuna tiklanir.
    * basariyla eklendigini dogrulayin