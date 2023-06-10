package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MyHashSet {
    private ArrayList<Integer> set;

    public MyHashSet() {
        set = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }

    public String toString() {
        return set.toString();
    }

    public Integer getElementByIndex(int index) {
        if (index >= 0 && index < set.size()) {
            return set.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements to add to the set (enter 'done' to finish):");
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            try {
                Integer element = Integer.parseInt(input);
                mySet.add(element);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
            input = scanner.nextLine();
        }

        System.out.println("Set elements: " + mySet.toString());

        System.out.println("Enter the index to retrieve an element:");
        int index = scanner.nextInt();
        scanner.nextLine();
        try {
            Integer element = mySet.getElementByIndex(index);
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }

        scanner.close();
    }
}