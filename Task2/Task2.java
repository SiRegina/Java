//Вывести все простые числа от 1 до 1000
package Task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("простые числа от 1 до 1000:\n1\n2\n3");
        for (int i = 5; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
