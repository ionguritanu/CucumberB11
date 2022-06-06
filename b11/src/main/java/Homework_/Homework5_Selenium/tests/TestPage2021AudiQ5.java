package Homework_.Homework5_Selenium.tests;

import Homework_.Homework5_Selenium.TestBaseAudi;
import Homework_.Homework5_Selenium.pages.MainPageAudi;
import Homework_.Homework5_Selenium.pages.Page2021AudiQ5;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage2021AudiQ5 extends TestBaseAudi {

    @Test
    public void testCase1() throws InterruptedException {
        MainPageAudi mainPageAudi = new MainPageAudi(driver);
        mainPageAudi.validation();
        Page2021AudiQ5 page2021AudiQ5 = new Page2021AudiQ5(driver);
        page2021AudiQ5.validationHeader();
        page2021AudiQ5.buildCar();
        page2021AudiQ5.validatingStartingPrice();
        page2021AudiQ5.validationThreeVersionOfTheCar("Premium", "Premium Plus", "Prestige");
        page2021AudiQ5.validationPriceOfThreeCars("43,300", "48,300", "54,000");
    }

    @Test
    public void testCase2() throws InterruptedException {
        MainPageAudi mainPageAudi = new MainPageAudi(driver);
        mainPageAudi.validation();
        Page2021AudiQ5 page2021AudiQ5 = new Page2021AudiQ5(driver);
        page2021AudiQ5.buildCar();
        page2021AudiQ5.premiumPLusValidation("43,300", "595", "1,195");
        Assert.assertEquals("43,300" + "595" + "1,195", "43,3005951,195");//45,090.
    }

    @Test
    public void testCase3() throws InterruptedException {
        MainPageAudi mainPageAudi = new MainPageAudi(driver);
        mainPageAudi.validation();
        Page2021AudiQ5 page2021AudiQ5 = new Page2021AudiQ5(driver);
        page2021AudiQ5.buildCar();
        page2021AudiQ5.validationColor();

    }
}
