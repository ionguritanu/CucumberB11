package Homework_.Homework3_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class case4__ {
    @Test
    public void case4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/websushi#");
        driver.manage().window().maximize();
        List<WebElement> productsPrice = driver.findElements(By.xpath("//span[@class='price']"));
        List <WebElement> displayedPrices = new ArrayList<>();
        List<Double> doublePrices = new ArrayList<>();
        List<Double> expected = new ArrayList<>();

        for(int i = 0; i<productsPrice.size();i++){
            if(productsPrice.get(i).isDisplayed()){
                displayedPrices.add(productsPrice.get(i));
                doublePrices.add(Double.parseDouble(productsPrice.get(i).getText().trim().replace("$", "")));
            }
        }
        System.out.println(doublePrices);


        //2part
        for (int i = 0; i<doublePrices.size();i++){
            if (doublePrices.get(i)<9);
            expected.add(doublePrices.get(i));
        }
        System.out.println(expected);
        Assert.assertEquals(doublePrices,expected);

      }
 }

