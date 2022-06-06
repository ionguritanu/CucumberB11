package com.test.orangehrm;

import org.testng.annotations.DataProvider;

public class DataProviderUserRoles {
    @DataProvider(name = "validationLogInNegative2")
    public Object[][] getData() {
        return new Object[][]{
                {"Admin", "admin123", "Invalid credentials"}, //correct
                {"AdminWrong", "admin123", "Invalid credentials"},    // fail
                {"wrongUser", "wrongPassword", "Invalid credentials"}     //fail
        };
    }



    @DataProvider(name ="UserRoles" )
    public Object[][] getUserRolesData(){
        return new Object[][]{
                {"Admin"},
                {"ESS"}
        };
    }



}