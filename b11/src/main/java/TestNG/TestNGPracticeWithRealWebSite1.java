package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestNGPracticeWithRealWebSite1 {


    @Test
    public void validateWebsite() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        String actualWebsite = driver.getCurrentUrl();
        String expectedWebsite = "https://demo.opencart.com/admin/";
        Assert.assertEquals(actualWebsite, expectedWebsite);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }

    @Test
    public void validateCatalogIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
        boolean actualCatalod = catalogBar.isDisplayed();
        boolean expectedCatalog = true;
        Assert.assertEquals(actualCatalod, expectedCatalog, " Catalog is not there");
        catalogBar.click();
    }

    @Test
    public void validateProductIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
        catalogBar.click();
        WebElement productBar = driver.findElement(By.xpath("//a[.='Products']"));
        boolean actualProductBar = productBar.isDisplayed();
        boolean expectedProductBar = true;
        Assert.assertEquals(actualProductBar, expectedProductBar);
        productBar.click();
    }

    @Test
    public void validationOfBaxes() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.opencart.com/admin/");
    driver.manage().window().maximize();
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();
    WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
    catalogBar.click();
    WebElement productBar = driver.findElement(By.xpath("//a[.='Products']"));
    productBar.click();
        List <WebElement> boxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i = 1; i<boxes.size();i++){
            Thread.sleep(500);
            boxes.get(i).click();
            boolean actualBoxValidation = boxes.get(i).isDisplayed();
            boolean expectedBoxValidation = true;
            Assert.assertEquals(actualBoxValidation,expectedBoxValidation);
            boolean actualBoxIsSelected = boxes.get(i).isSelected();
            boolean expectedBoxIsSelected = true;
            Assert.assertEquals(actualBoxIsSelected,expectedBoxIsSelected);
        }
    }
}