package WindowHnadle;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Set;

public class SwitchWindow {
    @Test
    public void practice1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        System.out.println(driver.getWindowHandle());
        WebElement a = driver.findElement(By.xpath("//a[@href=\"/windows/new\"]"));
        a.click();
        System.out.println(driver.getWindowHandles());
        //WebElement header = driver.findElement(By.xpath("//h3[.='New Window']"));
        String mainPageId = driver.getCurrentUrl();
//        Set<String> allPageId = driver.getWindowHandles();
//        //this implementation for only 2 tabs
//        for (String id : allPageId) {
//            System.out.println(id);
//            if (!id.equals(mainPageId)) {
//                driver.switchTo().window(id);
//            }
//        }
        BrowserUtils.switchOnlyFor2Tabs(driver,mainPageId);
        
        WebElement header = driver.findElement(By.xpath("//h3[.='New Window']"));
        System.out.println(header.getText());
        String actualText = header.getText();
        String expectedText = "New Window";
        Assert.assertEquals(actualText, expectedText);


    }

    @Test
    public void practice2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        System.out.println(driver.getWindowHandle());
        WebElement openNewTab = driver.findElement(By.id("newTabBtn"));
        openNewTab.click();
        Thread.sleep(2000);
        System.out.println(driver.getWindowHandles());
        String mainPageId = driver.getCurrentUrl();
        Set<String> allPageId = driver.getWindowHandles();
                for(String id:allPageId){
                    if(!id.equals(mainPageId)){
                        driver.switchTo().window(id);
                    }
                }
        WebElement header = driver.findElement(By.xpath("//h1[@itemprop=\"name\"]"));
        String actualHeader = header.getText().trim();
        String expectedHeader = "AlertsDemo";
        Assert.assertEquals(actualHeader,expectedHeader);
        WebElement clickOption2 = driver.findElement(By.xpath("//button[@id=\"confirmBox\"]"));
        clickOption2.click();

    }
}