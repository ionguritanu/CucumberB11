package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement google = driver.findElement(By.name("btnK"));
        //System.out.println(google.getText());
        System.out.println(google.getAttribute("value"));
        System.out.println(google.getAttribute("aria-label"));
        if(google.getAttribute("value").equals("Google Search")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



    }
}
