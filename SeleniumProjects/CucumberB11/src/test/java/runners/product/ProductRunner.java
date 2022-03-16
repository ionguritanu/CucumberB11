package runners.product;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.openmrs", //this is path for feature file
        glue = "stepdefinitions/openmrssteps",     // this is step for step definitions
        dryRun = true,                           //for snips
        tags = "@smoke"
)


public class ProductRunner {
}
