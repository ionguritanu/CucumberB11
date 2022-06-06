package Homework_.Homework3_Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case3 {
    @Test
    public void case3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        WebElement SalmonTeriyaki = driver.findElement(By.xpath("//img[@alt='Salmon Teriyaki']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(SalmonTeriyaki).click().perform();
        Thread.sleep(1000);
        WebElement addToCart1 = driver.findElement(By.xpath("//div[@id='details-total']/button"));
        actions.moveToElement(addToCart1).click().perform();
        Thread.sleep(1000);
        WebElement addToCart2 = driver.findElement(By.xpath("//div[@id='details-total']/button"));
        actions.moveToElement(addToCart2).click().perform();
        Thread.sleep(1000);

        WebElement totalPrice = driver.findElement(By.xpath("//p[.='$26.00']"));
        Double actualPrice = Double.parseDouble(BrowserUtils.getTextMethode(totalPrice).replace("$",""));
        Double expectedPrice = 26.00;
        Assert.assertEquals(actualPrice, expectedPrice);

        WebElement items = driver.findElement(By.xpath("//span[.='1']"));
        Integer actualItem = Integer.parseInt(BrowserUtils.getTextMethode(items));
        Integer expectedItem = 1;
        Assert.assertEquals(actualItem,expectedItem);

        WebElement nextButton = driver.findElement(By.xpath("//a[@id='navigate-next']"));
        actions.moveToElement(nextButton).click().perform();
        Thread.sleep(1000);

        WebElement addGohan = driver.findElement(By.xpath("//div[@id='details-total']//button"));
        actions.moveToElement(addGohan).click().perform();
        Thread.sleep(1000);


        WebElement shoppingCart = driver.findElement(By.xpath("//div[@id='shopping-cart']//p"));
        Double actualShoppingCart = Double.parseDouble(BrowserUtils.getTextMethode(shoppingCart).replace("$",""));
        Double expectedShoppingCart = 29.00;
        Assert.assertEquals(actualShoppingCart,expectedShoppingCart);

        WebElement validatingItems = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
        Integer actualItems = Integer.parseInt(BrowserUtils.getTextMethode(validatingItems));
        Integer expectedItems = 2;
        Assert.assertEquals(actualItems,expectedItems);

        Thread.sleep(6000);
        driver.quit();


    }
}
