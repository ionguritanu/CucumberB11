package IFrame;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iFrameTask {
    @Test
    public void task() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://skpatro.github.io/demo/iframes/");
            driver.manage().window().maximize();
            WebElement pavilion = driver.findElement(By.xpath("//a[@href='http://qavalidation.com/']"));
            pavilion.click();
            Thread.sleep(2000);
            BrowserUtils.switchByTitle( driver,"Home - qavalidation");
            WebElement selenium=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[.='Selenium']//.."));
            WebElement seleniumJava=driver.findElement(By.xpath("//ul[@id='primary-menu']//span[.='Selenium-Java']//.."));
            Actions actions = new Actions(driver);
            actions.moveToElement(selenium).click(seleniumJava).perform();
            WebElement header = driver.findElement(By.tagName("h1"));
            String actualHeader = header.getText();
            String expectedHeader = "Selenium-Java Tutorial – Basic to Advance";
            Assert.assertEquals(actualHeader,expectedHeader);
            BrowserUtils.switchByTitle(driver, "iframes"); //i am switching window
            driver.switchTo().frame("Frame1");        //i am switching driver
            WebElement iframe1 = driver.findElement(By.xpath("//a[.='Category1']"));
            iframe1.click();
            BrowserUtils.switchByTitle( driver,"qavalidation");
            Assert.assertTrue(driver.getTitle().endsWith("qavalidation"));
            BrowserUtils.switchByTitle(driver, "iframes"); //i am switching window
            driver.switchTo().frame("Frame2");        //i am switching driver
            WebElement iframe2 = driver.findElement(By.xpath("//a[.='Category3']"));
            iframe2.click();
            BrowserUtils.switchByTitle( driver,"SoftwareTesting Archives - qavalidation");
            Assert.assertTrue(driver.getCurrentUrl().equals("https://qavalidation.com/category/softwaretesting/"));

    }
}
