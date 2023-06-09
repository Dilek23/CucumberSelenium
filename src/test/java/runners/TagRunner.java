package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags ="@smoke",
        dryRun = false  // dryRun=true; Testleri browser olmadan çalıştırırken
        // eksik herhangi bir JAVA kodu olup olmadığını kontrol etme.

)


public class TagRunner {

}
