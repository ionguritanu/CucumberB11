package _c_o_m_.orangeWebsite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

 public class testBase_orangeWeb {
    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver  =new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println("I'm running before methode");
    }

    @AfterMethod
        public void done(){
        System.out.println("Running after methode");
        driver.quit();
        }
    }
