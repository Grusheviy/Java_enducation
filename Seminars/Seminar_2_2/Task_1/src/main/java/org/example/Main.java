package org.example;

//int n = Integer.toBinaryString(new Random().nextInt(2000)).length(); // поиск старшего бита

public class Main {
    public static void main(String[] args) {

        int N = 10;
        char c1 = 'A';
        char c2 = 'B';

        String result = chars(N, c1, c2);
        System.out.println(result);
    }

    public static String chars(int N, char c1, char c2) {
        StringBuilder sb = new StringBuilder(N);
        char currChar = c1;

        for (int i = 0; i < N; i++) {
            sb.append(currChar);
            currChar = (currChar == c1) ? c2 : c1; // Переключаемся между c1 и c2
        }

        return sb.toString();
    }
}