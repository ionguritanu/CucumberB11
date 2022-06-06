package Homework_.Homework5_Selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class MainPageAudi {
    public MainPageAudi(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@class='nm-model-band-stripe-item nm-model-band-stripe-types-item0']")
    WebElement suvAndWagons;

    @FindBy(xpath = "//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")
    WebElement cookiesCloseButton;

    @FindBy(xpath = "//*[@id=\"nm-id-content\"]/div/div[2]/audi-model-band/div[3]/ul[2]/li[1]/div/ul/li[4]/div/a/picture/img")
    WebElement audi2022Q5;



    public void validation() throws InterruptedException {
        cookiesCloseButton.click();
        suvAndWagons.click();
        Thread.sleep(2000);
        audi2022Q5.click();
    }


     //I need to do the remaining 45tfs and 55tfs validation
}
