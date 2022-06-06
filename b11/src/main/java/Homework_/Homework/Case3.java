package Homework_.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("Java");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Selenium");
        WebElement login = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        login.click();


        WebElement result = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String actualLogIn = result.getText();
        System.out.println(actualLogIn);
        String expected = "Epic sadface: Username and password do not match any user in this service";
        if(actualLogIn.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
