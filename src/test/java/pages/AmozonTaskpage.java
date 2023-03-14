package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmozonTaskpage {

    /*

Amazon Senaryosu
o https://www.amazon.com.tr/ sitesi açılır.
o Ana sayfanın açıldığı kontrol edilir.
o  Çerez tercihlerinden Çerezleri kabul et seçilir.
o  Siteye login olunur.
o Login işlemi kontrol edilir.
o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
o Bilgisayar kategorisi seçildiği kontrol edilir.
o Arama alanına MSI yazılır ve arama yapılır.
o Arama yapıldığı kontrol edilir.
o Arama sonuçları sayfasından 2. sayfa açılır.
o 2. sayfanın açıldığı kontrol edilir.
o Sayfadaki 2. ürün favorilere eklenir.
o 2. Ürünün favorilere eklendiği kontrol edilir.
o Hesabım > Favori Listem sayfasına gidilir.
o "Favori Listem" sayfası açıldığı kontrol edilir.
o Eklenen ürün favorilerden silinir.
o Silme işleminin gerçekleştiği kontrol edilir.
o Üye çıkış işlemi yapılır.
o Çıkış işleminin yapıldığı kontrol edilir.

 */
private WebDriver driver;
    public AmozonTaskpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void getUrl(){
      driver.get("https://www.amazon.com.tr/");
    }

    public void verifyHomePage(){
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));
    }
    @FindBy(id="sp-cc-accept")
    private WebElement cerezKblEt;
    public void acceptCErez(){
        cerezKblEt.click();
    }
@FindBy(id = "nav-link-accountList")

    private WebElement loginOl;
 @FindBy(linkText ="Giriş yap" )
    private WebElement doEntry;

 @FindBy(id="ap_email")
    private WebElement email;
 @FindBy(id="continue")
 private WebElement continueLogin;
 @FindBy(id="ap_password")
 private WebElement password;



 public void beLogin(){
     Actions actions=new Actions(Driver.getDriver());
     actions.moveToElement(cerezKblEt)
             .moveToElement(doEntry).perform();
     doEntry.click();
     email.sendKeys("trydilek23@gmail.com"+ Keys.ENTER);
     continueLogin.click();
     password.sendKeys("trdilek49"+Keys.ENTER);


 }





}
