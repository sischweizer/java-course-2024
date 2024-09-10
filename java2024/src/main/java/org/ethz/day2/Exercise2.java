package org.ethz.day2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Unicode of " + ch + " is: " + Integer.toHexString((int) ch));
        scanner.close();

        
    }
        
}

