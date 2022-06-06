package Tesla.com.src.tesla.main.java.TeslaLifestyle.test;

import Tesla.com.src.tesla.main.java.TeslaLifestyle.TestBase;
import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.MainPage;
import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.Us1;
//import TeslaLifestyle.TestBase;
//import TeslaLifestyle.pages.MainPage;
//import TeslaLifestyle.pages.Us1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Us1Test extends TestBase {

    @Test
    public void Us1TestPositive() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.LifeStyle();
        Thread.sleep(1000);
        Us1 us1=new Us1(driver);
        Assert.assertEquals(us1.ValidationCount(),5);
        //validation count of category its 5
        Assert.assertEquals(us1.ValidationHeaders(),us1.ExpectedHeader());
        //validate order of category
       // Assert.assertEquals(us1.ValidationHeaders(),us1.ExpectedHeaderNegative());
    }
    @Test
    public void Us1TestNegative() throws InterruptedException {
        MainPage mainPage=new MainPage(driver);
        mainPage.LifeStyle();
        Thread.sleep(1000);
        Us1 us1=new Us1(driver);
        Assert.assertEquals(us1.ValidationHeaders(),us1.ExpectedHeaderNegative());
    }

}
