import java.util.Arrays;

/**
 * @description:
 * @author: WenRuo
 * @date: 2021/10/20 20:01
 */

public class Test {

    public static void main(String[] args) {
        int[] data = {1000, 10000, 100000};

        for (int n : data) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
//            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSort", arr);
            SortingHelper.sortTest("InsertionSort2", arr2);
            System.out.println();

        }
    }

}
