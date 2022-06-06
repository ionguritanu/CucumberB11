//package Mentoring_Nikita.PageObjectModel.Pages;
//
//import Mentoring_Nikita.PageObjectModel.Tests.test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Locale;
//
//public class homePage {
//    public homePage(WebDriver driver, test test) {
//        PageFactory.initElements(driver, this);
//    }
//
//
//    @FindBy(xpath = "//ul[@class='menu']/li")
//    public List<WebElement> menuOptions;
//
//
//    public void chooseOptionMenu(String option) {
//        String optionUpdate = option.toLowerCase().trim();
//        HashMap<String, WebElement> opts = new HashMap<>();
//        for (WebElement opt : menuOptions) {
//            opts.put(opt.getText(), opt);
//        }
//        if (opts.containsKey(optionUpdate)) {
//            opts.get(optionUpdate).click();
//        } else {
//            System.out.println("No such option");
//        }
//    }
//}