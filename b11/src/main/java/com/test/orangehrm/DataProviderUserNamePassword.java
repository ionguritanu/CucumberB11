package com.test.orangehrm;

import org.testng.annotations.DataProvider;

public class DataProviderUserNamePassword {

    @DataProvider(name = "validationLogInNegative2")
    public Object[][] getData() {
        return new Object[][]{
                {"Admin", "", ""}, //correct

        };
    }
}