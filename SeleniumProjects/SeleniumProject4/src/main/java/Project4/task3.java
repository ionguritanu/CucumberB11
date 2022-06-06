package Project4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class task3 {
    /*
    Navigate to the "http://uitestpractice.com/Students/Index"
Search any Lastname in search bar
Click delete button
Confirm delete function
Search with same lastname
Validate "There are zero students with this search text Page 0 of 0" after deleting the user
     */
    @Test
    public void task3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        //Alert code
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        opt.addArguments("disable-infobars");
        Thread.sleep(1000);
        WebElement searchBar = driver.findElement(By.id("Search_Data"));
        searchBar.sendKeys("Gore");
        WebElement findSubmit = driver.findElement(By.xpath("//input[@value='Find']"));
        findSubmit.click();
        Thread.sleep(1000);
        WebElement deleteElement = driver.findElement(By.xpath("//tbody//tr[2]//td[4]//button[3]"));
        deleteElement.click();
        Thread.sleep(1000);
        WebElement deleteConfirm = driver.findElement(By.xpath("//input[@type='submit']"));
        deleteConfirm.click();
        WebElement searchBar1 = driver.findElement(By.id("Search_Data"));
        searchBar1.sendKeys("Gore");
        WebElement findSubmit1 = driver.findElement(By.xpath("//input[@value='Find']"));
        findSubmit1.click();
        Thread.sleep(1000);
        WebElement msgValidation = driver.findElement(By.xpath("//form/div/following-sibling::text()"));
        String actualMsg = msgValidation.getText();
        String expectedMsg = "There are zero students with this search text Page 0 of 0";
        //System.out.println(actualMsg);
        Assert.assertEquals(actualMsg,expectedMsg);


    }
}
