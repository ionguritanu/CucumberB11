package Homework_.Homework2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class case5 {
    @Test
    public void case5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        WebElement options = driver.findElement(By.xpath("//div[@id='withOptGroup']"));
        options.click();
        Thread.sleep(1000);
        WebElement group2option1 = driver.findElement(By.xpath("//div[contains(text(), 'Group 2, option 1')]"));
        group2option1.click();
    }
}
