//Реализовать простой калькулятор
package Task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите оператор: ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.printf("Сумма чисел: %s", a+b);
                break;
            case "-":
                System.out.printf("Разность чисел: %s", a-b);
                break;
            case "/":
                System.out.printf("Частное чисел: %s", (double)a/b);
                break;
            case "*":
                System.out.printf("Произведение чисел: %s", a*b);
                break;
            default:
                System.out.println("Данный оператор не поддерживается, обратитесь к разработчику)))");
                break;
        }
    }


}
