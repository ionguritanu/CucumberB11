package com.test.etsy.tests;

import com.test.etsy.EtsyTestBase;
import com.test.etsy.pages.MainPageEtsy;
import com.test.orangehrm.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testMainPage extends EtsyTestBase {


   @Parameters("itemSearch")
   @Test(priority = 1)
    public void etsySearchTest(String item){
       MainPageEtsy mainPageEtsy = new MainPageEtsy(driver);
       mainPageEtsy.searchItem(item);
       Assert.assertTrue(mainPageEtsy.validateHeader());
   }
}
