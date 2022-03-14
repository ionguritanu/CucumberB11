package runners.weborder;

//Runner class is a way to ru all your feature files from here.
//To be able to run your code you have tok have @RunWith
//@RunWith comes from Junit and it executes the feature file steps
//CucumberOption is special annotation that has special key words:
  //features : this is location of feature file (this one should be content root )
  //--glue is location of step definitions      (this one should be source root and delete java. part to make it more general)
  //--dryRun: this is a way to get snips without executing the whole implementation
  //--it means if you make it true, you will get immediately unimplemented snips

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.weborder", //this is path for feature file
        glue = "stepdefinitions/weborderstep",     // this is step for step definitions
        dryRun = false,
        tags = "@smokeLoginTest"
        // "@regression and @special and not @smoke"
)


public class WebOrderRunner {

}
