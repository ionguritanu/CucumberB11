package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println(driver.getCurrentUrl());
        String actualURL = driver.getCurrentUrl();
        String expected = "https://www.facebook.com/";
        if(actualURL.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        WebElement logIn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
         logIn.click();
         Thread.sleep(1000);
         WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
         firstName.sendKeys("Ion");
         WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
         lastName.sendKeys("Guritanu");
         WebElement phone = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']"));
         phone.sendKeys("8476604338");
         WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
         password.sendKeys("ionguritanu@yahoo.com");
         WebElement month = driver.findElement(By.id("month"));
         month.sendKeys("Feb");
         WebElement day = driver.findElement(By.name("birthday_day"));
         day.sendKeys("8");
         WebElement year = driver.findElement(By.name("birthday_year"));
         year.sendKeys("1990");
         WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
         gender.click();
         WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
         submit.click();




    }
}