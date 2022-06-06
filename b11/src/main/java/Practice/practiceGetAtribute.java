package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceGetAtribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String expectedUrl = "https://www.google.com/";
        if(url.equals(expectedUrl)){
            System.out.println("Pass");
        }

        WebElement a = driver.findElement(By.name("btnK"));
        System.out.println(a.getAttribute("aria-label"));
        if(a.equals("Google Search")){
            System.out.println("Pass");
        }
    }
}
