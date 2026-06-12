package com.ekids.week1;

import java.util.Scanner;

public class MobReaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a mob name: ");
        if (scanner.hasNextLine()) {
            String mob = scanner.nextLine().trim();

            if (mob.equals("creeper")) System.out.print("run");
            else if (mob.equals("zombie")) System.out.print("attack");
            else System.out.print("stay");

        } else {
            System.out.println("Please enter a valid mob name.");
        }
        scanner.close();
    }
}

