package org.ethz.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Task 1.
        printUnicode(scanner);
    
        // Task 3.
        printSortedCities(scanner);

        // Task 6.
        checkPassword(scanner);

        // Task 7.
        processScores(scanner);
    }

    public static void printUnicode(Scanner scanner) {
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Unicode of " + ch + " is: " + Integer.toHexString((int) ch));
    }

    public static void printSortedCities(Scanner scanner) {
        String[] cities = new String[3];
        System.out.print("Enter the first city: ");
        cities[0] = scanner.next();
        System.out.print("Enter the second city: ");
        cities[1] = scanner.next();
        System.out.print("Enter the third city: ");
        cities[2] = scanner.next();

        Arrays.sort(cities);
        System.out.println("Cities in ascending order: " + Arrays.toString(cities));
    }

    public static void checkPassword(Scanner scanner) {
        System.out.print("Enter a password: ");
        String password = scanner.next();
        boolean isValidPassword = true;
        boolean hasDigit = false;

        if (password.length() < 8) {
            isValidPassword = false;
        }
        else if (password.contains(".")) {
            isValidPassword = false;
        }
        
        //with the help of stackoverflow:
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit == false) {
            isValidPassword = false;
        }

        if (isValidPassword == true) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
    }

    public static void processScores(Scanner scanner) {
        int[] scores = new int[100];
        int count = 0;
        int sum = 0;
        int score;

        System.out.println("Enter scores (negative number to stop): ");
        while (count < 100) {
            score = scanner.nextInt();
            if(score <= 0){
                break;
            }
        
            scores[count++] = score;
            sum += score;
        }

        if (count > 0) {
            double average = sum / (double) count;
            int aboveOrEqual = 0, below = 0;
            for (int i = 0; i < count; i++) {
                if (scores[i] >= average) {
                    aboveOrEqual++;
                } else {
                    below++;
                }
            }
            System.out.println("Average: " + average);
            System.out.println("Scores above or equal average: " + aboveOrEqual);
            System.out.println("Scores under average: " + below);
        } else {
            System.out.println("No scores entered.");
        }
    }

}


