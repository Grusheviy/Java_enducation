import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new GenerateRandomNumbers().generate(10, 1, 50);

        List<Integer> oddNumbers = new DeleteEvenNumbers().remove(numbers);

        int min = new FindMinimum().find(oddNumbers);

        int max = new FindMaximum().find(oddNumbers);

        double average = new FindAverage().find(oddNumbers);

        System.out.println("Initial list: " + numbers);
        System.out.println("List of after removing even numbers: " + oddNumbers);
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
        System.out.println("Avrg value: " + average);
    }
}

class GenerateRandomNumbers {
    public List<Integer> generate(int size, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(max - min + 1) + min;
            numbers.add(num);
        }
        return numbers;
    }
}

class DeleteEvenNumbers {
    public List<Integer> remove(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }
}

class FindMinimum {
    public int find(List<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

class FindMaximum {
    public int find(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

class FindAverage {
    public double find(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }
}