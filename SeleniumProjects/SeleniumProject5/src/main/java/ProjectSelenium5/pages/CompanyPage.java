package ProjectSelenium5.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    public CompanyPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.='Company']")
    WebElement companyOption;

    @FindBy(xpath = "//*[@id='module_Company']/li/a/text()")
    WebElement staffDirectory;

    public void companyBtnValidation() throws InterruptedException {
        this.companyOption.click();
        Thread.sleep(1000);
        staffDirectory.click();
    }
}
