package com.test.orangehrm.tests;

import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import com.test.orangehrm.pages.MainPage;
import com.test.orangehrm.pages.PIMPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PimTest extends TestBase {
    LoginPage loginPage;
    MainPage mainPage;
    PIMPage pimPage;

    @BeforeMethod
    public void initiliazingPages(){
         loginPage = new LoginPage(driver);
         mainPage = new MainPage(driver);
         pimPage = new PIMPage(driver);

    }
    @Test
    public void validateTheCreationOfEmployee() throws InterruptedException {
        //LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123");
        //MainPage mainPage = new MainPage(driver);
        mainPage.clickPimButton();
        //PIMPage pimPage = new PIMPage(driver);
        pimPage.addEmployeeForPIM("IonN3", "Gur", "1993", "/Users/ionguritanu/Desktop/usa.png");
        Assert.assertEquals(pimPage.validateFirstName(), "IonN3");
        Assert.assertEquals(pimPage.validateLastName(), "Gur");
        Assert.assertTrue(pimPage.validateEmployeeId("1993"));

    }
        @Test
        public void ValidatePersonalDetailElement() throws InterruptedException {
            loginPage.login("Admin","admin123");
            mainPage.clickPimButton();
            pimPage.addEmployeeForPIM("IonN3","Gur","1993","/Users/ionguritanu/Desktop/usa.png");
            pimPage.editPersonalDetails("Moldovan","1990-08-13","Single");
            Assert.assertEquals(pimPage.validateTheNationality(),"Moldovan");
        }
    }
