package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

// raporlari olustururken format:path seklinde raporun nerede ve hangi formatta olusturacagimizi belirtiriz
@CucumberOptions(
        features = {"src/test/resources/features/07_Hook.feature"},
        glue = {"stepdefinitions", "hooks"},
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber-json.json",
                "junit:target/cucumber-xml.xml",
                "pretty"
        }


)
public class ReportRunner {


}



