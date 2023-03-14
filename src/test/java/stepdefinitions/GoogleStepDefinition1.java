package stepdefinitions;

import pages.GoogleSearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class GoogleStepDefinition1 {
    @Given("Kullanici Google sayfasindadir")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://google.com/");
    }

    @When("Kullanici samsung kelimesini arar.")
    public void kullaniciSamsungKelimesiniArar() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("Kullnici sayfada Samsung kelimesi gectigini dogrular")
    public void kullniciSayfadaSamsungKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));
        Driver.closeDriver();
    }

    @When("Kullanici cucumber kelimesini arar.")
    public void kullaniciCucumberKelimesiniArar() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("Cucumber");

    }

    @Then("Kullnici sayfada Cucumber kelimesi gectigini dogrular")
    public void kullniciSayfadaCucumberKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));
        Driver.closeDriver();

    }

    @When("Kullanici selenium kelimesini arar.")
    public void kullaniciSeleniumKelimesiniArar() {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("Selenium");

    }

    @Then("Kullnici sayfada Selenium kelimesi gectigini dogrular")
    public void kullniciSayfadaSeleniumKelimesiGectiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Selenium"));
        Driver.closeDriver();
    }
}
