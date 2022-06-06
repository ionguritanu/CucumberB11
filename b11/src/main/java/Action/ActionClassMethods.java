package Action;

import Utils.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Arrays;
import java.util.List;

public class ActionClassMethods {


    @Test
    public void ContextClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextMenu = driver.findElement(By.partialLinkText("Context"));
        contextMenu.click();
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        //Action Class you must use Perform at the end
        actions.contextClick(box).perform();                       //PERFORM
    }

    @Test
    public void HoverOver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement Hovers = driver.findElement(By.linkText("Hovers"));
        Hovers.click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        List <WebElement>  names = driver.findElements(By.tagName("//h5"));
        List<WebElement> pictures = driver.findElements(By.xpath("//div[@class='figure']//img"));
        List<String> expectedNames = Arrays.asList("");
        for (int i = 0; i<names.size();i++){
            Thread.sleep(2000);

            actions.moveToElement(pictures.get(i)).perform();
            Assert.assertEquals(BrowserUtils.getTextMethode(names.get(i)),expectedNames.get(i));
            System.out.println(BrowserUtils.getTextMethode(names.get(i)));
           }
        }

        @Test
    public void doubleClick(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action = new Actions(driver);
       // action.doubleClick(doubleClickButton).perform();
            WebElement rightClick  = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
            action.contextClick(rightClick).perform();

        }


    //TASK FOR STUDENTS
        /*
        Scenario to Automate:
1. Launch the Chrome web browser.
2. Open a URL "https://selenium08.blogspot.com/2019/11/double-click.html".
3. Locate the element "Double-click".
4.  click on the current location (i.e. on Double-click element).
5. Close the web browser.
         */


    @Test
    public void task() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2019/11/double-click.html");
        driver.manage().window().maximize();
        WebElement doubleClick1 = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.doubleClick(doubleClick1).perform();
        Thread.sleep(1000);
        driver.quit();
      }




      @Test
    public void dragAndDrop() throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
          driver.manage().window().maximize();
          //        WebElement acceptCookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
//        Thread.sleep(3000);
//        acceptCookies.click();
          Actions actions = new Actions(driver);
          //        for(int i = 0; i<5;i++){
//            actions.sendKeys(Keys.ARROW_DOWN).perform();
//        }
          WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
          WebElement orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));
          String actualMessage = BrowserUtils.getTextMethode(orangeBox);
          String expectedMessage = "... Or here.";
          Assert.assertEquals(actualMessage, expectedMessage);
          actions.dragAndDrop(draggable, orangeBox).perform();
          Thread.sleep(3000);
          orangeBox = driver.findElement(By.xpath("//div[@class='test2']"));
