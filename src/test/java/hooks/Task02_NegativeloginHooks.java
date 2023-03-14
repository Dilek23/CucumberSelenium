package hooks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Task02_NegaativeloginPage;
import utilities.Driver;

public class Task02_NegativeloginHooks {
Task02_NegaativeloginPage  nlP=new Task02_NegaativeloginPage(Driver.getDriver());
    @Given("Kullanici anasayfaya gider")
    public void kullaniciAnasayfayaGider() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }

    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String key) {
        nlP.userNameGir(key);


    }

    @And("Kullanici password {string} girer")
    public void kullaniciPasswordGirer(String arg0) {
        nlP.passWordGir(arg0);

    }

    @When("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        nlP.loginOl();
    }

    @And("Senaryo fail olur")
    public void senaryoFailOlur() {
        Assert.assertTrue(nlP.error.isDisplayed());
    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
