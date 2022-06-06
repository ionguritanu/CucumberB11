package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
        //you can use to set up you your chrome Browser properties
        //deletecoockies
    }

    @BeforeTest
    public void beforeTets(){
    System.out.println("BeforeTest");
        //you can set to lauch your browser
}

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
        //you can navigate to website
    }

    @BeforeMethod
    public void beforeMethode(){
    System.out.println("BeforeMethode");
    //you can use it to log in the page
}

    @Test
    public void test1(){
        System.out.println("test-1");

    }

    @Test
    public void test2(){
        System.out.println("test-2");
    }

    @AfterMethod
    public void afterMethode(){
        System.out.println("AfterMethode");
        //You can take a screenshot for fail test annotation
        //DRIVER.quit();
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @AfterTest
    public void afterTest(){
    System.out.println("AfterTest");
}

    @AfterSuite
    public void afterSuite(){
    System.out.println("AfterSuite");
}

}
