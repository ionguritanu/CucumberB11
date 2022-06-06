package com.test.orangehrm.pages;

import Utils.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class AdminPage {

    public AdminPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "btnAdd")
    WebElement addButton;

    @FindBy(id = "systemUser_userType")
    WebElement userRoles;

    @FindBy(id = "systemUser_employeeName_empName")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

    @FindBy(name = "systemUser[status]")
    WebElement status;

    @FindBy(name = "systemUser[password]")
    WebElement password;

    @FindBy(name = "systemUser[confirmPassword]")
    WebElement confirmPassword;

    @FindBy(className = "addbutton")
    WebElement saveButton;

    @FindBy(xpath = "//tr//a[contains(@href,'saveSystemUser')]")
    List<WebElement> allNames;

    @FindBy(xpath = "//select[@name='searchSystemUser[userType]']")
    WebElement userRoleBox;

    @FindBy(id = "searchBtn")
    WebElement searchBox;

    @FindBy(xpath = "//tbody//tr/td[3]")
    List<WebElement> allTheRolesOnTheTAble;

    public void sendingAllInformationForEmployee(){
        addButton.click();
        BrowserUtils.selectBy(userRoles,"Admin","text");
        employeeName.sendKeys("Alice Duval");
        userName.sendKeys("IonGur3");
        BrowserUtils.selectBy(status,"0","value");
        password.sendKeys("iong1234");
        confirmPassword.sendKeys("iong1234");
        saveButton.click();
    }


    public void selectUserRoles(String roleName, WebDriver driver){
    BrowserUtils.selectBy(userRoleBox,roleName, "text");
        BrowserUtils.ClickWithJS(driver, searchBox);
    }

    public boolean validateRoleText(String rolename){
        for(WebElement role : allTheRolesOnTheTAble){
            if(!role.getText().trim().equals(rolename)){
                return false;
            }
        }
        return true;
    }
}




