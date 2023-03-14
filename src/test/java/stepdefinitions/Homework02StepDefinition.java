package stepdefinitions;

import pages.Homework01Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class Homework02StepDefinition {
    @Given("Kullanici Google gider.")
    public void kullaniciGoogleGider() {
        Driver.getDriver().get("https://google.com/");
    }

    @When("Kullanici Selenium kelimesini arar")
    public void kullaniciSeleniumKelimesiniArar() {
        Homework01Pages hmp=new Homework01Pages();
        hmp.searcWord("selenium");
    }

    @Then("Kullanici Selenium kelimesini aradini dogrular")
    public void kullaniciSeleniumKelimesiniAradiniDogrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));
    }
}
