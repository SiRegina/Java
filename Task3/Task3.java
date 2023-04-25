//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 100));
        }
        System.out.println(list);
        System.out.println("max: "+Collections.max(list));
        System.out.println("min: "+Collections.min(list));
        Integer sum = 0;
        for (Integer a:list
             ) {
            sum += a;
        }
        System.out.println("Среднее: "+(double) sum/ list.size());
    }

}
