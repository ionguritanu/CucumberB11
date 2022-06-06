package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class practice2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box/");

        // Find elements using tag name
       // WebElement element = driver.findElement(By.xpath(""));
        List<WebElement> allInputElements = driver.findElements(By.tagName("input"));

        if(allInputElements.size() != 0)
        {
            System.out.println(allInputElements.size() + " Elements found by TagName as input \n");

            for(WebElement inputElement : allInputElements)
            {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
         }
      }
}
