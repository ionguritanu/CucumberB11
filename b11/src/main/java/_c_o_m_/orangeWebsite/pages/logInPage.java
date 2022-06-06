package _c_o_m_.orangeWebsite.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
    public logInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='txtUsername']")
    WebElement userName;

    @FindBy (xpath = "//input[@name='txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement logInButton;

    @FindBy(id = "logInPanelHeading")
    WebElement loginHeading;

    @FindBy(xpath = "//span[@id='spanMessage']")
    WebElement errorMessage;

    @FindBy(xpath = "//*[.='Forgot your password?']")
    WebElement forgotPassword;

    //we are creating a methode to call
    public void logIn(String username, String password){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.logInButton.click();
    }

    public String getErrorMsg(){
        return errorMessage.getText();
    }

    public String getLoginHeading(){
        return loginHeading.getText();
    }

    public String  getForgotPasswordMsg(){
        return forgotPassword.getText();
    }
}
