package Homework_.Homework5_Selenium.pages;

import Homework_.Homework5_Selenium.TestBaseAudi;
import Utils.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.Key;

public class Page2021AudiQ5  extends TestBaseAudi{
    public Page2021AudiQ5(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class=\"HeadlineContainer--ykgbzn faoXzd\"]")
    WebElement headerMatching;

    @FindBy(xpath = "//div[@class=\"ButtonContainer--wyeeej dtCCnn\"]//span[.='Build']")
    WebElement buildButton;

    @FindBy(xpath = "//div//span[2][contains(text(),'$ 43,300')]")
    WebElement startingPrice;

    @FindBy(xpath = "//div[@class=\"nm-module-trimline-engine-headline-wrapper\"]//div[.='Premium']")
    WebElement premium;

    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-headline-wrapper']//div[.='Premium Plus']")
    WebElement premiumPLus;

    @FindBy(xpath = "//div[@class='nm-module-trimline-engine-headline-wrapper']//div[.='Prestige']")
    WebElement prestige;

    @FindBy(xpath = "//div[@class='audi-copy-m nm-module-trimline-engine-headline-sub']//span[.='$ 43,300']")
    WebElement premiumStartingPrice;
    @FindBy(xpath = "//div[@class='audi-copy-m nm-module-trimline-engine-headline-sub']//span[.='$ 48,300']")
    WebElement premiumPlusStartingPrice;
    @FindBy(xpath = "//div[@class='audi-copy-m nm-module-trimline-engine-headline-sub']//span[.='$ 54,000']")
    WebElement prestigeStartingPrice;

    //testCase2

//    @FindBy(xpath = "//html/body/div[1]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div[2]/ul/li[1]/span/span")
//     WebElement select40TFSI;
    @FindBy(xpath = "//*[@id=\"dbad:audi:basket\"]/div//div/button/span")
    WebElement viewKeyMsrp;
    @FindBy(xpath = "//div[@class=\"audi-basket-configuration-value audi-basket-price-details__price-value\"]//span[2]//span[.='$ 43,300']")
    WebElement validateMsrp;
    @FindBy(xpath = "//div[@class=\"audi-basket-configuration-value audi-basket-price-details__price-value\"]//span[2]//span[.='$ 595']")
    WebElement additionalOptions;
    @FindBy(xpath = "//div[@class=\"audi-basket-configuration-value audi-basket-price-details__price-value\"]//span[2]//span[.='$ 1,195']")
    WebElement destinationCharge;
    @FindBy(xpath = "//*[@id=\"dbad:audi:basket\"]/div/div/div/div[2]/div[2]/div[2]/div[1]/button")
    WebElement closeButton;


    //testCase3
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[4]/div[2]/div/audi-configurator-tile-list[1]/div/div/ul/li[4]/div/div[1]/div")
    //@FindBy(xpath = "//div[@data-render-view=\"extcolors\"]//li[4]")
    WebElement districtGreen;



    //testCase1

    public boolean validationHeader(){
        return headerMatching.getText().trim().equals("2022 Audi Q5");
    }
    public void buildCar(){
        buildButton.click();
    }
    public boolean validatingStartingPrice(){
        return startingPrice.getText().trim().replace("$","").equals("43,300");
    }
    public void validationThreeVersionOfTheCar(String premiumVersion, String premiumPLusVersion, String prestigeVersion) {
        Assert.assertEquals(premium.getText().trim(), premiumVersion);
        Assert.assertEquals(premiumPLus.getText().trim(),premiumPLusVersion);
        Assert.assertEquals(prestige.getText().trim(),prestigeVersion);
    }
    public void validationPriceOfThreeCars(String prem, String premPlus, String prest){
        Assert.assertEquals(premiumStartingPrice.getText().replace("$",""), prem);
        Assert.assertEquals(premiumPlusStartingPrice.getText().replace("$",""), premPlus);
        Assert.assertEquals(prestigeStartingPrice.getText().replace("$",""), prest);
    }

    //taskCase2
    public void premiumPLusValidation(String msr, String addOption, String destCharge) throws InterruptedException {
        //select40TFSI.click();
        //Thread.sleep(2000);
        viewKeyMsrp.click();
        validateMsrp.getText().replace("$", "").trim();
        additionalOptions.getText().replace("$", "").trim();
        destinationCharge.getText().replace("$", "").trim();
//        Double msrpPrice = Double.parseDouble(BrowserUtils.getTextMethode(validateMsrp).replace("$","").trim());
//        Double additionalOptionsPrice = Double.parseDouble(BrowserUtils.getTextMethode(additionalOptions).replace("$","").trim());
//        Double destinationChargePrice = Double.parseDouble(BrowserUtils.getTextMethode(destinationCharge).replace("$","").trim());
    }

    public void totalPrice() throws InterruptedException {
        validateMsrp.getText().replace("$", "").trim();
        additionalOptions.getText().replace("$", "").trim();
        destinationCharge.getText().replace("$", "").trim();
        Thread.sleep(2000);
        closeButton.click();
    }

    //testCase3
    //the driver has been extended to this pkg
    public void validationColor(){
//        Actions action = new Actions(driver);
//        action.moveToElement(districtGreen).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Actions actions = new Actions(driver);
        actions.moveToElement(districtGreen).click().perform();
        //districtGreen.click();

    }

}
