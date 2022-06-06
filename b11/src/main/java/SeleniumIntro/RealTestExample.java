package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealTestExample {
    public static void main(String[] args) {

//  Test Case - Open Godaddy.com and validate it's Page title and the url.
//    Steps to Automate:
//            1. Launch browser of your choice say., Firefox, chrome etc.
//            2. Open this URL - https://www.godaddy.com/
//            3. Maximize or set size of browser window.
//            4. Get Title of page and validate it.
//            4. Get URL of current page and validate it.
//            5. Close browser.


        System.getProperty("webdriver.chrome.driver", "cromedriver");
        WebDriver driver = new ChromeDriver();
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.godaddy.com/");
        driver.manage().window().maximize();
        String actual =  driver.getTitle();
        String expected =  "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
        if (actual.equals(expected)){
            System.out.println("Passed");
        }else{
            System.out.println("Not passed");
        }

        String actual1 =  driver.getCurrentUrl();
        String expected1 =  "https://www.godaddy.com/";
        if (actual1.equals(expected1)){
            System.out.println("Passed");
        }else{
            System.out.println("Not passed");
        }
        driver.close();


    }
}
