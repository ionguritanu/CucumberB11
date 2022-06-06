package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");

        WebElement title = driver.findElement(By.xpath("//h3"));
        System.out.println(title.getText());

        WebElement text = driver.findElement(By.xpath("//h4[@class='subheader']"));
        System.out.println(text.getText());

        WebElement web = driver.findElement(By.xpath("//a[@href='http://elementalselenium.com/']"));
        web.click();
        System.out.println(web.getText());




        // Contains
        ////tagname[contains(text(), 'HorizontalLine')]
//        WebElement contains = driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));
//        System.out.println(contains.getText());

        WebElement containsmethod= driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));
        System.out.println(containsmethod.getText());

//        WebElement containsPOWER= driver.findElement(By.xpath("//div[contains(text(), 'Powered by ')]"));
//        System.out.println(containsPOWER.getText());
//div[contains(text(), 'Powered by ')]
        //Text: it work with text as well. This looks for exact text.
        //h3[.='text']

//        WebElement headerLine = driver.findElement(By.xpath("//h3[.='Horizontal Slider']"));
//        System.out.println(headerLine.getText());

        //h3[.='Horizontal Slider']
    }
}
