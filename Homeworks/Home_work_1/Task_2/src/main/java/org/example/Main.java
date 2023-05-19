package org.example;


public class Main {
    public static void main(String[] args) {

        System.out.println("Simple numbers from 1 to 1000 \n");

        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int j) {
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }

        return true;
    }
}


