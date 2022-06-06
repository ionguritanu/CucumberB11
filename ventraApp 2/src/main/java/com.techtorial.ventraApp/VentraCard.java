package com.techtorial.ventraApp;

import java.util.Random;

 /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */


public class VentraCard {

    private String phoneNumber;
    private int cardNumber;
    private String email;
    private String fullName;


// phoneNumber
    public String getPhoneNumber(){                    //creating the getter
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){    //creating the setter for phoneNumber
        this.phoneNumber=phoneNumber;
    }


// fullName instance
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


// email
    public String getEmail() {    //get Email upper or lower case ???
    return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


// cardNumber                                       ??? to check if I need to included right here cardNum methode
    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }



    public static VentraCard createCard(String fullName, String phoneNumber, String email){   // made static in class
//        if (fullName.equals(fullName) && phoneNumber.equals(phoneNumber)) {
//             = true;

    /*
    this method needs to return VentraCard according to the parameter
     */

    // return ventracard object
        return null;
    }

    public long createCardNumber(){
        /*
        this method needs to return the 16 digit card number
         */
        long number = (long) Math.floor(Math.random() * 9_000_000_000_000_000L) + 1_000_000_000_000_000L; //16

        // This methode needs to create random 16 number
        // put in the loop for 16 times and store it again
        // return long
        return number;


    }
}
