package IFrame;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrame {
    @Test
    public void nestedFrameValidation(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        //this is example of using index to switch frame
        driver.switchTo().frame(0);
        //this is the example of using webelement
        WebElement middleframe = driver.findElement(By.name("frame-middle"));
        driver.switchTo().frame(middleframe);
        WebElement textBox = driver.findElement(By.xpath("//div[@id='content']"));
        String actualName = BrowserUtils.getTextMethode(textBox);
        String expectedName = "MIDDLE";

        Assert.assertEquals(actualName,expectedName);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-left");
        WebElement text = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
        String actualName1 = text.getText().trim();
        String expectedName1 = "LEFT";
        Assert.assertEquals(actualName1,expectedName1);

//        driver.switchTo().parentFrame();
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();//goes directly to HTML
        driver.switchTo().frame("frame-bottom");
        WebElement text2 = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
        String actualName2 = text2.getText().trim();
        String expectedName2 = "BOTTOM";
        Assert.assertEquals(actualName2,expectedName2);


    }
}
