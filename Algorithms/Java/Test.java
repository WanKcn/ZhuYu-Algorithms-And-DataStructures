import java.util.List;

/**
 * @description:
 * @author: WenRuo
 * @date: 2021/10/20 20:01
 */

public class Test {

    public static void main(String[] args) {
        int[] data = {1000, 10000, 100000};

//        for (int n : data) {
//            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
//            SortingHelper.sortTest("InsertionSort", arr);
//        }

        Integer[] arr = {1, 4, 3, 5, 8, 0, 2, 2, 5, 8, 6};
        InsertionSort.sort2(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }

}
