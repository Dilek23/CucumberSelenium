package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features/HomeWork02_Selenium.feature"},
        glue ="stepdefinitions"
)

public class Homework02Runner {

}
