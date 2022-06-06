package com.test.openchart.tests;

import com.test.openchart.pages.CustomerPageOpenChart;
import com.test.openchart.pages.OpenChartLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCustomerPageOpenChart extends TestBaseOpenChart {
    @Test
    public void clickCustomers() throws InterruptedException {
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        openChartLoginPage.login("demo", "demo");
        CustomerPageOpenChart customerPageOpenChart = new CustomerPageOpenChart(driver);
        customerPageOpenChart.Customers();
        customerPageOpenChart.customersCustomers();
        customerPageOpenChart.addingNewCustomer("Ion", "Gur", "iong@gmail.com","123456", "123321", "123321");
        customerPageOpenChart.validationMessage();
        Assert.assertEquals(customerPageOpenChart.validationMessage()," Warning: You do not have permission to modify customers!");


    }
}
