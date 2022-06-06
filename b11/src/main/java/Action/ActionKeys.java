package Action;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionKeys {

    @Test
    public void keys (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Actions actions = new Actions(driver);
        WebElement searchbar = driver.findElement(By.xpath("//input[@type='text']"));
        actions.moveToElement(searchbar)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("elenium")
                .doubleClick().keyDown(Keys.COMMAND)
                .sendKeys("c")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ARROW_RIGHT)
                .keyDown(Keys.SHIFT)
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.RETURN)   //Keys.Enter
                .perform();


        //Motes
        /*
        Keys.ENTER or Keys.Return
        Keys.Arrow right/left/up/down
         */
    }

    @Test
    public void actionPractice(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://text-compare.com/");
        Actions actions = new Actions(driver);
        WebElement insertBox = driver.findElement(By.xpath("//textarea[@name='text1']"));
        actions.moveToElement(insertBox)
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("G")
                .keyUp(Keys.SHIFT)
                .sendKeys("ood")
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.SHIFT)
                .sendKeys("B")
                .sendKeys(Keys.SHIFT)
                .sendKeys("by")
                .sendKeys(Keys.SPACE)
                .sendKeys("K")
                .keyUp(Keys.SHIFT)
                .sendKeys("eys")
                .doubleClick().keyDown(Keys.COMMAND)
                //.sendKeys("c")
                //.keyUp(Keys.COMMAND)
                //.sendKeys(Keys.ARROW_RIGHT)
                //.keyDown(Keys.SHIFT)
                //.sendKeys("v")
                //.keyUp(Keys.COMMAND)
                //.sendKeys(Keys.RETURN)   //Keys.Enter
                .perform();


    }



}
