package stepdefinitions.weborderstep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverHelper;

public class HookWebOrder {
    @Before  //from io.cucumber
    public void beforeScenario(){
        System.out.println("It runs before each scenario");
    }

    @After  //from io.cucumber
    public void afterScenario(){
        DriverHelper.tearDown();
        System.out.println("It runs after each scenario");
    }
}
