//Реализовать алгоритм сортировки слиянием
package Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {12, 6, 4, 1, 15, 10};
        int[] array2 = {14, 16, 13, 11, 5, 20};
        int[] result = new int[array1.length+array2.length];
        int i=0, j=0;
        sortUnsorted(array1,0, array1.length-1);
        sortUnsorted(array2,0, array2.length-1);
        for (int k=0; k<result.length; k++) {

            if (i > array1.length-1) {
                int a = array2[j];
                result[k] = a;
                j++;
            }
            else if (j > array2.length-1) {
                int a = array1[i];
                result[k] = a;
                i++;
            }
            else if (array1[i] < array2[j]) {
                int a = array1[i];
                result[k] = a;
                i++;
            }
            else {
                int b = array2[j];
                result[k] = b;
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    private static void sortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sortUnsorted(a, lo, mid);
        sortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}
