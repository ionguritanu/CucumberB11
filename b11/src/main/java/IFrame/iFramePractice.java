package IFrame;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iFramePractice {
    @Test
    public void ifarmeTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.switchTo().frame("mce_0_ifr");
        //do not forget to switch
        WebElement element = driver.findElement(By.id("tinymce"));
        element.clear();
        element.sendKeys("I love Selenium");
        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String expectMsg = BrowserUtils.getTextMethode(header);
        String expecetedMsg = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(expectMsg,expecetedMsg);

    }
}
