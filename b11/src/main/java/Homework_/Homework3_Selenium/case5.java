package Homework_.Homework3_Selenium;

import TestNG.TestNGPracticeWithRealWebSite1;
import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class case5 {
    @Test
    public void case5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement addToCart1 = driver.findElement(By.xpath("//div/li[4]/button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addToCart1).click().perform();
        Thread.sleep(2000);
        WebElement addToCart2 = driver.findElement(By.xpath("//div/li[7]/button"));
        actions.moveToElement(addToCart2).click().perform();
        Thread.sleep(2000);
        WebElement addToCart3 = driver.findElement(By.xpath("//div/li[5]/button"));
        actions.moveToElement(addToCart3).click().perform();
        Thread.sleep(2000);
        WebElement removeLastItem = driver.findElement(By.xpath("//div[@tabindex='-1']//li[3]"));
        actions.moveToElement(removeLastItem).click().perform();
        Thread.sleep(2000);
        WebElement updatedCart = driver.findElement(By.xpath("//span[@data-bind='text: cart.contentsCount']"));
        Integer actualUpdatedCart = Integer.parseInt(BrowserUtils.getTextMethode(updatedCart));
        Integer expectedUpdateCard = 2;
        Assert.assertEquals(actualUpdatedCart,expectedUpdateCard);


        Thread.sleep(5000);
        driver.quit();

    }
}
