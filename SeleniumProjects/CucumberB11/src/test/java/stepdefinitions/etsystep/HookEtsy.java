package stepdefinitions.etsystep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.it.Data;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverHelper;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HookEtsy {
    WebDriver driver = DriverHelper.getDriver();

    @Before  //from io.cucumber
    public void beforeScenario() {
        System.out.println("It runs before each scenario");
    }


    @After  //from io.cucumber
    public void afterScenario(Scenario scenario) {
        Date currentDate = new Date();
        String screenshotfileName = currentDate.toString().replace(" ", "-")
                .replace(":", "-");//3-13-2022
        if (scenario.isFailed()) {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(new File("src/test/java/screenshot/" + screenshotfileName) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        DriverHelper.tearDown();


//       Date currentDate = new Date();
//       String screenshotFileName=  currentDate.toString().replace(" ", "-")
//               .replace(":", "-");
//       if(scenario.isFailed()){
//           File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//           FileUtils.copyFile(screenshotFile, new File("src/test/java/screenshot/"+ screenshotFileName)+".png"));
//       }
//
//
//    }
    }
}