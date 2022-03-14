package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "ConfirmAddressID")
    private WebElement deliveryOptions;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    private WebElement groupOrderBox;

    @FindBy(xpath = "//div[@id='addressPreview']")
    private WebElement officeAddress;

    @FindBy(xpath = "//button[@type='submit']")
    private  WebElement nextButton;



    public void getDeliveryOption(String option){
        BrowserUtils.selectBy(deliveryOptions,option, "text");
    }
    public void clickGroupOrder(){
        groupOrderBox.click();
    }
    public void clickNextButton(){
        nextButton.click();
    }

}
