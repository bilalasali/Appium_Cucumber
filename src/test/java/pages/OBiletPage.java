package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class OBiletPage {

    public OBiletPage(){
        PageFactory.initElements(BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "(//button[@data-event-category='Main Menu'])[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@title='Language Select']")
    public WebElement englishButton;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement turkishLanguage;

    @FindBy(xpath = "//*[@title='Currency Select']")
    public WebElement currencySelect;

    @FindBy(xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement turkisLira;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement searchButton;

    @FindBy(xpath = "(//span[@class='amount-sign'])[1]")
    public WebElement fiyatTuru;
}
