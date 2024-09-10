package org.ethz.day1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    
    public static void main(String[] args) {
        //Exercise 1.1
        int x = 2;
        for (; x < 10; x += 2) {
            System.out.println(x);
            }

        //Better version of for loop
        //Output is 2, 4, 6, 8

        //Exercise 1.2
        //Block 1: Output is a = 0, b = -1, i = 1.
        //Block 2: No output because (i < 0) is false from the beginning.

        //Exercise 1.3
        
        double sum = 0.0;
        for (int y = 2; y < 10; y++){
            sum += y;
        }
            
        System.out.println("Sum is: " + sum);
    
        //Output Sum is: 44.0     
        
        //Exercise 1.4
        final double PI = 3.14159;
        double radius = 5.5;

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Radius: " + radius + "Circumference: " + circumference + "Area: " + area);

        //Exercise 1.5

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        scanner.close();

        int result = 1;

        while (num != 0) {
            result *= num % 10;
            num /= 10;
        }

        System.out.println("Product of digits: " + result);

        //Exercise 1.6

        Random random = new Random();
        int secretNumber = random.nextInt(1000);
        int guess;
        int tries = 0;
        scanner = new Scanner(System.in);
        scanner.close();

        System.out.print("Enter your Number (0-1000): ");
            secretNumber = scanner.nextInt();

        do {
            
            guess = random.nextInt();
            tries++;

        } while (guess != secretNumber);

        System.out.println("Congratulations! You guessed the number in " + tries + " tries!");
    
    //Exercise 1.7
    System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();
        double cost;

        if (weight > 0 && weight <= 3) {
            cost = 1.5;
        } else if (weight > 3 && weight <= 5) {
            cost = 2.5;
        } else if (weight > 5 && weight <= 10) {
            cost = 4.2;
        } else {
            System.out.println("Invalid weight.");
            return;
        }

        System.out.println("Shipping cost: $" + cost);
    
        //Exercise 1.8
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("The " + N + "th Fibonacci number is: " + c);
    
        //Exercise 1.9

        List<Integer> perfIntegers = new ArrayList<>();
        for (int numb = 1; numb < 100000; numb++) {
            int summ = 0;
            for (int i = 1; i <= numb / 2; i++) {
                if (numb % i == 0) {
                    summ += i;
                }
            }
            if (summ == numb) {
                perfIntegers.add(numb);
            }
        }
        System.out.println(perfIntegers + " are perfect numbers.");
    }

}
