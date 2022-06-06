package Tesla.com.src.tesla.main.java.TeslaLifestyle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us3 {
    public Us3(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy (xpath = "//*[@id=\"category--lifestyle--lifestyle_best\"]/ul/li[2]/div[2]/div[1]/a[1]")
    WebElement WirelessPortable;
    @FindBy(xpath = "//*[@id=\"page--product-details\"]/main/div/div/section[1]/div[1]/div[6]/div/div[2]/section/div[6]/form/div[1]/div[1]")
    WebElement OutOfStockText;
    @FindBy(xpath = "//*[@id=\"page--product-details\"]/main/div/div/section[1]/div[1]/div[6]/div/div[2]/section/div[6]/form/div[1]/div[2]/a")
    WebElement EmailMeText;
    @FindBy (id = "stockNotificationInputFieldDesktop")
    WebElement EmailBox;
    @FindBy(xpath = "//*[@id=\"page--product-details\"]/main/div/div/section[1]/div[1]/div[6]/div/div[2]/section/div[6]/form/div[2]/input")
    WebElement NotifyMeButton;
    @FindBy(xpath = "//*[@id=\"page--product-details\"]/main/div/div/section[1]/div[1]/div[6]/div/div[2]/section/div[6]/form/div[3]/p")
    WebElement TextValidation;
    @FindBy(xpath = "//*[@id=\"page--product-details\"]/main/div/div/section[1]/div[1]/div[6]/div/div[2]/section/div[6]/form/div[2]/div/div[3]/p[2]")
    WebElement WrongEmailTextActual;

public void ClickOnItem()
{
    WirelessPortable.click();
}
public String ValidateOutOfStockText()
{
    return OutOfStockText.getText().trim();
}

public String EmailMeTextValidation()
{
    return EmailMeText.getText().trim();
}
public String ValidationEmailMeTextColor(){
    return  EmailMeText.getCssValue("color");
}
public void ClickEmailMeText(){
    EmailMeText.click();
}
public String TextConfirmationEmailPositive(String email) throws InterruptedException {
    EmailBox.sendKeys(email);
    Thread.sleep(1000);
    NotifyMeButton.click();
    Thread.sleep(1000);
    return TextValidation.getText();
}

public String TextConfirmationEmailNegative(String WRONGEMAIL){
    EmailBox.sendKeys(WRONGEMAIL);
    NotifyMeButton.click();
    return WrongEmailTextActual.getText().trim();
}




}
