package com.techtorial;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static com.techtorial.Instructions.getInstructions;

public class WelcomePage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Techtorial sponsored vending machine!");
        System.out.println("What is your name?");

        String name = scanner.next();
        System.out.println("Nice to meet you, " + name);
        System.out.println("Please press 0 for available options...");

        int allOptions = getIntegerInput(scanner, new Integer[] {0});
        getInstructions(allOptions);

        scanner = new Scanner(System.in);
        System.out.println("Enter what you want to do: ");
        Products  product= new Products();
        switch (getIntegerInput(scanner, new Integer[] {1, 2, 3, 4, 5, 6, 7, 8})) {
            case 1:
                // method call for get product list
                product.getAllProducts();
                break;
            case 2:
                product.getAllInfo();

                break;
            case 3:

                product.getAllPrices();

                product.selectProduct();
                break;

            case 4:

                System.out.println("Please choose from available options");
                product.getAllProducts();

               // String productName1 =scanner.next();
              // product.getProductPrice();  // ----------------------------           Note
                //product.cancel();           // -------------------------------------- Note
//                System.out.println("would you like to continue? Yes/No");
//                scanner=new Scanner(System.in);
//                String cont = scanner.next();
//                if(cont.equalsIgnoreCase("yes")){
//                    getInstructions(allOptions);
//                }else {
//                    product.cancel();
//                }

                break;

            case 5:
                product.getAllPrices();
                break;

            case 6:
                System.out.println("What product price are you looking for?");
                System.out.println("Enter your minimum price");
                int startNum=scanner.nextInt();
                System.out.println("Enter your maximum price");
                int endNum=scanner.nextInt();
                break;

            case 7:
                product.cancel();
                break;

            case 8:

                product.buyAProduct();

                break;

        }

        System.out.println("Thanks for shopping with us!");

    }

    private static int getIntegerInput(Scanner scanner, Integer[] expected) {
        int allOptions = -1;
        for (int i = 1; i <= 3; i++) {
            scanner = new Scanner(System.in);
            int input;
            try {
                input = scanner.nextInt();

                if (!Arrays.asList(expected).contains(input)) {
                    throw new IOException();
                }
            } catch (Exception e) {
                if (i < 3) {
                    System.out.println("Please enter 0");
                    System.out.printf("You have %d more retries", 3 - i);
                    System.out.println();
                } else {
                    System.out.println("Sorry, try next time");
                    System.exit(1);
                }
                continue;
            }
            allOptions = input;
            break;
        }
        return allOptions;
    }
}





///*
// * This is your main page where the vending machine application is going to be triggered and
// * all inputs being accepted.
// */
//public class WelcomePage {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to Techtorial sponsored vending machine!");
//        System.out.println("What is your name?");
//
//        String name = scanner.next();
//        System.out.println("Nice to meet you, " + name);
//        System.out.println("Please press 0 for available options...");
//
//        int allOptions = getIntegerInput(scanner, new Integer[] {0});
//        getInstructions(allOptions);
//
//        scanner = new Scanner(System.in);
//        System.out.println("Enter what you want to do: ");
//        Products products = new Products(); //we create product object
//        switch (getIntegerInput(scanner, new Integer[] {1, 2, 3, 4, 5, 6, 7, 8})) {
//            case 1:
//                // method call for get product list
//                getAllProducts();  //added
//                break;
//
//            case 2:
//                getAllInfo();      //info about the products
//                break;
//
//            case 3:
//                getAllPrices();  //1st methode
//
//                selectProduct(); //2nd method
//                break;
//
//            case 4:
//                // get product price methode
//                System.out.println("What product price you ar looking for?");
//                String str = scanner.next();
//                products.getProductPrice(str);
//                Products.getProductPrice(str);
//                break;
//
//            case 5:
//                Products.getAllPrices();
//                break;
//
//            case 6:
//                break;
//
//            case 7:
//                break;
//
//            case 8:
//                break;
//        }
//
//
//        System.out.println("Thanks for shopping with us");
//
//    }
//
//    private static int getIntegerInput(Scanner scanner, Integer[] expected) {
//        int allOptions = -1;
//        for (int i = 1; i <= 3; i++) {
//            scanner = new Scanner(System.in);
//            int input;
//            try {
//                input = scanner.nextInt();
//
//                if (!Arrays.asList(expected).contains(input)) {
//                    throw new IOException();
//                }
//            } catch (Exception e) {
//                if (i < 3) {
//                    System.out.println("Please enter 0");
//                    System.out.printf("You have %d more retries", 3 - i);
//                    System.out.println();
//                } else {
//                    System.out.println("Sorry, try next time");
//                    System.exit(1);
//                }
//                continue;
//            }
//            allOptions = input;
//            break;
//        }
//        return allOptions;
//    }
//}
