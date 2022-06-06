package _c_o_m_.orangeWebsite.tests;

import _c_o_m_.orangeWebsite.pages.logInPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logInTests  {
    @Test
    public void validateLogInFunctionality(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        //driver.manage().window().maximize();
        logInPage LogInPageObject = new logInPage(driver);
//        LogInPageObject.logIn("Admin","admin1235");
//        String actualMsg =  LogInPageObject.getErrorMsg();
//        String expectedMsg = "Invalid credentials";
//        Assert.assertEquals(actualMsg, expectedMsg);
        String actualHeading = LogInPageObject.getLoginHeading();
        String expectedHeading = "LOGIN Panel";
        Assert.assertEquals(actualHeading,expectedHeading);
    }

    @Test
    public void validatingForgotPasswordText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        logInPage logInPage = new logInPage(driver);
        Assert.assertEquals(logInPage.getForgotPasswordMsg(),"Forgot your password?");
    }
}
