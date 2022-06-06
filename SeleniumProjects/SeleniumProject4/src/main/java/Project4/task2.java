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

public class task2 {
    /*
    Navigate to the "http://uitestpractice.com/Students/Index"
Search any Lastname in search bar
Click Edit button
Change first name
Click save button
Search with new lastname
Validate Firstname is changed
Steps
     */
    @Test
    public void test2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        //Alert code
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        opt.addArguments("disable-infobars");
        // driver.get("http://uitestpractice.com/Students/Index");
        //WebElement createNew=driver.findElement(By.xpath("//a[.='Create New']"));
        //driver.navigate().to(createNew.getAttribute("href"));
        WebElement searchBar = driver.findElement(By.id("Search_Data"));
        searchBar.sendKeys("Patil");
        WebElement findSubmit = driver.findElement(By.xpath("//input[@value='Find']"));
        findSubmit.click();
        Thread.sleep(1000);
        WebElement editButton = driver.findElement(By.xpath("//tr[2]//button[1]"));
        editButton.click();
        WebElement firstNameBar = driver.findElement(By.xpath("//div[@class='form-group']//input[@name='FirstName']"));
        firstNameBar.clear();
        firstNameBar.sendKeys("AaBb");
        WebElement saveButton = driver.findElement(By.xpath("//input[@type='submit']"));
        saveButton.click();
        Thread.sleep(2000);
        WebElement searchBar1 = driver.findElement(By.id("Search_Data"));
        searchBar1.sendKeys("Patil");
        WebElement findSubmit1 = driver.findElement(By.xpath("//input[@value='Find']"));
        findSubmit1.click();
        Thread.sleep(2000);
        WebElement nameValidation = driver.findElement(By.xpath("//table[@class='table']//tr[2]//td[1]"));
        String actualName = nameValidation.getText();
        String expectedName = "AaBb";
        Assert.assertEquals(actualName,expectedName);
    }
}