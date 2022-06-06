package TestNG.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
    @Test
    public void firstName(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
        email.sendKeys("IOn");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("2385492");
        WebElement logIn = driver.findElement(By.xpath("//button [@value='1']"));
        logIn.click();
    }
}
