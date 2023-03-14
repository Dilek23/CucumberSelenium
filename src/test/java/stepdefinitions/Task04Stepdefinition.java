package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.Driver;

public class Task04Stepdefinition {
    @Given("Kullanici {string}sayfasina gider")
    public void kullaniciSayfasinaGider(String key) {
        key=key.replaceAll("_url","");
        Driver.getDriver().get("https://www."+key+".com/");

    }

    @Then("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sayi) throws InterruptedException {
        Thread.sleep(sayi*1000);
        System.out.println("12 sn bekledik");
    }

    @And("Sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(key));
    }

    @And("Sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
