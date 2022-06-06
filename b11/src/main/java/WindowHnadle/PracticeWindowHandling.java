package WindowHnadle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeWindowHandling {
    //Task
    /*

     */

    @Test
    public void MultipleWindows() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        WebElement multipleTabs = driver.findElement(By.xpath("//*[@id='newTabsWindowsBtn']"));
        multipleTabs.click();
        BrowserUtils.switchByTitle(driver, "Basic Controls ");
        WebElement header = driver.findElement(By.xpath("//h1[@class='post-title entry-title']"));
        String actualHeader = header.getText();
        String expectedHeader = "Basic Controls";
        Assert.assertEquals(actualHeader, expectedHeader);
      WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='Enter First Name']"));
      firstName.sendKeys("Ion");
      WebElement lastNsame = driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']"));
      lastNsame.sendKeys("Guritanu");
      WebElement gender = driver.findElement(By.xpath("//input[@id='malerb']"));
      gender.click();
      WebElement language = driver.findElement(By.xpath("//input[@id='englishchbx']"));
      language.click();
      WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
      email.sendKeys("iong@gmail.com");
      WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
      password.sendKeys("123456");
      WebElement register = driver.findElement(By.xpath("//button[@id='registerbtn']"));
      register.click();
      Thread.sleep(2000);
      WebElement msg = driver.findElement(By.xpath("//label[@id='msg']"));
      String actualmsg = msg.getText();
      String expectedmsg = "Registration is Successful";
      Assert.assertEquals(actualmsg,expectedmsg);
      BrowserUtils.switchByTitle(driver, "AlertsDemo");
      driver.quit();
    }
}