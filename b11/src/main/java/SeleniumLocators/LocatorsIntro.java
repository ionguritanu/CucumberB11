package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/ionguritanu/Desktop/Techtorial%20(2).html");

        //getText() --gives text of element

        WebElement header = driver.findElement(By.id("techtorial1"));
        String actualText = header.getText(); //from the system
        String expected = "Techtorial Academy";                //from the busines requirement
        if (actualText.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        WebElement text = driver.findElement(By.id("details2"));
        System.out.println(text.getText());                     //from the system
        String expected1 = "To create your account, \n" +
                "        we'll need some basic information about you. This information will be \n" +
                "        used to send reservation confirmation emails, mail tickets when needed \n" +
                "        and contact you if your travel arrangements change. Please fill in the \n" +
                "        form completely.";                //from the busines requirement

        if(text.getText().equals(expected1)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


        //Locator: ClassName
        WebElement tools = driver.findElement(By.className("group_checkbox"));
        System.out.println(tools.getText());

        //Locator : Name
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Ionel");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Guritanu");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("123456");

        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys("ion@gmail.com");

        WebElement javaBox = driver.findElement(By.id("cond1"));
        javaBox.click();
        System.out.println(javaBox.isDisplayed());//return true
        System.out.println( javaBox.isSelected());


        WebElement testNG = driver.findElement(By.id("cond3"));
        testNG.click();
        System.out.println(testNG.isDisplayed());//return true
        System.out.println( testNG.isSelected());

        WebElement cucumber = driver.findElement(By.id("cond4"));
        cucumber.click();
        System.out.println(cucumber.isDisplayed());//return true
        System.out.println( cucumber.isSelected());





    }
}
