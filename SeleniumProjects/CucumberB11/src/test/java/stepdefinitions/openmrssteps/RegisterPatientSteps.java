package stepdefinitions.openmrssteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.openmrs.OpenMrsLogInPage;
import pages.openmrs.OpenMrsMainPage;
import pages.openmrs.OpenMrsRegisterPage;
import utils.DriverHelper;

import java.util.Map;

public class RegisterPatientSteps {
    WebDriver driver = DriverHelper.getDriver();
    OpenMrsLogInPage openMrsLogInPage = new OpenMrsLogInPage(driver);
    OpenMrsMainPage openMrsMainPage = new OpenMrsMainPage(driver);
    OpenMrsRegisterPage openMrsRegisterPage  = new OpenMrsRegisterPage(driver);

    @Given("the user log in OpenMrs with following credentials")
    public void the_user_log_in_open_mrs_with_following_credentials(DataTable dataTable) {
        //you should know that data table will come as a parameter when you provide data table in
        // the feature file. And delete the first part of the data table and import it.
        Map<String, String> usernamePasswordMap = dataTable.asMap();
        //username = admin
        //password = Admin123
//        String username = usernamePasswordMap.get("username");
//        String password = usernamePasswordMap.get("password");
//        System.out.println(username );
//        System.out.println(password);
        openMrsLogInPage.logIn(usernamePasswordMap.get("username"), usernamePasswordMap.get("password"));

    }


        @When("the user register a new patient for following information")
        public void the_user_register_a_new_patient_for_following_information(DataTable dataTable) throws InterruptedException {

            Map<String, String> patientInfoMap = dataTable.asMap();

            openMrsMainPage.checkInPatien();
            openMrsRegisterPage.sendNames(patientInfoMap.get("GivenName"), patientInfoMap.get("FamilyName"));
            openMrsRegisterPage.sendGender(patientInfoMap.get("Gender"));
            openMrsRegisterPage.sendBirthDate(patientInfoMap.get("Dya"), patientInfoMap.get("Month"),patientInfoMap.get("Year"));
            openMrsRegisterPage.sendAddress(patientInfoMap.get("Address"));
            openMrsRegisterPage.sendPhoneNumber(patientInfoMap.get("PhoneNumber"));
            openMrsRegisterPage.sendRelativeInfo(patientInfoMap.get("relationType"), patientInfoMap.get("RelativeName"));
            openMrsRegisterPage.clickConfirmButton();

        }


    @Then("then the user validates the patient name and family name")
    public void then_the_user_validates_the_patient_name_and_family_name(DataTable dataTable) {

        Map<String, String> validatesNames = dataTable.asMap();
        Assert.assertEquals(validatesNames.get("GivenName"), openMrsRegisterPage.getGivenName());
        Assert.assertEquals(validatesNames.get("FamilyName"), openMrsRegisterPage.getLastName());
    }

}


