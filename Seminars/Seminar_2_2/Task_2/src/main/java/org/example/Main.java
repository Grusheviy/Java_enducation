package org.example;

public class Main {
    public static void main(String[] args){
        String input = "aaaabbbcdd";
        String compressedString = compressString(input);
        System.out.println(compressedString);
    }

    public static String compressString(String input) {

        StringBuilder compressed = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            if (nextChar == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }
        compressed.append(currentChar);

        return compressed.toString();
    }
}
