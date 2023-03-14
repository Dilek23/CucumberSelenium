package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class firstStepDefinition {


    @Given("Ilk feature için cucumber indirdim")
    public void ılk_feature_için_cucumber_indirdim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Given stepi calisti");
    }
    @When("Senaryomu calistirdigimda")
    public void senaryomu_calistirdigimda() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When stepi calisti");
    }
    @Then("Senaryomun  calistigini konsolda görmeliyim")
    public void senaryomun_calistigini_konsolda_görmeliyim() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then stepi calisti");
    }

}
