package SelectClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiSelect {
    @Test
    public void multipleSelectAndFirstSelectPracgtice() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("file:///Users/ionguritanu/Desktop/Techtorial%20(2).html");
        driver.manage().window().maximize();

        //trim()--> removes spaces from both sides
        WebElement multiSelectBox = driver.findElement(By.xpath("//select[@class='select']"));
        BrowserUtils.selectBy(multiSelectBox,"Two", "text");
        BrowserUtils.selectBy(multiSelectBox, "3", "index");
        BrowserUtils.selectBy(multiSelectBox,"1", "value");

        Select select = new Select(multiSelectBox);
        Thread.sleep(2000);
        //select.deselectAll();
        select.deselectByIndex(3);
        WebElement countryList = driver.findElement(By.xpath("//select[@name='country']"));
        Select selectCountry = new Select(countryList);
        //String actualFirstOption = selectCountry.getFirstSelectedOption().getText().trim();
        String actualFirstOption = BrowserUtils.getTextMethode(selectCountry.getFirstSelectedOption());
        String expectedFirstOption = "UNITED STATES";
        Assert.assertEquals(actualFirstOption,expectedFirstOption);



    }
}
