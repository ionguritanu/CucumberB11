package stepdefinitions.productsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.productpages.ProductLogInPage;
import pages.productpages.ProductMainPage;
import pages.productpages.ProductOrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class ProductOrderSteps {

    WebDriver driver = DriverHelper.getDriver();
    ProductLogInPage productLogInPage = new ProductLogInPage(driver);
    ProductMainPage productMainPage = new ProductMainPage(driver);
    ProductOrderPage productOrderPage = new ProductOrderPage(driver);


    @Given("The user navigates to product website homepage and click  orderButton")
    public void the_user_navigates_to_product_website_homepage_and_click_order_button() {
    productLogInPage.logIn(ConfigReader.readProperty("productusername"), ConfigReader.readProperty("productpassword"));
    productMainPage.clickOrderButton();

    }
    @When("The user enters the product information {string} and {string}")
    public void the_user_enters_the_product_information_and(String productName, String quantity) {
     productOrderPage.sendProductInfo(productName, quantity);


    }
    @When("The user enters the address information {string}, {string}, {string}, {string},{string}")
    public void the_user_enters_the_address_information(String customerName, String street, String city, String state, String zipcode) {
     productOrderPage.sendAddressInformation(customerName, street, city, state, zipcode);


    }
    @When("The user enters the card information {string}, {string}, {string}")
    public void the_user_enters_the_card_information(String cardType, String cardNumber, String expireDate) throws InterruptedException {
    productOrderPage.selectCard(cardType);
    productOrderPage.sendPaymentInformation(cardNumber,expireDate);
    Thread.sleep(Long.parseLong("1000"));


    }
    @Then("The user validates success message")
    public void the_user_validates_success_message() {
    productOrderPage.clickProcessButton();
    Assert.assertEquals( "New order has been successfully added.", productOrderPage.getSuccessMessage());


    }
    @Then("The user validates product details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_user_validates_product_details(String customerName, String productName, String quantity, String street, String city, String state, String zipcode, String cardType, String cardNumber, String expirationDate) {
     productMainPage.clickViewAllOrder();
     productOrderPage.getInfo(customerName,productName,quantity,street,city,state,zipcode,cardType,cardNumber,expirationDate);

    }



}
