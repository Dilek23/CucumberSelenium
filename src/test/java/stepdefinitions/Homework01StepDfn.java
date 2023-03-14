package stepdefinitions;

import pages.Homework01Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class Homework01StepDfn {
    /*
    Feature:Gogle da cucumber arama

  Scenario: Google da kelime arandigind ilgili kelimeyi title de dogrulama
    Given Kullanici Google sayfasindadir...
    When Kullanici Cucumber kelimesini arar
    Then Kullanici Google da cucumber gectigini dogrular

  public Homework01Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div/input")
    private WebElement searchText;

    public void searcWord(String value){
        searchText.sendKeys(value+ Keys.ENTER);

    }

     */
    @Given("Kullanici Google sayfasindadir...")
    public void kullaniciGoogleSayfasindadir() {
        Driver.getDriver().get("https://google.com/");
    }

    @When("Kullanici Cucumber kelimesini arar")
    public void kullaniciCucumberKelimesiniArar() {
        Homework01Pages hmp=new Homework01Pages();
        hmp.searcWord("cucumber");
    }

    @Then("Kullanici Google da cucumber gectigini dogrular")
    public void kullaniciGoogleDaCucumberGectiginiDogrular() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));

    }
}
