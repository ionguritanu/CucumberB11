package Tesla.com.src.tesla.main.java.TeslaLifestyle.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Us1 {

    public Us1(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    // Exp: 5 categories are displayed
    //         Actula : 5 categories are displayed
    //               Best Seller Items
    //              Mini Teslas
    //              Drinkware
    //              Outdoor and Tech
    //             Gift Card

    @FindBy(xpath = "//h2")
    List<WebElement> COUNTS ;


    public int ValidationCount(){
        int count=0;

        for(WebElement header:COUNTS){
             count++;
        }
        return count;
    }
    public Set ValidationHeaders(){
        Set<String> headersActual=new LinkedHashSet<>();
        for (WebElement header:COUNTS){
            headersActual.add(header.getText().trim());

        }
        return headersActual;
    }

    public Set ExpectedHeader(){
        Set<String> headerExpected=new LinkedHashSet<>();
        headerExpected.add("Best Sellers");
        headerExpected.add("Mini Teslas");
        headerExpected.add("Drinkware");
        headerExpected.add("Outdoor & Tech");
        headerExpected.add("Gift Card");

        return headerExpected;
    }

    public Set ExpectedHeaderNegative(){
        Set<String> headerExpectedNegative=new LinkedHashSet<>();
        headerExpectedNegative.add("Best Sellers");
        headerExpectedNegative.add("Mini Teslas");
        headerExpectedNegative.add("Drinkware");
        headerExpectedNegative.add("Outdoor & Tech");
        headerExpectedNegative.add("Gift Card");
          headerExpectedNegative.add("tesla toys");
        return headerExpectedNegative;
    }






}
