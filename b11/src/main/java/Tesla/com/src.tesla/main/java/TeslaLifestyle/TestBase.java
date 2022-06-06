package Tesla.com.src.tesla.main.java.TeslaLifestyle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    public WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tesla.com/");



    }
}
