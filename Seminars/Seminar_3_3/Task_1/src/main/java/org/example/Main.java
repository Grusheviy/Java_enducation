package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList numbers = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = (int) (Math.random() * 100);
//            numbers.add(randomNumber);
//        }
//            System.out.println(numbers);
//        }
//    }

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("123");
        list.add("Programming");
        list.add("456");
        list.add("Language");
        list.add("789");

        System.out.println("Исходный список: " + list);

        list.removeIf();

        System.out.println("Список после удаления целых чисел: " + list);
    }
}