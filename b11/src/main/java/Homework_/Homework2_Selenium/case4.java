package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v95.network.model.WebTransportCreated;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case4 {
    @Test
    public void case4 () throws InterruptedException {
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
        WebElement priceHighLow = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
        priceHighLow.click();
        Thread.sleep(1000);
        Select HighToLow = new Select(priceHighLow);
        HighToLow.selectByIndex(3);
        WebElement firstHighProduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        firstHighProduct.click();
        Thread.sleep(1000);
        WebElement secondHighProduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        secondHighProduct.click();
        Thread.sleep(1000);
        WebElement chartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        chartButton.click();
        Thread.sleep(1000);
        WebElement checkOutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkOutButton.click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Mike");
        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("L");
        WebElement zipcode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipcode.sendKeys("60000");
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        String currentUrl = driver.getCurrentUrl();
//        System.out.println(currentUrl);
//        String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
//        if(currentUrl.contains("checkout")){
        boolean actUrl = currentUrl.contains("checkout");
        boolean expectetd = true;
        Assert.assertEquals(actUrl,expectetd);


        WebElement itemTotalPrice = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String actualPrice = itemTotalPrice.getText();
        System.out.println(actualPrice);
        String expected = "Item total: $79.98";
        Assert.assertEquals(actualPrice,expected);

        WebElement total = driver.findElement(By.xpath("//div[@class='summary_total_label']"));
        String actualTotal1 = total.getText();
        System.out.println(actualTotal1);
        String expectedTotal1 = "Total: $86.38";
        Assert.assertEquals(actualTotal1,expectedTotal1);
        Thread.sleep(1000);

        WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
        finishButton.click();
        WebElement finalMsg = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        String actualMsg = finalMsg.getText();
        System.out.println(actualMsg);
        String expetedMsg = "THANK YOU FOR YOUR ORDER";
        Assert.assertEquals(actualMsg,expetedMsg);
        Thread.sleep(6000);
        driver.quit();


    }
}
