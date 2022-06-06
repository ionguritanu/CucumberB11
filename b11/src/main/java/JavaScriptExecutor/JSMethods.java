package JavaScriptExecutor;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSMethods {
    //when normal methods are not working the last decision should be JavaScript

    @Test
    public void TitleMethod() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        String title = javascriptExecutor.executeAsyncScript("return document.title").toString();
//        System.out.println(title + " from javaScript");
//
        String actualTitle = BrowserUtils.GettilewithJS(driver);
        String expectedTitle = "Home Page - Techtorial";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void ClickWithJS() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement browserCourse = driver.findElement(By.xpath("//a[.='Browse Course']"));
//        javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        BrowserUtils .ClickWithJS(driver,browserCourse);
    }




    @Test
    public void ClickWithJS1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement studentClick = driver.findElement(By.xpath("//*[@id=\"mySidenav\"]/div/a[1]\n"));
//      javascriptExecutor.executeScript("arguments[0].click()",browserCourse);
        BrowserUtils .ClickWithJS(driver,studentClick);
    }




    @Test
    public void ScrollIntoView() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyRight = driver.findElement(By.xpath("//p[.='© Copyrights 2021 Techtorial - All Rights Reserved']"));

        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].scrollIntoView(true)", copyRight);

        WebElement browserClick = driver.findElement(By.xpath("//a[.='Browse Course']"));
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils .ClickWithJS(driver,browserClick);
        Thread.sleep(1000);
        WebElement getStarted = driver.findElement(By.xpath("//h4[.='Online Course']//..//a"));
       // js.executeScript("arguments[0].scrollIntoView(true)", getStarted);
        BrowserUtils.ScrollWithJS(driver, getStarted);
        BrowserUtils .ClickWithJS(driver,getStarted);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,650)", "");
//        Thread.sleep(2000);

    }

    @Test
    public  void ScroolWithXandYCordindnatTest(){
        //Thi si an interview question(point class)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement copyRight = driver.findElement(By.xpath("//p[.='© Copyrights 2021 Techtorial - All Rights Reserved']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        Point location = copyRight.getLocation();
//        System.out.println(location.getX());
//        System.out.println(location.getY());
//        int xCord = location.getX();
//        int yCord = location.getY();
//        js.executeScript("window.scrollTo("+xCord+","+yCord+")");
        BrowserUtils.ScrollWithXandYCord(driver,copyRight);

    }


}