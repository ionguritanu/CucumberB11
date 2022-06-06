package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class cars {
    @Test
    public void BMW() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        WebElement carsList = driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        Select car = new Select(carsList);
        car.selectByIndex(3);
        Thread.sleep(1000);

        WebElement carType = driver.findElement(By.xpath("//select[@id='makes']"));
        Select carT = new Select(carType);
        carT.selectByIndex(3);
        Thread.sleep(1000);

        WebElement models = driver.findElement(By.xpath("//select[@id='models']"));
        Select model = new Select(models);
        model.selectByIndex(3);
        Thread.sleep(1000);

        WebElement prices = driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        Select price = new Select(prices);
        price.selectByIndex(7);
        Thread.sleep(2000);

        WebElement distances = driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        Select distance = new Select(distances);
        distance.selectByIndex(4);
        Thread.sleep(1000);

        WebElement zips = driver.findElement(By.xpath("//input[@id='make-model-zip']"));
        zips.clear();
        zips.sendKeys("60004");

        Thread.sleep(1000);
        WebElement clickSubmit = driver.findElement(By.xpath("//button[@class='sds-button' and @type='submit' and @data-linkname='search-used-make']"));
        clickSubmit.click();


        WebElement header = driver.findElement(By.xpath("//h1[@class='sds-heading--1 sds-page-section__title']"));
        String actual = header.getText();
        String expeceted = "Used BMW 128 for sale";
        Assert.assertEquals(actual,expeceted);
        Thread.sleep(1000);

        List<WebElement> bmwList = driver.findElements(By.xpath("//h2"));
        for (WebElement myBmw : bmwList){
           //boolean contains = myBmw.getText().toLowerCase().contains("bmw");
            if(myBmw.getText().contains("BMW")){
                System.out.println("Passed");


            }
        }
    }
}
