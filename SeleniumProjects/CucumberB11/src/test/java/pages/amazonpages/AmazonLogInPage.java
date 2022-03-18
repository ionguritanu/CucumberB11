package pages.amazonpages;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class AmazonLogInPage {

    public AmazonLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

@FindBy(id = "nav-link-accountList-nav-line-1")
    private WebElement helloButton;

    @FindBy(id = "createAccountSubmit")
    private WebElement createAmazonAccountButton;

    @FindBy(id = "ap_customer_name")
    private WebElement customerName;

    @FindBy(id = "ap_email")
    private WebElement email;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement passwordCheck;

    @FindBy(tagName = "h1")
    private WebElement header;

    public void setCreateAccount(){
        helloButton.click();
        createAmazonAccountButton.click();
    }

    public String getHeaderText(){
        return BrowserUtils.getTextMethode(header);
    }

    public void allInformation(String username, String email, String password, String passwordCheck){
        this.customerName.sendKeys(username);
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.passwordCheck.sendKeys(passwordCheck);


    }
}
