//package Mentoring_Nikita.PageObjectModel.Tests;
//
//import Mentoring_Nikita.PageObjectModel.Pages.homePage;
//import Mentoring_Nikita.PageObjectModel.Pages.optionsHeader.collectionPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//public class test {
//    private Object WebElement;
//
//    @Test
//    public void test1() throws InterruptedException {
//        //WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.nga.gov/");
//
//        homePage homePAge = new homePage(driver, this);
//        homePAge.chooseOptionMenu("collection");
//
//        Thread.sleep(4000);
//
//        collectionPage collectionPage = new collectionPage(driver);
//        public void scrollToElement scrollToElement(driver, collectionPage);
//
//        (WebDriver driver, WebElement org.openqa.selenium.WebElement element;
//        element){
//            Actions actions = new Actions(driver);
//            actions.moveToElement(element);
//            actions.perform();
//
//        }
//
//
//    }
//
//    private void scrollToElement(WebDriver driver, collectionPage collectionPage) {
//    }
//
//}