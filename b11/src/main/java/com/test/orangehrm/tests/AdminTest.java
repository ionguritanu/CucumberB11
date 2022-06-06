package com.test.orangehrm.tests;

import Utils.ConfigReader;
import com.test.orangehrm.DataProviderUserRoles;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.AdminPage;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class AdminTest extends TestBase {

    @Test
    public void validateTheCreationOfEmployeeMessage(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login("Admin","admin123");
        MainPage mainPage = new MainPage(driver);
        mainPage.clickAdminButton();
        AdminPage adminPage = new AdminPage(driver);
        adminPage.sendingAllInformationForEmployee();
        //adminPage.validationTheEmployeeIsCreated("IonGur2");
        //Assert.assertTrue(adminPage.validationTheEmployeeIsCreated("IonGur3"));       //********
    }





    @Test (dataProvider = "UserRoles", dataProviderClass = DataProviderUserRoles.class)
    public void validateTheSelectRoleFunction1(String roleName){
            LoginPage loginPage=new LoginPage(driver);
            loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));
            MainPage mainPage = new MainPage(driver);
            mainPage.clickAdminButton();
            AdminPage adminPage = new AdminPage(driver);
            adminPage.selectUserRoles(roleName, driver);
            Assert.assertTrue(adminPage.validateRoleText(roleName));

    }
//    @Test
//    public void validateTheSelectRoleFunction2(){
//        LoginPage loginPage=new LoginPage(driver);
//        loginPage.login(ConfigReader.readProperty("orangehrmusername"), ConfigReader.readProperty("orangehrmpassword"));
//        MainPage mainPage = new MainPage(driver);
//        mainPage.clickAdminButton();
//        AdminPage adminPage = new AdminPage(driver);
//        adminPage.selectUserRoles("ESS", driver);
//    }
}