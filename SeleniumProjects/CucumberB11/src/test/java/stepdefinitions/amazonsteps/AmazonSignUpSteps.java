package stepdefinitions.amazonsteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.amazonpages.AmazonLogInPage;
import utils.DriverHelper;

import java.util.List;

public class AmazonSignUpSteps {

    WebDriver driver = DriverHelper.getDriver();
    AmazonLogInPage amazonLogInPage = new AmazonLogInPage(driver);


    @When("user clicks sign in and create you amazon account button")
    public void user_clicks_sign_in_and_create_you_amazon_account_button() {
      driver.navigate().to("https://www.amazon.com/");
      amazonLogInPage.setCreateAccount();

    }
    @Then("the user validate the header")
    public void the_user_validate_the_header(DataTable dataTable) {
        List<String> header = dataTable.asList();
        Assert.assertEquals(header.get(0),amazonLogInPage.getHeaderText());

    }
    @Then("the user providers the information")
    public void the_user_providers_the_information(io.cucumber.datatable.DataTable dataTable) {
        List<String> allInformationFromDataTable = dataTable.asList();
        amazonLogInPage.allInformation(allInformationFromDataTable.get(0),allInformationFromDataTable.get(1),allInformationFromDataTable.get(2),
                allInformationFromDataTable.get(3));




    }
}
