package RecapSelenium;

public class InterviewQuestions {
    /*


   1. What are the advantages and disadvantages of Selenium?
      Advantage: *free open source
                 *it supports multiple languages(java, c#, c++, )
                 *big community
                 *it supports multiple browsers
      Disadvantages: *you can't automate captcha, pictures
                     *there's no direct call for the error report (call center)
                     *it only automates the web applications
                     *it doesn't have any system to generate report, so we use TestNG report system.

     2. What type of testing can you automate with Selenium?
                     *smoke
                     *regression
                     *functional test positive/negative

     3. What are the test types that do not automate with Selenium?
                     *performance testing
                     *manual testing(captcha)
                     *non-Functional(performance, stress, load)
                     *load testing
                     *stress testing

      4. What is locator and what are the locator types?         ***********
        Locator is a way to find the elements from DOM(development page).
                     *id
                     *classNAme
                     *name
                     *xPath
                     *LinkText
                     *PartialLinkText
                     *CSS

     5. How do you handle dynamic elements ? CVS***
        In mmy project, I faced many dynamic elements and I s=used different ways to handle with
        * I use parent-child relationship to locate elements
        * I use special elements types like (following-siblings, preceding - siblings, and , or , contains )
          I would little give information
        * I went with different attributes witch are not dynamics

      6. Difference between Driver.get() and driver.navigate.to()?
         * NavigateTo() - it doesn't web elements page to be loaded
                        - it has methods() -back()
                                           - refresh()
                                           - forward()
                                           - to()
         * Get() - it will all the web elements in the web lass to be loaded

       7. Difference driver. close and driver.quiet?
          close() it specifically it close the window that you are currently working(where driver is pointing)
          quite() it closes all the windows  (browsers)

       8. What is xPath? Can you tell me about types of xPtah?
          Witch one do you use in your project?

          xPath is a way to find the locations of  the elements on the webpage by using HTML structure.
          There are two types of xPath:
                    1.relative: it directly focuses on the child
                    2.absolute: it goes all the way from parent to child step by step
          In my project I use mostly relative xPath because it directs on the child that I need to locate.

        9. What is the difference between Absolute and Relative xPAth:
           Absolute xPath: it goes from parent to child
                           it has single slash for the path
                           syntax is different
           Relative xPath:  it goes directly to child
                           it has // slash for the path
                           syntax is different

        10. How do you handle static drop down menus?
            In my project I 'm handling drop in different ways.
            * I would check the location:
               - if it has the location has SELECT tag --> I use SELECT CLASS (Select select = new Select(WebElement))
               - if the location doesn't have select class tag -> I use locators to locate my elements.(sendKeys)
               - I can also use the Action Class to hoverOver my element(moveToElement)

         11. What are the methods of select?
             Select class is very useful in my project. To be able we use Select Class, element must have Select tag.
              I can locate the elements with this select methods:
              * selectByVisibleText()
              * selectByIndex()
              * selectByValue()

          12. What kind of exceptions did you face in Selenium?
              -noSuchElementExceptions
              - nullPointException
              - staleElementException
              - elementIsNotIntereactibel
              - noSuchFrameException
              - noSuchWindowException
              - AlertUnhandledException

          13. In what condition do you gwt StaelElementException? How do you handle it?
              In my projectI had hard time with StaleElementException
              *once the element is not in the DOM anymore
              * once you navigate to another page and come back element need little time to be loaded
              -> I can handle this exception eighther putting some time to be updated (Thread.sleep())
              -> I reinitialize my element before I do  my action on it
              -> you can also refresh the page

           14. How do you handle alerts?
               There are different types of alert I faced in my framework.
               -Operation System Alert: I cannot handle it directly. I need to use the ROBOT class
               - HTML alerts: I just need to find element and click on it .(close)
               - JAVASCRIPT Alert(pop-ups)-> I handle this alert with Alert Class(RemoteAlertClass)
                  Alert alert = driver.switchTo().Alert();

            15. Fot the Alert Interface what kind of methods do you know?
                First of all, Alert is an Interface but the methods are coming from RemoteAlertClass
                We have 4 methods of AlertClass:
                Alert alert = driver.switchTo.Alert();
                alert.Accept()- clicks OK button
                alert.Dismiss() - click Cancel Button
                alert.GetText() - gets the text from pop-up
                alert.SendKeys() - sends keys to pop-up

            16. What do you know about iframe? Can you tell me about the type that you used before and how
                do you handle the iframe in Selenium?

                Here is the scenario : we have a website and I would like to get the text of the price from
                products. All xpath is correct and there is no problem with attribute as well. There is no problem
                with switching the window. But I cannt get the price of the product.
                What do you think the reason could be?


                The reason could be the  Iframe , so basically I would go to the website and chceck the HTML
                has an iframe tag or not by typing (//iframe or frame). If there is frame on the HTML, I would
                definely check that the element I am looking for is not under the iframe.

                I can deal with element by switching my driver:
                driver.switchTo.frame();
                If you want I can give yu more details about others methods for iframe like;
                driver.switchTo.ParentFrame(). --goes to parent iframe
                driver.switchTo.defaultContent() - goes to main HTML

            17. What do I know about Action class?
               Action Class is basically my functionality of my mouse and keyboard.
               I can say it's really useful in my project to handle my elements . Some important methods

               Actions actions = new Actions(driver);
               actions.
               Action Class have:
                  *DoubleClick
                  *SendKeys
                  *ContextClick() -> right click
                  *ClickAndHold.realise
                  *MoveToElements() --hover over
                  *CLick
                  *MoveByOfSet
                  *Perform
                  Note:You must put perform at the end to do any action methode you call

                KeyBoard:
                   * Keys.Enter/Return
                   * Keys. Arrow-Up, Arrow-Down, Arrow-Right. Arrow-Left

             18. What is difference between findElement and findElements?

                *findElement
                  -it return single web element
                  - once it fails, it throws  noSuchElement exceptions

                *findElements
                  -it return list web element
                  - once it fails, it throws  empty list of array

              19. What are the driver and webElelemnt methode?
                 Driver methode:
                 -get
                 -navigate
                 -getTitle
                 -getPageSourse
                 -quite
                 -close
                 -manage

                 WebElements methods:
                 -sendKeys
                 -getText
                 -clear
                 -submit
                 -is Displayed
                 -getAttribute
                 -getCssValue

            20. What is difference between check box and radioButton?
                Check box: you can click multiple boxes.
                Radio button: you can choose  only one.

             21. Differences between isDisplayed, isSelected, isEnable?
                   //All of them returns boolean
                   *isDisplayed - it displays  the elements it is visible or not
                   *isSelected  - the element is selected or not
                   *isEnable - it checks the element is enabled or not(I use it to click the element)

              22. How do you switch the multiple windows?
                  I can use driver.getWindowHandle and driver.WindowHandles method to switch my window
                  We use Set to store our page id.(unique)
                  driver.switchTo().window(id);
                  public static void switchByTitle(WebDriver driver, String title) {
                  Set<String> allPagesId = driver.getWindowHandles();
                  for (String id : allPagesId) {
                  driver.switchTo().window(id);
                  if (driver.getTitle().contains(title)) {
                  break;
                   }

               23. How do you scroll down the page from Web Browser?
                   I would use JavaScript with SCROLLINTOVIEW and Point Class(show off answer)
                   Point point = new Point()
                   point.getX() -- coordination of X
                   point.getY() -- coordination of Y
                   MoveByOffSet(x,y)

                24. How do you download and upload file?
                    *Find the element that triggers upload window(choose file)
                    * find the path of the file you want to upload
                    * driver.findElement(chooseButton).sendKeys(Location of the file)

                 25. What is the difference between Assert and SoftAssert?
                     To be honest they have same logic in therms of validation, but there is couple differences.
                    Assert is a class that has some methods to validate with actual and expected data.
                    *When it fails it throws an exceptions and stop execution

                    SoftAssert
                    When it fails is not throwing  an exceptions and keeps execution of next code.
                    **To be able to activate yuo should call softAssert.assertAll methode
                      Softassert softassert = new Softassert();

                  26. Can you tell me about singleton? Have you ever use it in you project?
                      First af all , I appreciate for this question since I love singleton because in the past once I was working on my driver,
                      I was getting lots of NullPointer exceptions.
                      But with the help of singleton

                      How do I create Singleton Design pattern is:
                      Encapsulation:
                      * I need to have private WebDriver
                      * I need to have private Constructor (because I do not want anyone to create an object)
                      * I create  public methode to be called nby another class
                      * I use if condition like(if driver == null and initialze my driver) and retutn it

                  27. Can you tell me about how you provide picture since you find bug?
                      In my project I have good implementation to find the bug, it means once my code fails , my system takes screeShoot.

                  28. Do you know about DataProvider?
                      What do you do with same test with different scenario?
                      DataProvider is a way to run or execute different set of data for different test.
                      @DataProvider(name="test")
                      @Test(dataProvider = "test")

                  29. What do you know about wait time? Can you tell me about implicite and explicit way?
                      Implicit wait: is a way witch waits for a specific time while locating the elements
                      Explicit wait : is a way witch applies to a particular webElement until the expected

                      When it does not find elements at certain time it throws NoSuchElementException

                  30.  We have different customers for specific website login. I would like to test our all customers'
                       login functionality is working or not?

                       DataProvider: You should talk how it works.


     */

}

