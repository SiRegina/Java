package Task1;//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Введите натуральное число");
        } else {
            sum(number);
            System.out.printf("произведение чисел от 1 до %s - %s", number, factorial(number));
        }
    }

    public static void sum(int number) {
        int sum;
        sum = number * (number + 1) / 2;
        System.out.printf("Cумма чисел от 1 до %s = %s\n", number, sum);
    }

    public static double factorial(int number) {
        if (number == 1) return 1;
        return number * factorial(number - 1);
    }
}
