import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Составить алгоритм: на входе есть числовой массив,
        необходимо вывести элементы массива кратные 3
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность чисел через пробел: ");
        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        for (int num : numbers) {
            if (num % 3 == 0)
                System.out.print(num + " ");
        }
    }
}
