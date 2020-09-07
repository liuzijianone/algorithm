package algorithm.CodingInterviews.Test40;

import java.util.Arrays;
import java.util.Queue;
import java.util.TreeSet;

/**
 * @author liuzijian
 * @version 1.0
 * @since 2020/9/4 21:09
 */
public class Test40 {
    public static void main(String[] args) {

    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] array = new int[k];
        Arrays.sort(arr);

        for (int i = 0; i < array.length; i++){
            array[i] = arr[i];
        }
        return array;

    }
}
