package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(20)),this);
    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement mailKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement sifreKutusu;

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYazisiDogrulama;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement hamburgerMenu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyIsimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement yasadigimSehirKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklamaKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement tutarKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[10]")
    public MobileElement duzenliDuzensizKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[11]")
    public MobileElement kategoriKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[12]")
    public MobileElement tarihKutusu;





    private void kutuTemizlemeMethodu(){
        isimKutusu.clear();
        soyIsimKutusu.clear();
        yasadigimSehirKutusu.clear();
        yasKutusu.clear();
        meslekKutusu.clear();
    }
    public void hesabimTextBoxSendKeysMethodu(String isim, String soyIsim, String sehir, String yas, String meslek){
        kutuTemizlemeMethodu();
        isimKutusu.sendKeys(ConfigReader.getProperty(isim));
        soyIsimKutusu.sendKeys(ConfigReader.getProperty(soyIsim));
        yasadigimSehirKutusu.sendKeys(ConfigReader.getProperty(sehir));
        yasKutusu.sendKeys(ConfigReader.getProperty(yas));
        meslekKutusu.sendKeys(ConfigReader.getProperty(meslek));
        ReusableMethods.scrollWithUiScrollableAndClick("Kaydet");
    }

    public void kutuDogrulamaMethodu(String isim, String soyIsim, String sehir, String yas, String meslek){

        assertEquals(isimKutusu.getText(), ConfigReader.getProperty(isim));
        assertEquals(soyIsimKutusu.getText(), ConfigReader.getProperty(soyIsim));
        assertEquals(yasadigimSehirKutusu.getText(), ConfigReader.getProperty(sehir));
        assertEquals(yasKutusu.getText(), ConfigReader.getProperty(yas));
        assertEquals(meslekKutusu.getText(), ConfigReader.getProperty(meslek));

    }



    public void ilkEkranAyarlari() throws InterruptedException {
        Thread.sleep(6000);

        for (int i = 0; i < 6; i++) {
            ReusableMethods.ekranKaydirma(906,1001,500,139,1001);
        }
       ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }

    public void girisYap() throws InterruptedException {
        Thread.sleep(1000);
        mailKutusu.sendKeys(ConfigReader.getProperty("mail"));
        sifreKutusu.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");

    }
    public void tarihSecmeMethodu(int forBitis) throws InterruptedException {

        for (int i = 0; i <forBitis ; i++) {
            ReusableMethods.ekranKaydirma(818,1052,500,263,1052);

        }
    }
}
