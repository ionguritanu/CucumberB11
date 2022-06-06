package com.test.sentrifugo.tests;

import com.test.sentrifugo.pages.LogInPageSentrifugo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTestSentrifugo {
//    @Test
//    public void ValidateSuperAdmin(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.sentrifugo.com/index.php/");
//        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
//        userName.sendKeys("EM01");
//        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//        password.sendKeys("sentrifugo");
//        WebElement logInButton = driver.findElement(By.id("loginsubmit"));
//        logInButton.submit();
//    }


        /* String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://demo.sentrifugo.com/index.php/index/welcome";
        Assert.assertEquals(actualUrl,expectedUrl);
        */


    @Test
    public void ValidateSuperAdmin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.sentrifugo.com/index.php/");
        LogInPageSentrifugo logInPage = new LogInPageSentrifugo(driver);
        logInPage.dynamicLogIn("EM01","sentrifugo");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://demo.sentrifugo.com/index.php/index/welcome";
        Assert.assertEquals(actualUrl,expectedUrl);
    }


    @Test
    public void ValidateManagement(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.sentrifugo.com/index.php/");
        LogInPageSentrifugo logInPage = new LogInPageSentrifugo(driver);
        logInPage.dynamicLogIn("EM02","sentrifugo");
        String actualTitle= driver.getTitle();
        String expectedTitle = "Sentrifugo - Open Source HRMS";
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
