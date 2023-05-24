//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации вывести в консоль.

package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};

        System.out.println("Start array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Final array:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
            System.out.println("After swap " + (i + 1) + ":");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}