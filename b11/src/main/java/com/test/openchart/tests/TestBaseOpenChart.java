package com.test.openchart.tests;

import com.test.openchart.pages.OpenChartLoginPage;
import com.test.orangehrm.pages.LoginPage;
import org.testng.annotations.Test;

public class TestBaseOpenChart extends com.test.openchart.TestBaseOpenChart {


    @Test
    public void validateLogin() {
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        openChartLoginPage.login("demo", "demo");
    }
}