package stepdefinitions.weborderstep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.weborderpages.LoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginPageSteps {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);


    @Given("the user navigate to the WebOrder website")
    public void the_user_navigate_to_the_web_order_website() {
        driver.navigate().to(ConfigReader.readProperty("weborderurl"));

    }
    @When("the user provide credentials")
    public void the_user_provide_credentials() {
    loginPage.login(ConfigReader.readProperty("weborderusername"), ConfigReader.readProperty("weborderpassword"));

    }
    @Then("the user is on the homepage")
    public void the_user_is_on_the_homepage() {
        Assert.assertEquals(driver.getTitle(), "ORDER DETAILS - Weborder");

    }

    @When("the user provide correct username and wrong password")
    public void the_user_provide_correct_username_and_wrong_password() {
       loginPage.login(ConfigReader.readProperty("weborderusername"), "wrongpassword");


    }
    @Then("the user validates the {string} error message")
    public void the_user_validates_the_error_message(String expectedMessage) {
    Assert.assertTrue(loginPage.validateErrorMessage(expectedMessage));
      }


//    @When("the user provide wrong username and  password")                              //hardcoding
//    public void the_user_provide_wrong_username_and_password() {
//        loginPage.login("ion", "gur");
//    }

    @When("the user provide wrong username {string} and  password {string}")              //professional
    public void the_user_provide_wrong_username_and_password(String username, String password) {
     loginPage.login(username, password);

    }

    @When("the user provide empty username end empty password")
    public void the_user_provide_empty_username_end_empty_password() {
       loginPage.login("", "");
    }



}
