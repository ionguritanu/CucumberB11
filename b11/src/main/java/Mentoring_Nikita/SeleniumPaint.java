package Mentoring_Nikita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class SeleniumPaint {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "cromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://kleki.com/");
        WebElement canvas = driver.findElement(By.xpath("//canvas"));
        Actions actions =  new Actions(driver);
        //actions.moveToElement(canvas).clickAndHold().moveByOffset(40,40).perform();
        //actions.release().perform();
        //actions.moveByOffset()

        actions.moveToElement(canvas).clickAndHold().moveByOffset(50,0).perform();
        Thread.sleep(2000);
        actions.moveToElement(canvas).clickAndHold().moveByOffset(0,50).perform();
        Thread.sleep(2000);
        actions.moveToElement(canvas).clickAndHold().moveByOffset(-50,0).perform();
        Thread.sleep(2000);
        actions.moveToElement(canvas).clickAndHold().moveByOffset(0,-50).perform();




        Thread.sleep(10000);
        driver.quit();

    }
}
