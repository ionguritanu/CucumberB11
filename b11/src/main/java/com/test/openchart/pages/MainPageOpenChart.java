package com.test.openchart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.nio.charset.StandardCharsets;

public class MainPageOpenChart {
    public MainPageOpenChart(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[.='12K']")
    WebElement totalOrders;

    @FindBy(xpath = "//h2[.='11.8M']")
    WebElement totalSales;

    @FindBy(xpath = "//h2[.='144.8K']")
    WebElement customers;


    public void validateTheMainPageINfo(String orders, String sales, String customersMainPage){
        Assert.assertEquals(totalOrders.getText().trim(),orders);
        Assert.assertEquals(totalSales.getText().trim(),sales);
        Assert.assertEquals(customers.getText().trim(), customersMainPage);

    }
}
