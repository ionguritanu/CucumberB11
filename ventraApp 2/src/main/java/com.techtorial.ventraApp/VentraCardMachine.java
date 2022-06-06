package com.techtorial.ventraApp;

import java.util.ArrayList;

public class VentraCardMachine {



    private String location;
    private ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location){
        this.location=location;
        this.allCards=new ArrayList<VentraCard>();
    }

    public boolean addCard(VentraCard card){

        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */

        //added in class
        // check if the parameter object is in the card list if not add in arraylist allcards list
        // and return true otherwise return falls;

        return false;
    }

    public void printCardNumbers(ArrayList <VentraCard> cards){
        //aded in classs

        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    }

    public boolean updateCard(long oldCardNumber, VentraCard newCard){
        //for ( VentraCard card : cards){         ///
            //System.out.println();


        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.
        */
        //we will replace current ventra card with new ventra card
        return false;
    }



    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}
