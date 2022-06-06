package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class case2 {
    @Test
    public void case2() throws InterruptedException {
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
        WebElement priceLowHigh = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        priceLowHigh.click();
        Select optionLowHigh = new Select(priceLowHigh);
        optionLowHigh.selectByValue("lohi");
        List<WebElement> displayedListLowHigh = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
               Set<String> actualDisplayedListLowHigh = new LinkedHashSet<>(); // it accepts insertion order
        Set<String> expectedDisplayedListLowHigh = new TreeSet<>();                  //ascending order

        // List<String>  actualDisplayedListLowHigh= new ArrayList<>();
        // List<String> expectedDisplayedListLowHigh = new LinkedList<>();

        for(int i = 0; i<displayedListLowHigh.size(); i++){
            actualDisplayedListLowHigh.add(displayedListLowHigh.get(i).getText());

            expectedDisplayedListLowHigh.add(displayedListLowHigh.get(i).getText());

        }
        Assert.assertEquals(actualDisplayedListLowHigh,expectedDisplayedListLowHigh);
        System.out.println(actualDisplayedListLowHigh);
        System.out.println(expectedDisplayedListLowHigh);


        ///////////////////????????????????????????????????????????
    }
}
