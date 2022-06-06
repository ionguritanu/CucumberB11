package Homework_.Homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
    public static void main(String[] args) throws InterruptedException {


        /**
        Question: After creating my acct ,I can't retest once again. The msg appears that it says
        "The specified email already exists".
        Is this ok or not?
        Do we have to input new email every time when we want to retest our code?
         */
        /*
        TASK 2:Creating an account for nopcommerce and validation
        1-NAVIGATE TO THE WEBSITE https://demo.nopcommerce.com/
        2-Click Register
        3-Fill the information
        4-Newsletter box should be left unclicked
        5-Click Register
        6-Validate “Your registration completed”
        7-Click Continue
         */
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        String expectedUrl = "https://demo.nopcommerce.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        WebElement register = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
        register.click();
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-male']"));
        gender.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Ion");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Gur");
        WebElement dayDOB = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dayDOB.sendKeys("1");
        WebElement monthDOB = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        monthDOB.sendKeys("Feb");
        WebElement yearDOB = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        yearDOB.sendKeys("2000");
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("ionguri@yahoo.com");
        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Techtorial");
        WebElement checkBox = driver.findElement(By.xpath("//input[@value='true']"));
        System.out.println(checkBox.isDisplayed());
        System.out.println(checkBox.isSelected());
        if(checkBox.getAttribute("data-val").equals("true")){
            checkBox.click();
        }
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("123456");
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("123456");
        WebElement registerAcct = driver.findElement(By.xpath("//button[@name='register-button']"));
        registerAcct.click();
        WebElement result = driver.findElement(By.xpath("//div[@class='result']"));
        String actualResult = result.getText();
        System.out.println(actualResult);
        String  expectedResult = "Your registration completed";
        if(actualResult.equals(expectedResult)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
        }
        WebElement continueButton = driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']"));
        continueButton.click();
        Thread.sleep(10000);
        WebElement logOutButton = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        logOutButton.click();
    }



}
