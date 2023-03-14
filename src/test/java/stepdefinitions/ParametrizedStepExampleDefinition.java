package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ParametrizedStepExampleDefinition {
    private int int1,int2,sonuc;
    @Given("Ilk sayi {int}")
    public void ılkSayi(int sayi) {

        int1=sayi;
    }

    @Given("Ikınci sayi {int}")
    public void ıkınciSayi(int sayi) {

        int2=sayi;
    }

    @When("Bu sayilari {word} opeartörüne sokarsam")
    public void buSayilariOpeartörüneSokarsam(String operator) {
        switch (operator){
            case "+":
                sonuc=int1+int2;
                break;
            case "-":
                sonuc=int1-int2;
                break;
            case "*":
                sonuc=int1*int2;
                break;
            case "/":
                sonuc=int1/int2;
                break;

        }

    }

    @Then("sonuc {int} olmalidir")
    public void sonucOlmalidir(int sayi ) {
        Assert.assertEquals(sayi,sonuc);

    }
}
