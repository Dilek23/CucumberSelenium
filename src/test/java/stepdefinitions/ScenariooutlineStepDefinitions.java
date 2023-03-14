package stepdefinitions;

import pages.GoogleSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.Driver;

public class ScenariooutlineStepDefinitions {
    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String key) {
        GoogleSearchPage sp=new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);


    }

    @Then("Kullanici title da {string} gormelidir")
    public void kullaniciTitleDaGormelidir(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));
    }
}
