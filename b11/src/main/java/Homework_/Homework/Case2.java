package Homework_.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesButton = driver.findElement(By.id("yesRadio"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",yesButton);
        Thread.sleep(500);

        WebElement actualYesResult = driver.findElement(By.xpath("//p[@class='mt-3']"));
        String actualYesResultValidation = actualYesResult.getText();
        System.out.println(actualYesResultValidation);
        String expectedYesResultValidation = "You have selected Yes";
        if (actualYesResultValidation.equals(expectedYesResultValidation)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


        WebElement impressiveButton = driver.findElement(By.id("impressiveRadio"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()",impressiveButton);
        Thread.sleep(500);

        WebElement actualImpressiveButton = driver.findElement(By.xpath("//p[@class='mt-3']"));
        String actualImpressiveButtonValidation = actualImpressiveButton.getText();
        System.out.println(actualImpressiveButtonValidation);
        String expectedImpressiveButton = "You have selected Impressive";
        if (actualImpressiveButtonValidation.equals(expectedImpressiveButton)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
