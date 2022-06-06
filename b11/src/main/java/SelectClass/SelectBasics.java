package SelectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectBasics {

    @Test
    public void practice1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement dropDown = driver.findElement(By.linkText("Dropdown"));
        dropDown.click();
        WebElement optionBox = driver.findElement(By.id("dropdown"));
        Select option = new Select(optionBox); //provide webElements location
        option.selectByIndex(2);      //option2
        Thread.sleep(2000);
        option.selectByValue("2");
        Thread.sleep(2000);
        option.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        List <WebElement> options = option.getOptions();
        for(WebElement option1 : options){
            System.out.println( option1.getText().trim());
        }
    }
}
