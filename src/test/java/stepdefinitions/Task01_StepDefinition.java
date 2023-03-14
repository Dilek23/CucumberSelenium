package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class Task01_StepDefinition {


    @Given("kullanici {string}sayfasina gider")
    public void kullaniciSayfasinaGider(String key) {
        Driver.getDriver().get("https://www."+key+".com/");

    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sayi) throws InterruptedException {
    Thread.sleep(sayi*1000);
     System.out.println("12 sn bekledik");


    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String key) {
     Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains(key));





    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
     Driver.closeDriver();
    }
}
