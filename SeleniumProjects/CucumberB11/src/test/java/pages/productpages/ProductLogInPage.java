package pages.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLogInPage {
    public ProductLogInPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


        @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
        private WebElement username;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement logInBtn;

    public void logIn (String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.logInBtn.click();
    }
}
