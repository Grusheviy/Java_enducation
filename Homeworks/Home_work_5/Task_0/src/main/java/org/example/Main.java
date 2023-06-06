package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        Созданем первые множества
        HashMap<Integer, String> firstSet = new HashMap<>();
        firstSet.put(1, "строка_1");
        firstSet.put(2, "строка_2");
        firstSet.put(3, "строка_3");
        firstSet.put(4, "строка_4");
        firstSet.put(5, "строка_5");
        firstSet.put(6, "строка_6");

        for (HashMap.Entry<Integer, String> entry : firstSet.entrySet()) {
            System.out.println("Первое множество: " + "Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        //        Добавляем "!" к первым значениям

//        for (HashMap.Entry<Integer, String> entry : firstSet.entrySet()) {
//            String value = entry.getValue();
//            entry.setValue(value + "!");
//        }

//        С использованием Merge
        firstSet.forEach((key, value) -> firstSet.merge(key, value, (v1, v2) -> v1 + "!"));


        System.out.println("");

        for (HashMap.Entry<Integer, String> entry : firstSet.entrySet()) {
            System.out.println("Обновленные множества: " + "Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        System.out.println("");

        // Создаем второе множество
        HashMap<Integer, String> secondSet = new HashMap<>();
        secondSet.put(2, "строка_7");
        secondSet.put(3, "строка_8");
        secondSet.put(4, "строка_9");
        secondSet.put(7, "строка_10");

        for (HashMap.Entry<Integer, String> entry : secondSet.entrySet()) {
            System.out.println("Вторые множества: " + "Key: " + entry.getKey() + "; Value: " + entry.getValue());
        }

        System.out.println("");

//        Объединяем множества если у них совпали ключи

//        for (HashMap.Entry<Integer, String> entry : secondSet.entrySet()) {
//            Integer key = entry.getKey();
//            if (firstSet.containsKey(key)) {
//                String value = entry.getValue();
//                String combinedValue = firstSet.get(key) + value;
//                System.out.println("Объединенные значения: " + "Key: " + key + "; Value: " + combinedValue);
//            }
//        }

//        C использованием Merge
        secondSet.forEach((key, value) -> {
            if (firstSet.containsKey(key)) {
                String combinedValue = firstSet.get(key) + value;
                System.out.println("Объединенные значения: " + "Key: " + key + "; Value: " + combinedValue);
            }
        });
    }
}