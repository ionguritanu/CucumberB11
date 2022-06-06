package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class functionality_acceptance_Gherkin_Language {
    @Test
    public void FunctionalityAcceptance () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();
        Thread.sleep(2000);
        WebElement burgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerButton.click();
        Thread.sleep(2000);
//        WebElement burgerList = driver.findElement(By.xpath("//a[@class='bm-item menu-item']"));
//        Select burgerListSelectLogOut = new Select(burgerList);
//        burgerListSelectLogOut.selectByIndex(1);
        WebElement logOut = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        logOut.click();
        driver.navigate().back();
        //When user navigate back from logIn page
        //Then the user still should see logIN page

        //Assert by URL
        driver.getCurrentUrl();
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals(currentUrl,expectedUrl);

        //Assert by final msg
        WebElement aaa = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String result = aaa.getText();
        System.out.println(result);
        String expectedResult = "Epic sadface: You can only access '/inventory.html' when you are logged in.";
        Assert.assertEquals(result,expectedResult);

    }
}
