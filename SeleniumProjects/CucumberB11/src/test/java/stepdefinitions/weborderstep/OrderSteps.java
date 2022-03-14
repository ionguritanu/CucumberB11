package stepdefinitions.weborderstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.weborderpages.CreateGroupOrderPage;
import pages.weborderpages.LoginPage;
import pages.weborderpages.OrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderSteps {
     WebDriver driver = DriverHelper.getDriver();
     LoginPage loginPage = new LoginPage(driver);
     OrderPage orderPage = new OrderPage(driver);
     CreateGroupOrderPage createGroupOrderPage = new CreateGroupOrderPage(driver);

    @Given("the user is on weborder homepage")
    public void the_user_is_on_weborder_homepage() {
    driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    loginPage.login(ConfigReader.readProperty("weborderusername"), ConfigReader.readProperty("weborderpassword"));

    }
    @When("the user selects {string} options")
    public void the_user_selects_options(String deliveryOption) {
    orderPage.getDeliveryOption(deliveryOption);

    }
    @When("th user is on the groupOrderPage")
    public void th_user_is_on_the_group_order_page() {
        orderPage.clickGroupOrder();
        orderPage.clickNextButton();
        Assert.assertEquals(driver.getTitle(), "Create Group Order - Weborder");

    }
    @When("the user send invitees note {string}")
    public void the_user_send_invitees_note(String inviteNotes) {
     createGroupOrderPage.sendInviteNotes(inviteNotes);

    }
    @When("the user sends invite list {string} and {string}")
    public void the_user_sends_invite_list_and(String email1, String email2) {
     createGroupOrderPage.sendInviteList(email1+","+email2);

    }
    @Then("the user validates the {string} adress")
    public void the_user_validates_the_adress(String expectedAddress) {
      Assert.assertTrue(createGroupOrderPage.getOfficeAddress().contains(expectedAddress));

    }
    @Then("the user validates {string} text")
    public void the_user_validates_text(String expectedText) throws InterruptedException {
     createGroupOrderPage.clickCreateGroupButton();
     Assert.assertEquals(createGroupOrderPage.getHeaderText(),expectedText);

    }
    @Then("the user validates the total participants is {int}")
    public void the_user_validates_the_total_participants_is(Integer participantNumber) {
     Assert.assertEquals(createGroupOrderPage.getParticipantsNumber(), participantNumber);
    }
}
