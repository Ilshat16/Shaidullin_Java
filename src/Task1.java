import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Составить алгоритм: если введенное число больше 7, то вывести “Привет”

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7)
            System.out.println("Привет");
    }
}