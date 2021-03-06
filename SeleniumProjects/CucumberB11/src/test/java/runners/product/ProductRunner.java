package runners.product;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.products", //this is path for feature file
        glue = "stepdefinitions/productsteps",     // this is step for step definitions
        dryRun = false,                           //for snips
        tags = "@smoke",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)


public class ProductRunner {
}
