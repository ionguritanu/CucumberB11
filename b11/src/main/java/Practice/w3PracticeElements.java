package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class w3PracticeElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/exercises/index.php");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='leftmenuinnerinner']//a"));
        for(WebElement element : elements){
            System.out.println(element.getText());
        }
    }
}
