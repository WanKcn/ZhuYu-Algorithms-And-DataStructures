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

}
