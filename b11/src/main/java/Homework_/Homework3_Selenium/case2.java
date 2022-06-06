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

public class case2 {
    @Test
    public void case2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        WebElement addCartEdamame = driver.findElement(By.xpath("//li[4]//button[@class='add-to-cart']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addCartEdamame).click().perform();
        Thread.sleep(1000);

        WebElement cartItems = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
        Integer actualCartItems = Integer.parseInt(cartItems.getText());
        Integer expectedCartItems = 1;
        Assert.assertEquals(actualCartItems,expectedCartItems );
        Thread.sleep(1000);


        WebElement priceProduct = driver.findElement(By.xpath("//span[@data-bind='text: itemPrice']"));
        double actualPrice1 = Double.parseDouble(BrowserUtils.getTextMethode(priceProduct).replace("$",""));
        double expectedPrice1 = 4.00;
        Assert.assertEquals(actualPrice1,expectedPrice1);
        Thread.sleep(1000);

        WebElement emptyCart = driver.findElement(By.xpath("//a[@id='empty-cart']"));
        actions.moveToElement(emptyCart).click().perform();
        Thread.sleep(1000);

        WebElement zeroItems = driver.findElement(By.xpath("//span[.='0']"));
        Integer actualResultAfterRemovingCart = Integer.parseInt(zeroItems.getText());
        Integer expectedResultAfterRemovingCart = 0;
        Assert.assertEquals(actualResultAfterRemovingCart,expectedResultAfterRemovingCart);

        Thread.sleep(5000);
        driver.quit();
    }
}
