package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

    @Parameters("FirstName")
    @Test (priority = 1, invocationCount = 10)
    public void test2(String name){
        System.out.println(name);
    }

    @Parameters({"City", "State"})
    @Test(priority = 2, invocationTimeOut = 2000)
    public void test1(String city, String state){
        System.out.println(city);
        System.out.println(state);

    }
}
