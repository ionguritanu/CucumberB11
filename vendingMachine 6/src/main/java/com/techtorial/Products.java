package com.techtorial;
import java.util.Scanner;
public class Products {

    /*
     * Please add more vending machine features
     * - Buy a product
     * - Search for a product
     * - Get list of products
     */

    //1.create a methode to display all products in vending machine
    //2.create a name to display product name, price and inventory at the same time
    //3. I want to see products less than 50 and more than 20$
        //-We should create a methode that takes two parameters for price range and shows
        //-all the products in this range

    private static String[] products  = new String[] {"Monitor", "Mouse", "Keyboard", "USB cable", "Charger", "Mouse pad"};
    private static int[]    prices    = new int[] {100, 70, 89, 17, 99, 5};
    private static int[]    inventory = new int[] {4, 10, 5, 10, 5, 7};
    public static Scanner scanner = new Scanner(System.in);


    public static String[] getAllProducts() {              //  1st methode
         System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j]);
        }
        return products;
    }

    public static String[] getAllPrices() {                //
        // System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]);
        }
        return products;
    }

    public static String[] getAllInfo() {
        //System.err.println("Product: price");
        for (int j = 0; j < products.length; j++) {
            System.out.println(products[j] + ": $" + prices[j]+ " inventory stock:" + inventory[j]);
        }
        return products;
    }


    public static int getProductPrice(String productName) {
        int productPrice=0;
        for (int i = 0; i < products.length; i++) {
            if (productName.equalsIgnoreCase(products[i])) {
                productPrice=prices[i];
                System.out.println(productPrice+ " $ is the price for " + productName);
            }
        }
        return productPrice;
    }



    public static void selectProduct() {
        System.out.println("Please choose from the list:");
        String productName = scanner.next();
        for (int i = 0; i < products.length; i++) {
            if (productName.equalsIgnoreCase(products[i])) {
                System.out.println("Price for selected item is " + prices[i]);
                if (inventory[i] > 0) {
                    System.out.println("Available in stock");
                }
            }
        }

    }

    public static void priceRange(int startNum, int endNum){
        for(int i=0; i<prices.length; i++){
            if(prices[i]>=startNum && prices[i]<=endNum){
                System.out.println("Pick out from "+ products[i] + " " + prices[i]);
            }
        }

    }

    public static void buyAProduct() {
        System.out.println("What product out of available list would you like to buy? ");
        String productName= scanner.next();
        // System.out.println("please enter the money");
        int productPrice=0;
        int money=0;
        int inventoryIndex=0;
        for(int i=0; i<products.length; i++) {
            if (productName.equalsIgnoreCase(products[i])) {
                 System.out.println(prices[i]);
                productPrice = prices[i];
                System.out.println("The price is " + productPrice);
                money = scanner.nextInt();
                inventoryIndex=i;
            }
        }

        if(productPrice==money){
            System.out.println("Enjoy it.");
            inventory[inventoryIndex]-=1;
            System.out.println(productName + " are  " + inventory[inventoryIndex] + " " +
                    "are still available in the stock");
        }else if(money>productPrice){
            int change = money-productPrice;
            System.out.println(change + " is your change. Enjoy it.");
            inventory[inventoryIndex]-=1;
            System.out.println(productName + " are " + inventory[inventoryIndex] +
                    " are still available in the stock");
        }else{
            while(money<productPrice){
                System.out.println(money + " is not enough, please add more.");
                int moneyAdd = scanner.nextInt();
                money+=moneyAdd;
                if(productPrice==money){
                    System.out.println("Enjoy it");
                }else if(money>productPrice){
                    int change = money-productPrice;
                    System.out.println(change + " is your change. Enjoy it.");

                    System.out.println(productName + " are " + inventory[inventoryIndex]
                            + " are still available in the stock");
                }
            }

        }

    }

    public static void cancel() {
        System.out.println("Have a wonderful day!");
        return;
    }
}

