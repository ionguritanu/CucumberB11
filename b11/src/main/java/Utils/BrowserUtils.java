package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

public class BrowserUtils {
    //we creat browserutils to be able to call reusable methods from here to reduce amount of the codes
    public static void selectBy(WebElement element, String value, String methodName) {
        Select select = new Select(element);

        switch (methodName) {
            case "text":
                select.selectByVisibleText(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            default:
                System.out.println("Methode name is not available, Use text, value, or index for method name");
        }

    }


    public static String getTextMethode(WebElement element) {
        return element.getText().trim();
    }


//    public static String GetTitleWithJC(WebDriver driver){
//        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
//        String title = javascriptExecutor.executeAsyncScript("return document.title").toString();
//        return title;

    public static String GettilewithJS(WebDriver driver) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        String title = javascriptExecutor.executeScript("return document.title").toString();
        return title;
    }


    public static void ClickWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);
    }


    public static void ScrollWithJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void ScrollWithXandYCord(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Point location = element.getLocation();
        int xCord = location.getX();
        int yCord = location.getY();
        js.executeScript("window.scrollTo(" + xCord + "," + yCord + ")");
    }


    public static void switchOnlyFor2Tabs(WebDriver driver, String mainPageId) {
        Set<String> allPageId = driver.getWindowHandles();
        for (String id : allPageId) {
            System.out.println(id);
            if (!id.equals(mainPageId)) {
                driver.switchTo().window(id);
            }
        }
    }

    //in real world this will help a lot
    public static void switchByTitle(WebDriver driver, String title) {
        Set<String> allPagesId = driver.getWindowHandles();
        for (String id : allPagesId) {
            driver.switchTo().window(id);
            if (driver.getTitle().contains(title)) {
                break;
            }
        }
    }


    //for ScreenShot for TestNG
    public static void getScreenShot(WebDriver driver, String packageName){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String location = System.getProperty("user.dir")+ "/src/java/screenshot"+ packageName;

        try {
            FileUtils.copyFile(file, new File(location+System.currentTimeMillis()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}