package com.techtorial;

public class Instructions {
    /*
     * Vending machine options are:
     * 1 - List all items/products, names of products
     * 2 - Get item/product info (details, availability), price and inventory number
     * 3 - Select a product
     * 4 - Get item/product price
     * 5 - List all prices
     * 6 - Set price range
     * 7 - Exit
     * 8 - Buy an item
     */

    public static void getInstructions(int input) {

        switch (input) {
            case 0:
                System.out.println("Press 1 for : List all items/products, names of products");
                System.out.println("Press 2 for : Get item/product info (details, availability), price and inventory number");
                System.out.println("Press 3 for : Select a product");
                System.out.println("Press 4 for : Get item/product price");
                System.out.println("Press 5 for : List all prices");
                System.out.println("Press 6 for : Set price range");
                System.out.println("Press 7 for : Exit");
                System.out.println("Press 8 for : Buy an item");


            default:
                System.out.println("Please enter 0");
        }
    }

}
