package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class AlertTest {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://sweetalert.js.org/");
        WebElement firstBox = driver.findElement(By.xpath("//h5[contains(text(),'Normal alert')]//../button"));
        firstBox.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Oops, something went wrong!");
        alert.accept();
    }


    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://sweetalert.js.org/");
        WebElement secondBox = driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
        secondBox.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //Assert.assertEquals(alert.getText(),"Something went wrong!");
        //WebElement ok = driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']"));

    }
    @Test
    public void htmlAlert() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("https://sweetalert.js.org/");
            WebElement secondBox = driver.findElement(By.xpath("//button[contains(@onclick,'swal')]"));
            secondBox.click();
            Thread.sleep(2000);
            WebElement msg = driver.findElement(By.xpath("//div[.='Something went wrong!']"));
            Assert.assertEquals(msg.getText(),"Something went wrong!");
            WebElement okButton = driver.findElement(By.xpath("//button[.='OK']"));
            okButton.click();
    }

}