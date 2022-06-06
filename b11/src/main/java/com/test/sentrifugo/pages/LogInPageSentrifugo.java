package com.test.sentrifugo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageSentrifugo {
    public LogInPageSentrifugo(WebDriver driver){                   //this is constructor
        PageFactory.initElements(driver,this);
    }

//we are going to store our element locations and methods here
    @FindBy(xpath = "//input[@name='username']")
    WebElement userName;

    @FindBy(xpath = "//input[@id='password'")
    WebElement password;

    @FindBy(id="loginsubmit")
    WebElement logInButton;

//    public void logIn(){
//        userName.sendKeys("EM01");
//        password.sendKeys("sentrifugo");
//        logInButton.click();
//    }

    //DYNAMIC logIn
    public void dynamicLogIn(String username, String password){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.logInButton.submit();

    }
}
