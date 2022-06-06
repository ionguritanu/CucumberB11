package Homework_.Homework5_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseAudi {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.audiusa.com/us/web/en.html");
        driver.manage().window().maximize();
        System.out.println("i am running before every test annotation");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("I am running after each test annotation");
        //driver.quit();
    }
}
