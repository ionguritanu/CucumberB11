package FileUpload;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPractice {
    @Test
    public void validateFileUpload() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("/Users/ionguritanu/Desktop/moldova.png"); //add name of file
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();
        Thread.sleep(2000);
        WebElement msg1= driver.findElement(By.xpath("//h3"));
        String actualMsg1 = msg1.getText();
        String expectedMsg1 = "File Uploaded!";
        Assert.assertEquals(actualMsg1,expectedMsg1);
        WebElement msg2 = driver.findElement(By.id("uploaded-files"));
        String actualmsg2 = msg2.getText();
        String expectedmsg2 = "moldova.png";
        Assert.assertEquals(actualmsg2, expectedmsg2);
    }
}
