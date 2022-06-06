package com.test.orangehrm.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIMPage {
    public PIMPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='employeeId']")
    WebElement employeeId;

    @FindBy(xpath = "//input[@id='photofile']")
    WebElement chooseSFile;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveBtn;

    @FindBy(name = "personal[txtEmpFirstName]")
    WebElement validationName;

    @FindBy(name = "personal[txtEmpLastName]")
    WebElement validationLastName;

    @FindBy(name = "personal[txtEmployeeId]")
    WebElement validationEmployeeId;

//added GH
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement editButton;

    @FindBy(xpath = "//input[@id='personal_optGender_1']")
    WebElement maleButton;

    @FindBy(id ="personal_cmbNation")
    WebElement nationality;

    @FindBy(id = "personal_cmbMarital")
    WebElement maritualStatus;

    @FindBy(name = "personal[DOB]")
    WebElement dob;




    public void addEmployeeForPIM(String name, String lastName, String employeeID, String uploadFile) throws InterruptedException {
        this.addButton.click();
        this.firstName.sendKeys(name);
        this.lastName.sendKeys(lastName);
        this.employeeId.clear();
        this.employeeId.sendKeys(employeeID);
        this.chooseSFile.sendKeys(uploadFile);
        Thread.sleep(3000);
        this.saveBtn.click();
        Thread.sleep(1000);
    }

    public String validateFirstName(){
        return validationName.getAttribute("value");
    }

   public String validateLastName(){
        return  validationLastName.getAttribute("value");
   }

   public boolean validateEmployeeId(String employeeId){
        return validationEmployeeId.getAttribute("value").endsWith(employeeId);
   }

    public void editPersonalDetails(String nation,String dateOfBirth,String maritualStatus){
        editButton.click();
        maleButton.click();
        BrowserUtils.selectBy(nationality,nation,"text");
        this.dob.clear();
        this.dob.sendKeys(dateOfBirth);
        BrowserUtils.selectBy(this.maritualStatus,maritualStatus,"text");
        saveBtn.click();
    }

    public String validateTheNationality(){
        Select select = new Select(nationality);
        return select.getFirstSelectedOption().getText().trim();
    }

}




//    public PIMPage(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//
//    @FindBy(xpath = "//a[.='PIM']")
//    WebElement pimButton;
//
//    @FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
//    WebElement addEmployee;
//
//    @FindBy(xpath = "//input[@name='firstName']")
//    WebElement firstName;
//
//    @FindBy(xpath = "//input[@name='firstName']")
//    WebElement lastName;
//
//    @FindBy(xpath = "//input[@name='middleName']")
//    WebElement middleName;
//
//    @FindBy(xpath = "name=\"employeeId\"")
//    WebElement employeeId;
//
//    @FindBy(xpath = "//input[@name='photofile']")
//    WebElement photo;
//
//    @FindBy(xpath = "//input[@value='Save']")
//    WebElement saveButton;
//
//    @FindBy()
//    WebElement validationName;
//
//    @FindBy()
//    WebElement validationLastName;
//
//    @FindBy()
//    WebElement validationEmployeeId;
//
//    @FindBy(xpath = "//input[@id='personal_optGender_1']")
//    WebElement gender;
//
//    @FindBy(xpath = "//select[@name='personal[cmbNation]']")
//    WebElement nationality;
//
//    @FindBy(xpath = "//select[@name=\"personal[cmbMarital]\"]")
//    WebElement maritalStatus;
//
////   @FindBy(xpath = "//input[@id='personal_DOB']");
////   WebElement dob;
//
//
//
//    public void PimInfoForEmployee(String name, String lastName, String employee,String upload) throws InterruptedException {
//        pimButton.click();
//        Thread.sleep(1000);
//        addEmployee.click();
//        this.firstName.sendKeys(name);
//        this.lastName.sendKeys(lastName);
//        this.employeeId.sendKeys(employee);
//        this.photo.sendKeys(upload);
//        saveButton.click();
//    }
//
////    public static String validateFirstName(){
////        return validationName.getAttribute("value");
////    }
//    public String validateLastName(){
//        return validationLastName.getAttribute("value");
//    }
//    public boolean employeeId(String employeeId){
//        return validationEmployeeId.getAttribute("value").endsWith(employeeId);
//    }
//
//    public void infoPersonalDetails(){
//        gender.sendKeys();


