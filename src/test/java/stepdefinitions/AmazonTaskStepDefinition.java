package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmozonTaskpage;
import utilities.Driver;

public class AmazonTaskStepDefinition {
    @Given("Kullanici Amazona gider")
    public void kullaniciAmazonaGider() {
        AmozonTaskpage amazn=new AmozonTaskpage(Driver.getDriver());
        amazn.getUrl();

    }

    @When("Anasayfanin acildigi kontrol edilir.")
    public void anasayfaninAcildigiKontrolEdilir() {
        AmozonTaskpage amzn=new AmozonTaskpage(Driver.getDriver());
        amzn.verifyHomePage();


    }

    @And("Cerez tercihlerinden cerezler kabul edilir.")
    public void cerezTercihlerindenCerezlerKabulEdilir() {
        AmozonTaskpage crz=new AmozonTaskpage(Driver.getDriver());
       crz.acceptCErez();

    }

    @Then("Siteye login olunur.")
    public void siteyeLoginOlunur() {
        AmozonTaskpage logn=new AmozonTaskpage(Driver.getDriver());
        logn.beLogin();
    }

    @And("login islemi kontrol edilir.")
    public void loginIslemiKontrolEdilir() {
        AmozonTaskpage eMail=new AmozonTaskpage(Driver.getDriver());
        eMail.beLogin();
    }

    @And("Arama butonu yanindaki kategoriler tabindan bilgisayar seçilir.")
    public void aramaButonuYanindakiKategorilerTabindanBilgisayarSeçilir() {
    }

    @Then("Bilgisayar kategorisi seçildiği kontrol edilir.")
    public void bilgisayarKategorisiSeçildiğiKontrolEdilir() {
    }

    @And("Arama alanına {string} yazilir ve arama yapilir.")
    public void aramaAlanınaYazilirVeAramaYapilir(String arg0) {
    }

    @Then("Arama yapıldığı kontrol edilir.")
    public void aramaYapıldığıKontrolEdilir() {
    }

    @And("Arama sonuçları sayfasından {int}. sayfa açılır.")
    public void aramaSonuçlarıSayfasındanSayfaAçılır(int arg0) {
    }

    @Then("{int}. sayfanın açıldığı kontrol edilir.")
    public void sayfanınAçıldığıKontrolEdilir(int arg0) {
    }

    @And("Sayfadaki {int}. ürün favorilere eklenir.")
    public void sayfadakiÜrünFavorilereEklenir(int arg0) {
    }

    @Then("{int}. Ürünün favorilere eklendiği kontrol edilir.")
    public void ürününFavorilereEklendiğiKontrolEdilir(int arg0) {
    }

    @And("Hesabım > Favori Listem sayfasına gidilir.")
    public void hesabımFavoriListemSayfasınaGidilir() {
    }

    @Then("{string} sayfasi acildigi kontrol edilir.")
    public void sayfasiAcildigiKontrolEdilir(String arg0) {
    }

    @And("Eklenen ürün favorilerden silinir.")
    public void eklenenÜrünFavorilerdenSilinir() {
    }

    @And("Silme işleminin gerçekleştiği kontrol edilir.")
    public void silmeIşlemininGerçekleştiğiKontrolEdilir() {
    }

    @And("Üye çıkış işlemi yapılır.")
    public void üyeÇıkışIşlemiYapılır() {
    }

    @And("Cikis isleminin yapildigi kontrol edilir.")
    public void cikisIslemininYapildigiKontrolEdilir() {
    }
}
