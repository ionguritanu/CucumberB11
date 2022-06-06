package Homework_.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Ion Guritanu");

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("ionguritanu@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("2200 E Devon Ave Suite 385, Des Plaines, IL 60018");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.sendKeys("1984 N Silver Lake Rd. Arlington Heights, IL 60004");


        WebElement button= driver.findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
        Thread.sleep(1000);
        button.click();
//validation
        WebElement actualName = driver.findElement(By.xpath("//p[@id='name']"));
        String actualNameValidation = actualName.getText();
        System.out.println(actualNameValidation);
        String expectedNameValidation = "Name:Ion Guritanu";
        if(actualNameValidation.equals(expectedNameValidation)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        Thread.sleep(3000);

//        String emailValidation = driver.findElement(By.xpath("//p[@id='email']")).getText();
//        System.out.println(emailValidation);
        WebElement actualEmail = driver.findElement(By.xpath("//p[@id='email']"));
        String actualEmailValidation = actualEmail.getText();
        String expectedEmailValidation = "Email:ionguritanu@gmail.com";
        System.out.println(actualEmailValidation);
        if(actualEmailValidation.equals(expectedEmailValidation)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        WebElement actualCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        String actualCurrentAddressValidation = actualCurrentAddress.getText();
        System.out.println(actualCurrentAddressValidation);
        String expectedCurrentAddress ="Current Address :2200 E Devon Ave Suite 385, Des Plaines, IL 60018";
        if(actualCurrentAddressValidation.equals(expectedCurrentAddress)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        WebElement actualPermanentAddress1 = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        String actualPermanentAddressValidation = actualPermanentAddress1.getText();
        System.out.println(actualPermanentAddressValidation);
        String expectedPermanentAddress = "Permananet Address :1984 N Silver Lake Rd. Arlington Heights, IL 60004";
        if(actualPermanentAddressValidation.equals(expectedPermanentAddress)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
