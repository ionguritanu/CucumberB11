package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertIntro {

    @Test
    public void AlertAcceptMethode() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement jsAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlert.click();
//        WebElement text = driver.findElement(By.xpath("//h3[.='JavaScript Alerts']")); //UnhandledAlertException
//        System.out.println(text.getText());
        Alert alert = driver.switchTo().alert();
        String actualText = alert.getText();
        String expectedText = "I am a JS Alert";
        Assert.assertEquals(actualText, expectedText);
        alert.accept();
        WebElement mesage = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String actualMSG = mesage.getText();
        String expectdeMSG = "You successfully clicked an alert";
        Assert.assertEquals(actualMSG, expectdeMSG);
    }

    @Test
    public void AlertDismissMethode() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement jsDismiss = driver.findElement(By.xpath(" //button[@onclick=\"jsConfirm()\"]"));
        jsDismiss.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement mesage = driver.findElement(By.xpath("//p[@id=\"result\"]\n"));
        String actualMSG = mesage.getText();
        String expectdeMSG = "You clicked: Cancel";
        Assert.assertEquals(actualMSG, expectdeMSG);
      }

    @Test
    public void AlertSendKeyMethode() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement jsSendKey = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        jsSendKey.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Techtorial");
        alert.accept();
        WebElement mesage = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String actualMSG = mesage.getText();
        String expectdeMSG = "You entered: Techtorial";
        Assert.assertEquals(actualMSG, expectdeMSG);


       }
    }
