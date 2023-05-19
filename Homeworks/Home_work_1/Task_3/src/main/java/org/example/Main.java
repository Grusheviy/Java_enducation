package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division to zero!");
                    return;
                }
            }
            default -> {
                System.out.println("Error: Incorrect operation!");
                return;
            }
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}