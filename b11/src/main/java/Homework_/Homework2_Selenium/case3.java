package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;
import java.util.List;

public class case3 {
    @Test
    public void case3() throws InterruptedException {
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
        Thread.sleep(1000);
        WebElement priceLowHigh = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        priceLowHigh.click();
        Thread.sleep(1000);
        Select optionLowHigh = new Select(priceLowHigh);
        optionLowHigh.selectByValue("lohi");
        WebElement firstLowestProduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        firstLowestProduct.click();
        Thread.sleep(1000);
        WebElement secondLowestPrice = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        secondLowestPrice.click();
        Thread.sleep(1000);
        WebElement chart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        chart.click();
        Thread.sleep(1000);
        List<WebElement> myChartItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement myItem : myChartItems) {
            if (myItem.getText().contains("Sauce Labs Onesie") && myItem.getText().contains("Sauce Labs Bike Light")) {
                System.out.println("Passed");
            }
        }
    }
}
        //WebElement checkFirstItem = driver.findElement(By.xpath("//*[@id=item_2_title_link]/div"));
//        String actulaFirstItem = checkFirstItem.getText();
//        System.out.println(actulaFirstItem);
        //String expectedFirstItem = "";
        //boolean expectedFirstItem = true;
        //Assert.assertEquals(actulaFirstItem, true);

