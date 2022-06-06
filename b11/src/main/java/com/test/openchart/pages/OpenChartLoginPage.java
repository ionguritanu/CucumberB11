package com.test.openchart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenChartLoginPage {

    public OpenChartLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement logInBtn;

    public void login(String username, String password) {
            this.username.clear();
            this.username.sendKeys(username);
            this.password.clear();
            this.password.sendKeys(password);
            this.logInBtn.click();

   }
}