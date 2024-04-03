package com.rollingdice;

import java.util.Random;
import java.util.Scanner;

public class RollingDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String usage;

        while (max == 0) {
            // Ask user for maximum number of the dice
            System.out.println("Enter the maximum number of the dice: ");
            max = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after nextInt()
        }

        while (true) {
            // Ask user if they want to roll the dice
            System.out.println("Do you want to roll the dice? (y/n)");
            usage = scanner.nextLine();
            if (!usage.equalsIgnoreCase("y")) {
                System.out.println("Exiting program.");
                break; // Exit the program if user chooses not to roll the dice
            }

            Random random = new Random();

            // Roll the dice
            int result = random.nextInt(max) + 1;
            System.out.println("Rolling the dice...");
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}
