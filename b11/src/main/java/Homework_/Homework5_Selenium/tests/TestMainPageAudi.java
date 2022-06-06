package Homework_.Homework5_Selenium.tests;

import Homework_.Homework5_Selenium.pages.MainPageAudi;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMainPageAudi extends TestPage2021AudiQ5{
    @Test
    public void suvAndWagons() throws InterruptedException {

        MainPageAudi mainPageAudi = new MainPageAudi(driver);
        mainPageAudi.validation();


    }

}
