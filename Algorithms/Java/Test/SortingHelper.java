/**
 * @description: 排序辅助方法类
 * @author: WenRuo
 * @date: 2021/10/23 23:22
 */

public class SortingHelper {

    private SortingHelper() {
    }

    /**
     * 判断一个数组是否有序
     *
     * @return
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        }
        return true;
    }

    /**
     * 算法性能测试
     * @param sortName
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
        long startTime = System.nanoTime();
        if (sortName.equals("SelectionSort"))
            SelectionSort.sortASC(arr);

        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortingHelper.isSorted(arr))
            throw new RuntimeException(sortName + " failed!");
        System.out.println(String.format("%s, n = %d : %f s", sortName, arr.length, time));

    }

}
