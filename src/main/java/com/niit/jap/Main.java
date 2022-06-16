package com.niit.jap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NegativeNumberChecker negativeNumberChecker = new NegativeNumberChecker();
        System.out.println("Please enter a number to check: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isNegativeNumber = negativeNumberChecker.isNegativeNumber(number);
        System.out.println("Is " + number + " a negative number? " + isNegativeNumber);
        scanner.close();
    }
}