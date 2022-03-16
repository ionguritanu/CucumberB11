package pages.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OpenMrsRegisterPage {

    public OpenMrsRegisterPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(name = "givenName")
    private WebElement givenName;

    @FindBy(name = "familyName")
    private WebElement familyName;

    @FindBy(id = "next-button")
    private WebElement nextButton;

    @FindBy(id = "gender-field")
    private WebElement selectGender;


    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    private WebElement day;

    @FindBy(xpath = "//select[@name=\"birthdateMonth\"]")
    private  WebElement month;

    @FindBy(xpath = "//input[@name=\"birthdateYear\"]")
    private WebElement year;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(name = "phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id ="relationship_type")
    private WebElement relationType;

    @FindBy(xpath = "//input[@placeholder='Person Name']")
    private WebElement relativeName;

    @FindBy(id = "submit")
    private WebElement submit;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    private WebElement givenNameValid;

    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    private  WebElement lastNameValid;



    public void sendNames(String name, String familyName) throws InterruptedException {
        this.givenName.sendKeys(name);
        this.familyName.sendKeys(familyName);
        Thread.sleep(3000);
        nextButton.click();


    }

    public void sendGender(String gender) throws InterruptedException {
        BrowserUtils.selectBy(selectGender,gender, "text");
        Thread.sleep(3000);
        nextButton.click();

    }

    public void sendBirthDate(String date, String month, String year) throws InterruptedException {
        this.day.clear();
        this.day.sendKeys(date);
        BrowserUtils.selectBy(this.month,  month, "text");
        this.year.clear();
        this.year.sendKeys(year);
        Thread.sleep(3000);
        nextButton.click();
    }

    public void sendAddress(String address) throws InterruptedException {
        this.address.sendKeys(address);
        Thread.sleep(3000);
        nextButton.click();
    }

    public void sendPhoneNumber(String phoneNumber) throws InterruptedException {
        this.phoneNumber.clear();
        this.phoneNumber.sendKeys(phoneNumber);
        Thread.sleep(3000);
        nextButton.click();
    }

    public void sendRelativeInfo(String relationType, String relativeName) throws InterruptedException {
        BrowserUtils.selectBy(this.relationType, relationType, "text");
        this.relativeName.sendKeys(relativeName);
        Thread.sleep(3000);
        nextButton.click();
    }

    public void clickConfirmButton() throws InterruptedException {
        Thread.sleep(3000);
        this.submit.click();

    }

    public String getGivenName(){
        return BrowserUtils.getTextMethode(givenNameValid);
    }

    public String getLastName(){
        return BrowserUtils.getTextMethode(lastNameValid);
    }
}


