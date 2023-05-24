//К калькулятору из предыдущего ДЗ добавить логирование

package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.log(Level.INFO, "Input first number: ");
        double num1 = scanner.nextDouble();

        logger.log(Level.INFO,"Input second number: ");
        double num2 = scanner.nextDouble();

        logger.log(Level.INFO,"Choose operation (+, -, *, /): ");
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
                    logger.log(Level.SEVERE,"Error: Division to zero!");
                    return;
                }
            }
            default -> {
                logger.log(Level.SEVERE,"Error: Incorrect operation!");
                return;
            }
        }

        logger.log(Level.INFO,"Result: " + result);

        scanner.close();
    }
}