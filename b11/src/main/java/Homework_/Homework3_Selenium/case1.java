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

public class case1 {
    @Test
    public void case1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement ShiromiPicture = driver.findElement(By.xpath("//img[@alt='Shiromi']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ShiromiPicture).click().perform();
        Thread.sleep(1000);

        WebElement navigateNext = driver.findElement(By.xpath("//a[@id='navigate-next']"));
        actions.moveToElement(navigateNext).click().perform();
        Thread.sleep(1000);

        WebElement TekkaMaki = driver.findElement(By.xpath("//h1[.='Tekka maki']"));
        String actualTekkaMakiText = TekkaMaki.getText();
        String expectedTekkaMakiText = "Tekka maki";
        Assert.assertEquals(actualTekkaMakiText,expectedTekkaMakiText);
        Thread.sleep(1000);

        WebElement navigatePrev = driver.findElement(By.xpath("//a[@id='navigate-prev']"));
        actions.moveToElement(navigatePrev).click().perform();
        Thread.sleep(1000);

        WebElement Shiromi = driver.findElement(By.xpath("//h1[.='Shiromi']"));
        String actualShiromiText = Shiromi.getText();
        String expectedShiromiTezxt = "Shiromi";
        Assert.assertEquals(actualShiromiText,expectedShiromiTezxt);
        Thread.sleep(1000);

        WebElement zeroItems = driver.findElement(By.xpath("//span[.='0']"));
        Integer actualCartItems = Integer.parseInt(BrowserUtils.getTextMethode(zeroItems));
        Integer expectedCartItems = 0;
        Assert.assertEquals(actualCartItems,expectedCartItems);

        Thread.sleep(5000);
        driver.quit();
    }
}
