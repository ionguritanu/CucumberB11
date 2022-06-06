import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {
/*
Navigate to the "http://uitestpractice.com/Students/Index"
Click Create new button
Enter any firstname, lastname and enrollment date
Click create button
Search firstname in search bar
Validate the new information is created
 */
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        WebElement createNew = driver.findElement(By.xpath("//a[.='Create New']"));
        createNew.click();
        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        try {
            driver.switchTo().frame("aswift_2");
            WebElement element = driver.findElement(By.xpath("//div[@style=\"cursor: pointer;\"]"));
            actions.moveToElement(element).click(element).perform();}
        catch (Exception e){
            e.printStackTrace();
            driver.switchTo().frame("ad_iframe");
            WebElement element = driver.findElement(By.xpath("//span[.=\"Close\"]"));
            actions.click(element).perform();
        }
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("//input[@name='FirstName']"));
        firstName.sendKeys("Ion");
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Guritanu");
        WebElement  enrollment = driver.findElement(By.xpath("//input[@name='EnrollmentDate']"));
        enrollment.sendKeys("02.24.2022");
        WebElement submitButton = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        submitButton.click();
        WebElement search = driver.findElement(By.xpath("//input[@id='Search_Data']"));
        search.sendKeys("Ion");
        Thread.sleep(2000);
        WebElement findButton = driver.findElement(By.xpath("//input[@value='Find']"));
        findButton.click();
        Thread.sleep(2000);
        WebElement fullInfo = driver.findElement(By.xpath("//tbody//tr[2]"));
        String actualInfo = fullInfo.getText().replace(" 12:00:00 AM EDIT DETAILS DELETE","");
        System.out.println(actualInfo);
        String expectedInfo ="Ion Guritanu 2/24/2022";
        Assert.assertEquals(actualInfo, expectedInfo);

    }
}

