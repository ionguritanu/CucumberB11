package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;

public class FindElementsPractice {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.yahoo.com/");
        driver.manage().window().maximize();

        WebElement news = driver.findElement(By.xpath("//a[@id='root_2']"));
        news.click();

        List<WebElement> elements = driver.findElements(By.xpath("//div//h3"));
        int count = 0;
        for(WebElement element : elements){
          //  System.out.println(element.getText());
            if(element.getText().contains("Covid")){
               // System.out.println();
                count++;
            }
        }
        System.out.println(count);

    }
}
