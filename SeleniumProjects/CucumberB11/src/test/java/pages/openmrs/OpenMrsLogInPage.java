package pages.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMrsLogInPage {

    public OpenMrsLogInPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(id = "Inpatient Ward")
    private WebElement impatientWard;

    @FindBy(xpath = "//input[@id='loginButton']")
    private WebElement logIn;


    public void logIn(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        impatientWard.click();
        logIn.click();


    }
}
