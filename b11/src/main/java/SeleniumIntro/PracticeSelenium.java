package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver", "cromedriver");
        WebDriver driver = new ChromeDriver();
        //String url = driver.getCurrentUrl();

        driver.navigate().to("https://www.selenium.dev/");
        driver.manage().window().maximize(); //to find the window
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.ebay.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();

    }
}
