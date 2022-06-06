package Homework_.Homework4_Selenium;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.BEROctetString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class homework4 {
    /*
Navigate to
"http://uitestpractice.com/Students/Select#"
Validate India is selected by default on drop down
box
Validate the size of the Drop down box is 4
Validate the values for Drop down box are :
India
United States of America
China
England

Select the China with index number
Select the England with value
Select the United States with visible text
Steps
     */
    @Test
    public void case1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://uitestpractice.com/Students/Select#");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement dropdownBox = driver.findElement(By.xpath("//*[@id='countriesSingle']/option"));
        //dropdownBox.
        String actualCountry = dropdownBox.getText();
        String expectedCountry = "India";

        Assert.assertEquals(actualCountry,expectedCountry);
        Assert.assertEquals(actualCountry,expectedCountry);
        //validating size
        List <WebElement> sizeBox =  driver.findElements(By.xpath("//*[@id='countriesSingle']/option"));  //or get options()
        int size = 0;
        for(int i=0; i<sizeBox.size();i++){
            size++;
        }
        int actualSize = size;    //4
        int expectedSize = 4;
        Assert.assertEquals(actualSize,expectedSize);
        Thread.sleep(2000);
        //validate the drop box list of countrys
        List <WebElement> sizeBoxList =  driver.findElements(By.xpath("//*[@id='countriesSingle']/option"));
        Set<String> actualList = new LinkedHashSet<>(); // it accepts insertion order
        Set<String> expectedList = new TreeSet<>();
        for (WebElement option : sizeBoxList) {
            actualList.add(option.getText().trim());
            expectedList.add(option.getText().trim());
        }
        Assert.assertEquals(actualList, expectedList);
        WebElement a = driver.findElement(By.xpath("//select[@id='countriesSingle']"));
        Select select = new Select(a);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("england");
        Thread.sleep(2000);
        select.selectByVisibleText("United states");
        Thread.sleep(4000);
        driver.quit();
    }



/* Navigate to
"http://uitestpractice.com/Students/Select#"
Validate the values for Multiple Select are :
India
United States of America
China
England
Select China and England
Validate "China England" is displayed
Deselect all the countries
Select All the countries
Validate "India United states of America China
England" is
displayed
Deselect the China with index number
Deselect the England with value
 */

    @Test
    public void case2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://uitestpractice.com/Students/Select#");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> countryList = driver.findElements(By.xpath("//select[@id='countriesMultiple']//option"));
       // Set<String> actualList = new LinkedHashSet<>(); // it accepts insertion order
        Set<String> expectedList = new TreeSet<>();
        for (WebElement option : countryList) {
           // actualList.add(option.getText().trim());
            expectedList.add(option.getText().trim());
        }
       // Assert.assertEquals(expectedList, countryList);
//            if(option.getText().equals("India") && option.getText().equals("United states of America") &&
//                    option.getText().equals("China") && option.getText().equals("England"));
//            System.out.println("Pass");

   }





   /* Navigate to "https://www.cars.com/"
    Select "Certified Cars" from drop down
    Select "Toyota" from All Makes
    Select "Corolla" from drop down
    Select max price is "$30000"
    Select 40 miles from drop down box
    Insert 60018 as zip code
    Click search button
    Validate title has Certified Used
    Validate "Certified Used Toyota Corolla for Sale" is displayed

    Validate 40 miles selected in dropdown once you click search button
    Validate Certified Pre-Owned selected in radio button
    Validate Toyota is selected in checkbox
    Validate Corolla is selected in drop down

    */
   @Test
    public void case3() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://www.cars.com/");
       //driver.manage().window().maximize();
       WebElement certifiedCars = driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
       Select select = new Select(certifiedCars);
       select.selectByIndex(4);
       Thread.sleep(1000);

       WebElement toyota = driver.findElement(By.xpath("//select[@id='makes']"));
       Select selectToyota = new Select(toyota);
       selectToyota.selectByValue("toyota");
       Thread.sleep(1000);

       WebElement corolla = driver.findElement(By.id("models"));
       Select selectCorolla = new Select(corolla);
       selectCorolla.selectByVisibleText("Corolla");
       Thread.sleep(1000);

       WebElement maxPrice = driver.findElement(By.id("make-model-max-price"));
       Select setMaxPrice = new Select(maxPrice);
       setMaxPrice.selectByIndex(7);
       Thread.sleep(3000);

       WebElement maxDistance = driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
       Select setMaxDistance = new Select(maxDistance);
       setMaxDistance.selectByIndex(3);
       Thread.sleep(2000);

       WebElement zip = driver.findElement(By.xpath("//input[@data-component='vehicle-search']"));
       zip.clear();
       zip.sendKeys("60018");
       Thread.sleep(1000);

       WebElement searchButton = driver.findElement(By.xpath("//button[@data-linkname='search-cpo-make']"));
       searchButton.click();
       Thread.sleep(1000);

       Assert.assertTrue(driver.getTitle().contains("Certified used"));
       Thread.sleep(1000);

       WebElement title = driver.findElement(By.xpath("//h1[@class='sds-heading--1 sds-page-section__title']"));
       boolean actualTitle = title.isDisplayed();
       Assert.assertEquals(actualTitle, true);

       WebElement selectedIs40 = driver.findElement(By.xpath("//select[@id='location-distance']//option[contains(text(),'40 miles')]"));
       Assert.assertTrue(selectedIs40.isSelected());

       WebElement certifiedIsSelected = driver.findElement(By.xpath("//select[@id='stock-type-select']//option[@value='cpo']"));
       Assert.assertTrue(certifiedIsSelected.isSelected());

       WebElement toyotaIsSelected = driver.findElement(By.xpath("//select[@id='make_select']//option[contains(text(),'Toyota')]"));
       Assert.assertTrue(toyotaIsSelected.isSelected());

