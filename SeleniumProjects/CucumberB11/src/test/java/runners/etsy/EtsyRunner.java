package runners.etsy;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.etsy",          //this is path for feature file
        glue = "stepdefinitions/etsystep",     // this is step for step definitions
        dryRun = false,
        tags = "@regressionoutline"
        // "@regression and @special and not @smoke"
)


public class EtsyRunner {
}
