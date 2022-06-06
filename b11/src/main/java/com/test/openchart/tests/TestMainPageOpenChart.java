package com.test.openchart.tests;

import com.test.openchart.pages.MainPageOpenChart;
import com.test.openchart.pages.OpenChartLoginPage;
import com.test.orangehrm.TestBase;
import com.test.orangehrm.pages.LoginPage;
import org.testng.annotations.Test;

    public class TestMainPageOpenChart extends TestBaseOpenChart{

        @Test
        public void validateTheCreationOfEmployeeMessage() {
            OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
            openChartLoginPage.login("demo", "demo");
            MainPageOpenChart mainPageOpenChart = new MainPageOpenChart(driver);
            mainPageOpenChart.validateTheMainPageINfo("12K","11.8M", "144.8K");
        }
}
