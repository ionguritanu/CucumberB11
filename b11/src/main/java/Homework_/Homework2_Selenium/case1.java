package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class case1 {
    @Test
    public void case1() throws InterruptedException {
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
        WebElement azList = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        azList.click();
        Select optionSelect = new Select(azList);
        optionSelect.selectByIndex(1);
        List<WebElement> itemsList = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        List<String> actualDescendingList = new LinkedList<>();
        List<String> expectedDescendingList = new ArrayList<>();
        for(int i = 0; i<itemsList.size();i++){
            actualDescendingList.add(itemsList.get(i).getText().trim());
            expectedDescendingList.add(itemsList.get(i).getText().trim());
        }
        Assert.assertEquals(actualDescendingList,expectedDescendingList);
        System.out.println(actualDescendingList);
        System.out.println(expectedDescendingList);
    }
}
