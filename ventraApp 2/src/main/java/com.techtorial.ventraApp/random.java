package com.techtorial.ventraApp;

public class random {
    public static void main(String[] args) {
for (int p=0 ;p<16;p++) {

    long number = (long) Math.floor(Math.random() * 9_000_000_000_000_000L) + 1_000_000_000_000_000L;

    System.out.println(number);


}
    }
}