//to validate Corolla
       // WebElement corollaIsSelected = driver.findElement(By.xpath("//label[@for='model_toyota-corolla']"));
       //Assert.assertTrue(corollaIsSelected.isSelected());



       //Thread.sleep(3000);
       //driver.quit();

           }

/*
Navigate to "https://www.cars.com/"
Select "Certified Cars" from drop down
Select "Lexus" from All Makes
Select "ES 350" from drop down
Select max price is "$50000"
Select 50 miles from drop down box
Insert 60016 as zip code
Click search button
Get count of all the cars which is displayed on first page  //done
Validate count of the cars is not more than 20              //done
Steps-Multiple CheckBox
            2part
Get all car names in first page
Validate All car names has "Lexus ES 350"
Get the Mile distance from zip code for every car
Validate mile distance is no more than 50mil in first page
Select Sort By --> Price:Highest in drop down
Validate highest price is not more than $50000
Steps
 */

    @Test
    public void case4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.cars.com/");
        //driver.manage().window().maximize();
        WebElement certifiedCars = driver.findElement(By.xpath("//select[@id='make-model-search-stocktype']"));
        BrowserUtils.selectBy(certifiedCars, "1", "index");

        WebElement lexus = driver.findElement(By.xpath("//select[@id='makes']"));
        BrowserUtils.selectBy(lexus, "Lexus", "text");
        Thread.sleep(1000);

        WebElement es350 = driver.findElement(By.xpath("//select[@id='models']"));
        BrowserUtils.selectBy(es350, "lexus-es_350", "value");
        Thread.sleep(1000);

        WebElement price = driver.findElement(By.xpath("//select[@id='make-model-max-price']"));
        BrowserUtils.selectBy(price, "50000", "value");
        Thread.sleep(1000);

        WebElement distance = driver.findElement(By.xpath("//select[@id='make-model-maximum-distance']"));
        BrowserUtils.selectBy(distance, "50", "value");
        Thread.sleep(1000);

        WebElement zip = driver.findElement(By.name("zip"));
        zip.clear();
        zip.sendKeys("60016");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.xpath("//button[@data-linkname='search-new-and-cpo-make']"));
        searchButton.click();

        List<WebElement> carsList = driver.findElements(By.xpath("//h2[@class='title']"));
        List<String> carCount = new ArrayList<>();
        int count = 0;
        for(WebElement car : carsList){
        carCount.add(car.getText().trim());
        count++;
        }
        System.out.println("Count of cars displayed on first page: "+count);
        //    Validate count of the cars is not more than 20
        Assert.assertTrue(carCount.size()<=20);        //done negative test as well

        //get names of all car names on the first page
        List<WebElement> carNames = driver.findElements(By.xpath("//h2[@class='title']"));
        for (WebElement carName : carNames){
         String names = carName.getText();
         System.out.println(names);
        }

        //validating if cars list has "Lexus ES 350"
        boolean lexusEs350 = carNames.contains("Lexus ES 350");
        boolean expectedLexusEs350 = true;
        Assert.assertEquals(lexusEs350,expectedLexusEs350);


    }
}