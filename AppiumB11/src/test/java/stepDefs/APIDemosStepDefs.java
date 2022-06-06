package stepDefs;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CustomerAdapter;
import pages.ExpandableListPage;
import pages.HomePage;
import pages.ViewsPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class APIDemosStepDefs {

    AndroidDriver<AndroidElement> driver;

    @Given("I have APIDemos application launched")
    public void i_have_api_demos_application_launched() throws MalformedURLException {
        File apk = new File("src/test/resources/features/APIDemons.feature");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "techtorialPhone");
        //desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setPlatform(Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());

        URL serverUrl = new URL("http://localhost:4723/wd/hub");
        driver=new AndroidDriver<AndroidElement>(serverUrl, desiredCapabilities);


    }
    @When("I navigate to {string} page")
    public void i_navigate_to_view_expandable_list_custom_adapter_page(String path) {
        HomePage homePage = new HomePage(driver);
        homePage.viewsButton.click();

        ViewsPage viewsPage = new ViewsPage(driver);
        viewsPage.expendableList.click();

        ExpandableListPage expandableListPage = new ExpandableListPage(driver);


    }
    @When("I long press on Dog Names button for {int} seconds")
    public void i_long_press_on_dog_names_button_for_seconds(Integer int1) {
        TouchAction touchAction = new TouchAction(driver);

        CustomerAdapter customerAdapter = new CustomerAdapter(driver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                .withDuration(Duration.ofSeconds(3)).withElement(ElementOption.element(customerAdapter.))).perform();

    }


    @Then("new menu with Sample menu option should pop up")
    public void new_menu_with_sample_menu_option_should_pop_up() {
        CustomerAdapter customerAdapter = new CustomerAdapter(driver);
        String actualText = customerAdapter.

    }


}
