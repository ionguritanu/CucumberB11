package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techtorialacademy.com/apply-now");

        WebElement firstName = driver.findElement(By.name("signup[signup_firstname]"));
        firstName.sendKeys("Ion");

        WebElement lastName = driver.findElement(By.name("signup[signup_lastname]"));
        lastName.sendKeys("Guritanu");

        WebElement midleName = driver.findElement(By.name("signup[signup_middlename]"));
        midleName.sendKeys("Sr.");


        WebElement emailAddrress = driver.findElement(By.name("signup[signup_email]"));
        emailAddrress.sendKeys("abc@email.com");

        WebElement phNumber = driver.findElement(By.name("signup[signup_telephone]"));
        phNumber.sendKeys("123456");





//        WebElement element = driver.findElement(By.linkText("Apply Now"));
//        element.click();


    }
}
