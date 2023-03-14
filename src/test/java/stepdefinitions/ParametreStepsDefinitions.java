package stepdefinitions;

import pages.GoogleSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class ParametreStepsDefinitions {

    @When("Kullanici arama kutusuna {string} aratiginda")
    public void kullaniciAramaKutusunaAratiginda(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);
    }

    @Then("Kullanici title de {string} gormelidir")
    public void kullaniciTitleDeGormelidir(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
    }
}
