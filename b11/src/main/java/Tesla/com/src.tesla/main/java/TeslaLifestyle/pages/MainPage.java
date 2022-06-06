package Tesla.com.src.tesla.main.java.TeslaLifestyle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
@FindBy (xpath = "//*[@id=\"tds-site-header\"]/ol[2]/li[1]/a/span")
    WebElement shopbutton;
    @FindBy(xpath = "//a[contains(text(),'Lifestyle')]")
    WebElement lifestylebutton;

    public void LifeStyle() throws InterruptedException {
        shopbutton.click();
        Thread.sleep(1000);
        lifestylebutton.click();
    }



}
