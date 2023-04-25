//Пусть дан произвольный список целых чисел, удалить из него чётные числа
package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1, 100));
        }
        System.out.println(list);
        delete(list);
        System.out.println(list);
    }

    public static void delete(ArrayList<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next % 2 == 0) {
                it.remove();
            }
        }
    }

}


