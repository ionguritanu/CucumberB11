package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practiceFindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        String a = driver.getCurrentUrl();
        System.out.println(a);
        String expected = "https://the-internet.herokuapp.com/";
        if (a.equals(expected)){
            System.out.println("pass");
        }
        List<WebElement> elements = driver.findElements(By.xpath("//div/ul/li"));
        int i = 0;
     for(WebElement element : elements) {
         if(element.getText().length()<=10){
             System.out.println(element.getText());
             i++;

         }

     }
        System.out.println(i);
    }
}
