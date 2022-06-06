package com.test.etsy.pages;

import com.test.etsy.EtsyTestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class MainPageEtsy  {

    public MainPageEtsy(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='search_query']")
    WebElement searchBar;

//    @FindBy(xpath = "//button[@value='Search']")
//    WebElement searchButton;

    @FindBy(xpath = "//li//h3")
    List<WebElement> allHeaders;

    public void searchItem(String searchItem){
       searchBar.sendKeys(searchItem, Keys.ENTER);
       //searchButton.click();
    }
    public boolean validateHeader(){
        for(WebElement header: allHeaders){
            String headr = header.getText().trim().toLowerCase();
            if(headr.contains("iphone") || (headr.contains("13"))){
                return true;
            }
        }
       return false;

    }
}
