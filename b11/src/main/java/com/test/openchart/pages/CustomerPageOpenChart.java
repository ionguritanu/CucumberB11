package com.test.openchart.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPageOpenChart {
        public CustomerPageOpenChart(WebDriver driver){
            PageFactory.initElements(driver,this);
        }

     @FindBy(xpath = "//a[@href='#collapse33']")
    WebElement customers;

    @FindBy(xpath = "//a[.='Customers']")
    WebElement customersCustomers;

    @FindBy(xpath = "//i[@class=\"fa fa-plus\"]")
    WebElement plusButton;

    @FindBy(xpath = "//input[@name=\"firstname\"]")
    WebElement firstName;

    @FindBy(xpath = "//input[@name=\"lastname\"]")
    WebElement lastName;

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//input[@name=\"telephone\"]")
    WebElement telephone;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//input[@name=\"confirm\"]")
    WebElement confirmPassword;

    @FindBy(xpath = "//i[@class='fa fa-save']")
    WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/text()")
    WebElement finalMessage;

//    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
//    WebElement message;


    public void Customers(){
        customers.click();
    }
    public void customersCustomers(){
        customersCustomers.click();
    }
    public void addingNewCustomer(String first, String last, String mail, String phone, String pass, String confirmPass) throws InterruptedException {
        plusButton.click();
        Thread.sleep(2000);
        this.firstName.sendKeys(first);
        this.lastName.sendKeys(last);
        this.email.sendKeys(mail);
        this.telephone.sendKeys(phone);
        this.password.sendKeys(pass);
        this.confirmPassword.sendKeys(confirmPass);
        saveButton.click();
    }


    public String validationMessage(){
        return finalMessage.getText().trim();
    }
}
