package runners.amazon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.amazon", //this is path for feature file
        glue = "stepdefinitions/amazonsteps",          // this is step for step definitions
        dryRun = false,                                 //for snips
        tags = "@amazon",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)


public class AmazonRunner {
}
