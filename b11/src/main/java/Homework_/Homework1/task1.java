package Homework_.Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
    public static void main(String[] args) {
        /*
        TASK: CREATING AN ACCOUNT FOR AMAZON:
        1-NAVIGATE TO THE WEBSITE https://www.amazon.com/
        2_Click Hello, Sign in Button
        3-Click Create your amazon account button
        4-Fill the information and click Continue Button
        5-If there is an error or message. Validate it, if not then you completed the task
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String expected = "https://www.amazon.com/";
        if(url.equals("https://www.amazon.com/")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        WebElement logInBotton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        logInBotton.click();
        WebElement createAcct = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        createAcct.click();
        WebElement yourName = driver.findElement(By.xpath("//input[@name='customerName']"));
        yourName.sendKeys("Ion G");
        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("ionguritanu@yahoo.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Techtorial22");
        WebElement passwordCheck = driver.findElement(By.xpath("//input[@name='passwordCheck']"));
        passwordCheck.sendKeys("Techtorial22");
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        WebElement puzzle = driver.findElement(By.xpath("//span[@class='a-size-large']"));
        String actualResult = puzzle.getText();
        System.out.println(actualResult);
        String expectedResult = "Solve this puzzle to protect your account";
        if(actualResult.equals(expectedResult)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
