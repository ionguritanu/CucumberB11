package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class TestNGPracticeWithRealWebSite2 {
    @Test
    public void validationOfAscendingOrderOfOption() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
        catalogBar.click();
        Thread.sleep(100);
        WebElement elementOption = driver.findElement(By.xpath("//a[.='Options']"));
        elementOption.click();
        Thread.sleep(1000);
        List<WebElement> allOption = driver.findElements(By.xpath("//tbody//tr/td[2]"));
        Set<String> actualdOptionOrders = new LinkedHashSet<>(); // it accepts insertion order
        Set<String> expectedOptionOrders = new TreeSet<>();      //ascending order
        for (WebElement option : allOption) {
            actualdOptionOrders.add(option.getText().trim());
            expectedOptionOrders.add(option.getText().trim());
           // Assert.assertEquals(actualdOptionOrders, expectedOptionOrders);
        }
        Assert.assertEquals(actualdOptionOrders, expectedOptionOrders);
    }


    @Test
    public void validationOfDescendingOrderOfOption() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
        catalogBar.click();
        Thread.sleep(1000);
        WebElement elementOption = driver.findElement(By.xpath("//a[.='Options']"));
        elementOption.click();
        Thread.sleep(1000);
        WebElement optionNmae = driver.findElement(By.xpath("//a[.='Option Name']"));
        optionNmae.click();
        Thread.sleep(1000);

        List<WebElement> descendingAllOption = driver.findElements(By.xpath("//tbody//tr/td[2]"));
        List<String> actualDescendingOrder = new LinkedList<>();
        List<String> expectedDescendingOrder = new ArrayList<>();
        for(int i = 0; i<descendingAllOption.size();i++){
        actualDescendingOrder.add(descendingAllOption.get(i).getText().trim());
        expectedDescendingOrder.add(descendingAllOption.get(i).getText().trim());
        Collections.sort(expectedDescendingOrder);
        Collections.reverse(expectedDescendingOrder);
          }
        Assert.assertEquals(actualDescendingOrder,expectedDescendingOrder);
       }



       @Test
    public void validationSortOrderDescending() throws InterruptedException {
           WebDriver driver = new ChromeDriver();
           driver.get("https://demo.opencart.com/admin/");
           driver.manage().window().maximize();
           WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
           loginButton.click();
           WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
           catalogBar.click();
           Thread.sleep(1000);
           WebElement elementOption = driver.findElement(By.xpath("//a[.='Options']"));
           elementOption.click();
           Thread.sleep(1000);
           WebElement sortOrder = driver.findElement(By.xpath("//a[.='Sort Order']"));
           sortOrder.click();
           List<WebElement> descendingSortOrder = driver.findElements(By.xpath("//tbody//tr/td[3]"));
           List<String> actualDescendingSortOrder = new LinkedList<>(); //descending
           List<String> expectedDescendingSortOrder = new ArrayList<>();
           for(int i = 0; i<descendingSortOrder.size();i++){
           actualDescendingSortOrder.add(descendingSortOrder.get(i).getText().trim());
           expectedDescendingSortOrder.add(descendingSortOrder.get(i).getText().trim());
              // Collections.sort(actualDescendingSortOrder);
               //Collections.reverse(expectedDescendingOrder);
           }
           Assert.assertEquals(actualDescendingSortOrder,expectedDescendingSortOrder);
       }


       @Test
       public void validationSortOrderAscending() throws InterruptedException {
           WebDriver driver = new ChromeDriver();
           driver.get("https://demo.opencart.com/admin/");
           driver.manage().window().maximize();
           WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
           loginButton.click();
           WebElement catalogBar = driver.findElement(By.xpath("//li[@id='menu-catalog']"));
           catalogBar.click();
           Thread.sleep(100);
           WebElement elementOption = driver.findElement(By.xpath("//a[.='Options']"));
           elementOption.click();
           Thread.sleep(1000);

           WebElement sortOrder = driver.findElement(By.xpath("//a[.='Sort Order']"));
           sortOrder.click();
           WebElement sortOrder1 = driver.findElement(By.xpath("//a[.='Sort Order']"));
           sortOrder1.click();

           List<WebElement> ascendingSortOrder = driver.findElements(By.xpath("//tbody//tr/td[3]"));
           Set<String> actualAscendingSortOrder = new LinkedHashSet<>();
           Set<String> expectedAscendingSortOrder = new TreeSet<>();
           for(int i = 0; i<ascendingSortOrder.size();i++){
               actualAscendingSortOrder.add(ascendingSortOrder.get(i).getText().trim());
               expectedAscendingSortOrder.add(ascendingSortOrder.get(i).getText().trim());
           }
           Assert.assertEquals(actualAscendingSortOrder,expectedAscendingSortOrder);
       }
}

