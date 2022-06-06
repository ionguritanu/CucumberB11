package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {


    @Test(dataProvider = "FullNameTest",dataProviderClass = DataForNames.class)
    public void test1(String username, String lastname, String expectedFullName) {
        String userName = username;
        String lastName = lastname;
        String fullName = userName + " " + lastName;
        Assert.assertEquals(fullName, expectedFullName);
    }
}

//
//    @Test
//    public void test2(){
//        String userName = "Igor";
//        String lastName = "Car";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"Igor Car");
//
//    }  @Test
//    public void test3(){
//        String userName = "Mike";
//        String lastName = "Lopes";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"Mike Lopes");
//
//    }  @Test
//    public void test4(){
//        String userName = "Ram";
//        String lastName = "Corb";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"Ram Corb");
//
//    }  @Test
//    public void test5(){
//        String userName = "Alex";
//        String lastName = "Mirron";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"Alex Mirron");
//
//    }  @Test
//    public void test6(){
//        String userName = "Ivan";
//        String lastName = "Ivanov";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"Ivan Ivanov");
//
//    }  @Test
//    public void test7(){
//        String userName = "B";
//        String lastName = "Bold";
//        String fullName= userName+" "+lastName;
//        Assert.assertEquals(fullName,"B Bold");
//
//    }
