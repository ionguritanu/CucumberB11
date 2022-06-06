package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.est.LimitedSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;

public class EbaySearchStepDefs {
    WebDriver driver;
    @Given("User is on ebay home page")
    public void user_is_on_ebay_home_page() {
        WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://www.ebay.com/");

    }
    @When("User searches for iMac 2020")
    public void user_searches_for_i_mac() {
        WebElement searchBar = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        searchBar.sendKeys("iMac 2020", Keys.ENTER);
    }

    
    @Then("User sees result about iMac only")
    public void user_sees_result_about_i_mac_only() {
        List<WebElement> allTheHeaders = driver.findElements(By.xpath("//ul//a//h3[@class='s-item__title']"));
        for(WebElement header : allTheHeaders){
            System.out.println(header.getText().trim());
           // if (header.getText().trim().toLowerCase().contains("imac")){
                Assert.assertTrue(header.getText().trim().toLowerCase().contains("imac"));
            }
        }


    @Then("There are more than {int} pages of result")
    public void there_are_more_than_pages_of_result(Integer expectedPages) {
      List<WebElement> allPages = driver.findElements(By.xpath("//ol[@class='pagination__items']//li"));
      Assert.assertTrue(allPages.size()> expectedPages);

    }
}
