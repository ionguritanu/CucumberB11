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

public class case6 {
    @Test
    public void case6() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement addShiromi = driver.findElement(By.xpath("//div//li[8]//button"));
        Actions actions =new Actions(driver);
        actions.moveToElement(addShiromi).click().perform();
        Thread.sleep(2000);
        WebElement addEbiRolls = driver.findElement(By.xpath("//div//li[14]//button"));
        actions.moveToElement(addEbiRolls).click().perform();
        Thread.sleep(2000);
        WebElement checkOutButton = driver.findElement(By.xpath("//a[@id='checkout']"));
        actions.moveToElement(checkOutButton).click().perform();
        Thread.sleep(2000);
        WebElement totalPrice1 = driver.findElement(By.xpath("//span[@data-bind='text: totalPrice']"));
        Double actualTotalPrice1 = Double.parseDouble(BrowserUtils.getTextMethode(totalPrice1).replace("$",""));
        Double expectedTotalPrice1 = 17.00;
        Assert.assertEquals(actualTotalPrice1,expectedTotalPrice1);
        Thread.sleep(1000);

        WebElement increaseEbiRoll = driver.findElement(By.xpath("//tr[2]/td[2]/span/span[2]/button[1]"));
        actions.moveToElement(increaseEbiRoll).click().perform();
        Thread.sleep(8000);



        WebElement finalTotal = driver.findElement(By.xpath("//span[@data-bind='text: totalPrice']"));
        finalTotal.click();
        Double actualFinal = Double.parseDouble(BrowserUtils.getTextMethode(finalTotal).replace("$",""));
        Double expectedFinal = 25.00;
        Assert.assertEquals(actualFinal, expectedFinal);
//
//        WebElement finalTotal = driver.findElement(By.xpath("//span[@data-bind='text: totalPrice']"));
//        actions.moveToElement(finalTotal).click().perform();
//        Thread.sleep(1000);
//        WebElement orderNow = driver.findElement(By.xpath("//button[@class='order-now']"));
//        actions.moveToElement(orderNow).click().perform();
//        Thread.sleep(2000);
//        WebElement emptyCardValidation = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
//        String actualCArd = emptyCardValidation.getText();
//        String expectedCard = "0";
//        Assert.assertEquals(actualCArd,expectedCard);
    }
}
