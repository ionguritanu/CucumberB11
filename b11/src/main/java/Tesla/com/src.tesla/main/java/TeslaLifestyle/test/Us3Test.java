//package Tesla.com.src.tesla.main.java.TeslaLifestyle.test;
//
//import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.MainPage;
//import Tesla.com.src.tesla.main.java.TeslaLifestyle.pages.Us3;
//import TeslaLifestyle.TestBase;
//import TeslaLifestyle.pages.MainPage;
//import TeslaLifestyle.pages.Us3;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Us3Test extends TestBase {
//    @Test
//    public void Task3Test() throws InterruptedException {
//        MainPage mainPage=new MainPage(driver);
//        mainPage.LifeStyle();
//        Us3 us3=new Us3(driver);
//        us3.ClickOnItem();
//        Assert.assertEquals(us3.ValidateOutOfStockText(),"This item is out of stock");
//        //Validate out of stock text is present
//        Assert.assertEquals(us3.EmailMeTextValidation(),"Email me when this item is restocked");
//        //validate Email Me text is present
//        Assert.assertEquals(us3.ValidationEmailMeTextColor(),"rgba(61, 105, 225, 1)");
//        //validate color of Email Me text
//        us3.ClickEmailMeText();
//        //click Email Me TEXT
//
//        Assert.assertEquals(us3.TextConfirmationEmailNegative("dffs"),"Please enter a valid email address");
//        //NEGATIVE SCENARIO WITH WRONG EMAIL EXPECTED TEXT :
//        //Please enter a valid email address
//        Assert.assertEquals(us3.TextConfirmationEmailPositive("dsd@gmail.com"),"We will send you an email when the item is restocked");
//        //Positive Scenario with valid email :
//        //expected text :We will send you an email when the item is restocked
//
//    }
//}
