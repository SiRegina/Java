//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package Task2;


import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[] {2, 4, 7, 5, 3, 1, 11};
        int temp;
        Logger logger = Logger.getLogger(Task2.class.getName());
        logger.setLevel(Level.INFO);
        try {
            FileHandler fh = new FileHandler("Log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter ();
            fh.setFormatter(sFormat);
        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }
        boolean isSorted = false;
        logger.info(Arrays.toString(array));
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }
            logger.info(Arrays.toString(array));
        }
    }
}
