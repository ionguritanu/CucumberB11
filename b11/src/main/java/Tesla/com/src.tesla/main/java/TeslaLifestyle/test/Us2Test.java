//package Tesla.com.src.tesla.main.java.TeslaLifestyle.test;
//
//import Tesla.com.src.tesla.main.java.TeslaLifestyle.TestBase;
//import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.MainPage;
//import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.US2;
//import TeslaLifestyle.TestBase;
//import TeslaLifestyle.pages.MainPage;
//import TeslaLifestyle.pages.US2;
//import org.checkerframework.checker.units.qual.A;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Us2Test extends TestBase {
//    @Test
//    public void Test2Validation() throws InterruptedException {
//        MainPage mainPage=new MainPage(driver);
//        mainPage.LifeStyle();
//        US2 us2=new US2(driver);
//        Assert.assertEquals(us2.ValidateText(),"Tesla Shop Gift Card");
//        //validation Tesla Shop Gift Card its displayed
//        Assert.assertEquals(us2.ValidateAmount(),"$10 - $500");
//        //validate $10-$500 its present
//        // i validate it as a String
//        Assert.assertEquals(us2.ValidateColour(),"rgba(0, 0, 0, 1)");
//        //Validate Color of text of amount text $10-$500
//    }
//}
