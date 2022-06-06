package com.test.etsy;

import Utils.ConfigReader;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EtsyTestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = DriverHelper.getDriver();
        //driver.get(ConfigReader.readProperty("etsyUrl"));
        driver.get("https://www.etsy.com/");
   }

    @AfterMethod
    public void tearDown(){
        System.out.println("I am running after each test annotation");
        // driver.quit();
    }
}
