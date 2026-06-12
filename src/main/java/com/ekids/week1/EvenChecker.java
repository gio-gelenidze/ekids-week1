package com.ekids.week1;

import java.util.Scanner;

public class EvenChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n % 2 == 0) System.out.print("even");
            else System.out.print("odd");

        } else {
            System.out.println("Please enter a valid integer.");
        }
        scanner.close();
    }
}