//          String actualAfterDragAndDrop = BrowserUtils.getTextMethode(orangeBox);
//          String expectedAfterDragAndDrop = "You did great!";
//          Assert.assertEquals(actualAfterDragAndDrop, expectedAfterDragAndDrop);

          String cssValue = orangeBox.getCssValue("background-color");
          String expectedCssValue = "rgba(238, 111, 11, 1)";
          Assert.assertEquals(cssValue,expectedCssValue);
      }



      @Test
    public void clickAndHold(){
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demos.telerik.com/kendo-ui/dragdrop/area");
          driver.manage().window().maximize();
          WebElement bluebox1 = driver.findElement(By.xpath("//div[@class='test1']"));
          String actualBoxMesage = BrowserUtils.getTextMethode(bluebox1);
          String expectedBlueBox = "Drag the small circle here ...";
          Assert.assertEquals(actualBoxMesage,expectedBlueBox);
          WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
          Actions actions = new Actions(driver);
          actions.clickAndHold(draggable).moveToElement(bluebox1).release().perform();
      }




        /*\
        1)Navigate to the website :"https://demoqa.com/droppable"
        2)Drag,' Drag me ' box and drop to drop box
        3)Validate the message is changed to "Dropped"
        4)Validate the css color is steel blue
         */
      @Test
    public void DragAndDropPractice() {
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.get("https://demoqa.com/droppable");
          WebElement dragButton = driver.findElement(By.xpath("//div[@id='draggable']"));
          WebElement dropButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]"));
          Actions actions = new Actions(driver);
          actions.dragAndDrop(dragButton,dropButton).perform();
          String actualMessage = BrowserUtils.getTextMethode(dropButton);
          String expectedMessage = "Dropped!";
          Assert.assertEquals(actualMessage,expectedMessage);
          WebElement dropButtonColor = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]"));
          String actualCssDropButtonColor = dropButtonColor.getCssValue("background-color");
          String expectedCssDropButtonColor = "rgba(70, 130, 180, 1)";
          Assert.assertEquals(actualCssDropButtonColor,expectedCssDropButtonColor);
      }



        /*
        1)Navigate to the website :"https://demoqa.com/droppable"
        2)Click Accept
        3)ClickAndHold notAccepted box and release to Drop box
        4)validate the background is still white and message is still Drop here
        5)ClickAndHold acceptable box and release to Drop box
        6)Validate the background is blue and message is dropped
         */
    @Test
       public void clickAndHoldPractice(){
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://demoqa.com/droppable");
         driver.manage().window().maximize();
         WebElement acceptButton = driver.findElement(By.xpath("//a[@id='droppableExample-tab-accept']"));
         acceptButton.click();
         WebElement notAcceptBox = driver.findElement(By.xpath("//div[@id='notAcceptable']"));
         WebElement dropHereBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]"));
         Actions actions = new Actions(driver);
         actions.dragAndDrop(notAcceptBox,dropHereBox).perform();
         WebElement colorDropHere = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]"));
         String actualDropHerColor = colorDropHere.getCssValue("background-color");
         String expectedDropHereColor = "rgba(0, 0, 0, 0)";
         Assert.assertEquals(actualDropHerColor, expectedDropHereColor);
         String actualBoxMessage = BrowserUtils.getTextMethode(dropHereBox);
         String expectedBoxMessage = "Drop here";
         Assert.assertEquals(actualBoxMessage,expectedBoxMessage);
         WebElement acceptableButton = driver.findElement(By.xpath("//div[@id='acceptable']"));
         actions.dragAndDrop(acceptableButton,dropHereBox).perform();
         WebElement colorDropHere1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]"));
         String actualDropHerColor1 = colorDropHere1.getCssValue("background-color");
         String expectedDropHereColor1 = "rgba(70, 130, 180, 1)";
         Assert.assertEquals(actualDropHerColor1,expectedDropHereColor1);
         String finalActualBoxMessage = BrowserUtils.getTextMethode(colorDropHere1);
         String expectedActualBoxMessage = "Dropped!";
         Assert.assertEquals(finalActualBoxMessage, expectedActualBoxMessage);

     }
     @Test
    public void moveByOffSET() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider = driver.findElement(By.xpath("//input"));
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(-30,0).perform();
     }



     @Test
    public void sliderShortCutO() throws InterruptedException {
         WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.get("https://the-internet.herokuapp.com/horizontal_slider");
         WebElement slider = driver.findElement(By.xpath("//input"));
         WebElement range = driver.findElement(By.xpath("//span[@id='range']"));
         String myrange = "3.5";
         while (!range.getText().trim().equals(myrange)) {
             Thread.sleep(1000);
             slider.sendKeys(Keys.ARROW_RIGHT);
         }
     }



       @Test
        public void MoveOffSetPractice(){
           WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();
           driver.get("http://www.techtorialacademy.com/");
           WebElement contactUs = driver.findElement(By.xpath("//div[@class=\"navigation hidden-xs\"]//a[.='Contact Us']"));
           Point location = contactUs.getLocation();
           int xCord = location.getX();
           int yCord = location.getY();
           Actions actions = new Actions(driver);
           actions.moveByOffset(xCord,yCord).click().perform();
/*
@Test
    public void MoveByOffSetPractice(){
        //TASK
        //By using move by off set and point class.
        //Click Contact Us

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement contactUs=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
        Point coordinatesOfContactUs=contactUs.getLocation();
        int xCoord=coordinatesOfContactUs.getX();
        int yCoord=coordinatesOfContactUs.getY();
        Actions actions = new Actions(driver);
        actions.moveByOffset(xCoord,yCoord).click().perform();
    }
 */
       }
    @Test
    public void MoveByOffSetPractice(){
        //TASK
        //By using move by off set and point class.
        //Click Contact Us
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.techtorialacademy.com/");
        WebElement contactUs=driver.findElement(By.xpath("//div[@class='navigation hidden-xs']//a[.='Contact Us']"));
        Point coordinatesOfContactUs=contactUs.getLocation();
        int xCoord=coordinatesOfContactUs.getX();
        int yCoord=coordinatesOfContactUs.getY();
        Actions actions = new Actions(driver);
        actions.moveByOffset(xCoord,yCoord).click().perform();
    }
}


