package com.ekids.week1;

import java.util.Scanner;

public class EvenChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            // Todo: Your solution goes here:

        } else {
            System.out.println("Please enter a valid integer.");
        }
        scanner.close();
    }
}

