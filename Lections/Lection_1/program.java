package Lections.Lection_1;

// /**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         // Явная типизация
//         System.out.println("bye world");
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); //10
//         System.out.println(salary); //123456
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e); // 2.7
//         System.out.println(pi); // 3.1415
//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); // true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); // false
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3); // false
//         String msg ="Hello world";
//         System.out.println(msg); // Hello world
    
//         // Неявная типизация

//         var a = 123;
//         System.out.println(a); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//         System.out.println(getType(a)); // Integer
//         System.out.println(getType(d)); // Double
//         d = 1022;
//         System.out.println(d); // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double

        
//     }

// static String getType(Object o){
//     return o.getClass().getSimpleName();
//     }
// }
// // class Program
// // {
// //  public static void main(String[] args) {
// //     System.out.println(Integer.MAX_VALUE); // 2147483647
// //     System.out.println(Integer.MIN_VALUE); // -2147483648


// // Массивы одномерные
//     // int[] arr = new int[10];
//     // System.out.println(arr.length); // 10
//     // arr = new int[] { 1, 2, 3, 4, 5 };
//     // System.out.println(arr.length); // 5
// //  }
// // }
// //  Массивы многомерные 

// public class Program {
//     public static void main(String[] args) {
//     int[][] arr = new int[3][5];
   
//     for (int i = 0; i < arr.length; i++) {
//     for (int j = 0; j < arr[i].length; j++) {
//     System.out.printf("%d ", arr[i][j]);
//     }
//     System.out.println();
//     }
//     }
//    }

// Получение данных из терминала
// Строки

// import java.util.Scanner;
// public class Scane {
//     public static void main(String[] args) {
//     Scanner iScanner = new Scanner(System.in);
//     System.out.printf("name: ");
//     String name = iScanner.nextLine();
//     System.out.printf("Привет, %s!", name);
//     iScanner.close();
//  }
// }

// Получение данных из терминала
// Некоторые примитивы

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  int x = iScanner.nextInt();
//  System.out.printf("double a: ");
//  double y = iScanner.nextDouble();
//  System.out.printf("%d + %f = %f", x, y, x + y);
//  iScanner.close();
// }}

// Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class Program {
//  public static void main(String[] args) {
//  Scanner iScanner = new Scanner(System.in);
//  System.out.printf("int a: ");
//  boolean flag = iScanner.hasNextInt();
//  System.out.println(flag);
//  int i = iScanner.nextInt();
//  System.out.println(i);
//  iScanner.close();
//  } }

// Форматированный вывод

// public class Program {
//  public static void main(String[] args) {
//  int a = 1, b = 2;
//  int c = a + b;
//  String res = a + " + " + b + " = " + c;
//  System.out.println(res);
//  }
// }

// Форматированный вывод

// public class Program {
//     public static void main(String[] args) {
//     int a = 1, b = 2;
//     int c = a + b;
//     String res = String.format("%d + %d = %d \n", a, b, c);
//     System.out.printf("%d + %d = %d \n", a, b, c);
//     System.out.println(res);
//     }
//    }
   