package com.ekids.week1;

import java.util.Scanner;

public class MobReaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mob name: ");
        if (scanner.hasNextLine()) {
            String mob = scanner.nextLine().trim();
            // Todo: Your solution goes here:

        } else {
            System.out.println("Please enter a valid mob name.");
        }
        scanner.close();
    }
}

