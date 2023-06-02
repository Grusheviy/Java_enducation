package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные пользователя в формате ФИО, возраст, пол (через пробелы) или Q для выхода: ");
        ArrayList<String> f_name = new ArrayList<>();
        ArrayList<String> s_name = new ArrayList<>();
        ArrayList<String> l_name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        while (true){
            String in = scanner.nextLine();
            if (in.toLowerCase().equals("q")) break;
            String[] str = in.split(" ");
            id.add(age.size());
            f_name.add(str[0]);
            s_name.add(str[1]);
            l_name.add(str[2]);
            age.add(Integer.valueOf(str[3]));
            gender.add(str[4].contains("м"));

        }

//        System.out.println(id);

// Сортировка по возрасту
//        for (int i = 0; i < f_name.size() - 1; i++){
//            int max = age.get(id.get(i));
//            int index = i;
//            for (int j = i + 1; j < f_name.size(); j++){
//                if (age.get(id.get(j)) < max){
//                    index = j;
//                    max = age.get(id.get(j));
//                }
//            }
//
//            if (index != i){
//               int tmp = id.get(i);
//               id.set(i, id.get(index));
//               id.set(index, tmp);
//
//            }
//        }
//        System.out.println(id);

        // Сортировка по полу и возрасту
        for (int i = 0; i < f_name.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < f_name.size(); j++) {
                if (gender.get(id.get(j)).compareTo(gender.get(id.get(index))) < 0 ||
                        (gender.get(id.get(j)).compareTo(gender.get(id.get(index))) == 0 &&
                                age.get(id.get(j)) < age.get(id.get(index)))) {
                    index = j;
                }
            }

            if (index != i) {
                int tmp = id.get(i);
                id.set(i, id.get(index));
                id.set(index, tmp);
            }
        }

        for (int i = 0; i < age.size(); i++) {
            String genderInitial = gender.get(id.get(i)).equals(true) ? "М" : "Ж";
            System.out.println(f_name.get(id.get(i)) + " " + s_name.get(id.get(i)).toUpperCase().charAt(0) + "." + l_name.get(id.get(i)).toUpperCase().charAt(0) + ". " + age.get(id.get(i)) + " " + genderInitial);

        }

    }
}