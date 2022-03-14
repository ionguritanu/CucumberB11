package pages.weborderpages;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateGroupOrderPage {
   public CreateGroupOrderPage(WebDriver driver){
      PageFactory.initElements(driver, this);
   }

   @FindBy(id ="InviteNote")
   private WebElement inviteNote;

   @FindBy(id = "InviteList")
   private WebElement inviteList;

   @FindBy(id ="addressPreview")
   private WebElement officeAddress;

   @FindBy(xpath = "//button[.='Create Group Order']")
   private WebElement createGroupOrderButton;

   @FindBy(xpath = "//h1")
   private WebElement headerTest;

   @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
   private WebElement totalParticipants;

   public void sendInviteNotes(String invitationNote){
      this.inviteNote.sendKeys(invitationNote);
   }
   public void sendInviteList(String inviteLIst){
      this.inviteList.sendKeys(inviteLIst);
   }
   public String getOfficeAddress(){
      return BrowserUtils.getTextMethode(officeAddress);
   }
   public void clickCreateGroupButton(){
      this.createGroupOrderButton.click();
   }
   public String getHeaderText() throws InterruptedException {
      Thread.sleep(1000);
      return BrowserUtils.getTextMethode(headerTest);
   }
   public Integer getParticipantsNumber(){
      return Integer.parseInt(BrowserUtils.getTextMethode(totalParticipants));
   }

}
