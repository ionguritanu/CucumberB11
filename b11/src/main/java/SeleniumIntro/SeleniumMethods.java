package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {
    //Interview qs:
        System.getProperty("webdriver.chrome.driver", "cromedriver");
        WebDriver driver = new ChromeDriver();
        //driver.navigate().to

        driver.navigate().to("https://www.selenium.dev");
        //driver.quit(); //
        driver.close();
        //Thread.sleep(3000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource()); Not comon
        // gives the source of html
        driver.navigate().to("https://www.google.com/?client=safari");
        //Thread.sleep(3000);
        driver.navigate().back(); //amazon
        //Thread.sleep(3000);
        driver.navigate().forward(); //techtorial
        //Thread.sleep(3000);
        driver.navigate().refresh(); //refresh

        driver.navigate().refresh();
        driver.close();


        //Task


    }
}
