//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homeworks.Homework_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.print("Input n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int triangNumber = calcTriangleNumber(n);
        long calcFactorial = calcFactorial(n);

        System.out.println("Triangle n = " + triangNumber);
        System.out.println("Factorial n = " + calcFactorial);
    }

    public static int calcTriangleNumber(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static long calcFactorial(int n){
        long factorial = 0;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
}
