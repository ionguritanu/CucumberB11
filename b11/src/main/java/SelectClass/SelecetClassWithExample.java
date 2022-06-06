package SelectClass;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelecetClassWithExample {
    @Test
    public void validationTripButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWayButton.click();
        Assert.assertTrue(oneWayButton.isDisplayed());
        Assert.assertTrue(oneWayButton.isSelected());
        WebElement roundTripButton = driver.findElement(By.xpath("//input[@value='roundtrip']"));
        Assert.assertTrue(roundTripButton.isDisplayed());
        Assert.assertFalse(roundTripButton.isSelected());

    }

    @Test
    public void selectMethods(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWayButton.click();
        WebElement passengersCount = driver.findElement(By.name("passCount"));
        Select psnger = new Select(passengersCount);
        psnger.selectByIndex(1);

        WebElement departsFrom = driver.findElement(By.name("fromPort"));
        Select departsList = new Select(departsFrom);
        departsList.selectByIndex(1);

        WebElement month = driver.findElement(By.name("fromMonth"));
        Select monthList = new Select(month);
        monthList.selectByVisibleText("April");


        WebElement day = driver.findElement(By.name("fromDay"));
        Select dayAvailable = new Select(day);
        dayAvailable.selectByIndex(20);

        WebElement toPort = driver.findElement(By.name("toPort"));
        Select port = new Select(toPort);
        port.selectByValue("New York");


        WebElement returning = driver.findElement(By.xpath("//select[@name='toMonth']"));
        Select returning1 = new Select(returning);
        returning1.selectByVisibleText("May");

        WebElement returnDay = driver.findElement(By.xpath("//select[@name='toDay']"));
        Select rtrnDay = new Select(returnDay);
        rtrnDay.selectByIndex(0);

        WebElement returnHome = driver.findElement(By.xpath("//input[@value='First']"));
        returnHome.click();

        WebElement airLine = driver.findElement(By.xpath("//select[@name='airline']"));
        Select airLineList = new Select(airLine);
        airLineList.selectByIndex(1);

        WebElement click = driver.findElement(By.xpath("//input[@name='findFlights']"));
        click.click();

        WebElement result = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/p[1]/font[1]/b[1]/font[1]"));
        String Resul = result.getText();
        System.out.println(Resul);
       // Assert.assertTrue(actualResul,expectedResul);
        String actualResult = "After flight finder - No Seats Avaialble";
        String expectedResult = "After flight finder - No Seats Available";
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void selectMethods2 () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        driver.manage().window().maximize();
        WebElement oneWayButton = driver.findElement(By.xpath("//input[@value='oneway']"));
        oneWayButton.click();

        WebElement passengersCount = driver.findElement(By.name("passCount"));
        BrowserUtils.selectBy(passengersCount,"1","index");
//        Select psnger = new Select(passengersCount);
//        psnger.selectByIndex(1);

        WebElement departsFrom = driver.findElement(By.name("fromPort"));
        BrowserUtils.selectBy(departsFrom,"1", "index");

//        Select departsList = new Select(departsFrom);
//        departsList.selectByIndex(1);

        WebElement month = driver.findElement(By.name("fromMonth"));
        BrowserUtils.selectBy(month,"April", "text");
//        Select monthList = new Select(month);
//        monthList.selectByVisibleText("April");


        WebElement day = driver.findElement(By.name("fromDay"));
        BrowserUtils.selectBy(day,"20", "index");
//        Select dayAvailable = new Select(day);
//        dayAvailable.selectByIndex(20);

        WebElement toPort = driver.findElement(By.name("toPort"));
        BrowserUtils.selectBy(toPort, "New York", "value");
//        Select port = new Select(toPort);
//        port.selectByValue("New York");


        WebElement returning = driver.findElement(By.xpath("//select[@name='toMonth']"));
        BrowserUtils.selectBy(returning,"May", "text");
//        Select returning1 = new Select(returning);
//        returning1.selectByVisibleText("May");

        WebElement returnDay = driver.findElement(By.xpath("//select[@name='toDay']"));
        BrowserUtils.selectBy(returnDay, "0", "index");
//        Select rtrnDay = new Select(returnDay);
//        rtrnDay.selectByIndex(0);

        WebElement returnHome = driver.findElement(By.xpath("//input[@value='First']"));
        returnHome.click();

        WebElement airLine = driver.findElement(By.xpath("//select[@name='airline']"));
        Select airLineList = new Select(airLine);
        airLineList.selectByIndex(1);

        WebElement click = driver.findElement(By.xpath("//input[@name='findFlights']"));
        click.click();

        WebElement result = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/p[1]/font[1]/b[1]/font[1]"));
        String Resul = result.getText();
        System.out.println(Resul);
        // Assert.assertTrue(actualResul,expectedResul);
        String actualResult = "After flight finder - No Seats Avaialble";
        String expectedResult = "After flight finder - No Seats Available";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
