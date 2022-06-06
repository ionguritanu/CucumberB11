package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverHelper {
    //private variable
    private static WebDriver driver;
    //private Constructor to make sure they do not create an object from this class
    private DriverHelper(){
    }

    public static WebDriver getDriver(){

        if(driver == null){    //I am checking driver is null or not
                               //if is null I'm creating a new one
            switch (ConfigReader.readProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();

                    break;
                case "firefox":
                    WebDriverManager.chromedriver().setup();
                    driver= new FirefoxDriver();
                    break;

                default:
                    driver= new ChromeDriver();
                    break;
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();                               // fresh start (testing)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //this implicity way will wait for the elements around 10 sec to run the pages


        }
        return driver;
    }
    public static void tearDown(){
        driver.quit();
        driver=null;
    }
}
