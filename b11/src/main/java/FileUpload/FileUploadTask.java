package FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTask {
    @Test
    public void validateFileUpload1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement uploadFile = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
        uploadFile.sendKeys("/Users/ionguritanu/Desktop/moldova.png");
        WebElement clickBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        clickBox.click();
        Thread.sleep(2000);
        Assert.assertTrue(clickBox.isSelected());
        WebElement submit = driver.findElement(By.xpath("//button[@name='send']"));
        submit.click();
        Thread.sleep(2000);
        WebElement text1 = driver.findElement(By.xpath("//h3//center"));
        String actual = text1.getText();
        System.out.println(text1.getText());
        String expected = "1 file\n" +
                "has been successfully uploaded.";
        Assert.assertEquals(actual, expected);

    }
}