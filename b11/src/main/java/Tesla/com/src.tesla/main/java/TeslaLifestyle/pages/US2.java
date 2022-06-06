package Tesla.com.src.tesla.main.java.TeslaLifestyle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class US2 {
    public US2(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//*[@id=\"category--lifestyle--giftcards\"]/ul/li/div[2]/div/a")
    WebElement TeslaShopGiftCardButoom;
    @FindBy(xpath = "//p[contains(text(),'$10 - $500')]")
    WebElement TeslaShopGiftCardAmount;

    public String  ValidateText(){
        return TeslaShopGiftCardButoom.getText();
    }
    public String ValidateAmount(){
        return TeslaShopGiftCardAmount.getText();
    }
    public String ValidateColour(){
      return  TeslaShopGiftCardAmount.getCssValue("color");

    }


}
