package Homework_.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        logInButton.click();
        Thread.sleep(1000);
        String curentUrl = driver.getCurrentUrl();
        System.out.println(curentUrl);
        String expected = "https://www.saucedemo.com/inventory.html";
        if (curentUrl.equals(expected)) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}