package com.repetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do I say? ");
            String WTS = scanner.nextLine();

            System.out.println("You want me to say: " + WTS + " " + "y/n");
            String confirm_WTS = scanner.nextLine();
            if (!confirm_WTS.equals("y")) {
                break;
            }

            while (true) {
                System.out.println("How many times do I say: " + WTS);
                int T = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                System.out.println("You want me to say: " + WTS + " " + T + " times y/n");
                String confirm_T = scanner.nextLine();
                if (!confirm_T.equals("y")) {
                    break;
                }

                displayResult(WTS, T);
            }

            System.out.println("Do you want to continue? (y/n)");
            String continueChoice = scanner.nextLine();
            if (!continueChoice.equals("y")) {
                break;
            }
        }

        scanner.close();
    }
    public static void displayResult(String WTS, int T) {
        for (int i = 0; i < T; i++) {
                System.out.println(i + 1 + " " + WTS);
                if (i >= T) {
                    break;
                }
        }
    }
}
