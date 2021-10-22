import java.util.Random;

/**
 * @description:
 * @author: WenRuo
 * @date: 2021/10/22 11:25
 */

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    /**
     * 生成一个有序数组
     *
     * @param n 传入生成数组大小
     * @return 一个有序数组
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        return arr;
    }

    /**
     * 生成一个随机数组
     *
     * @param n     数组的大小
     * @param bound 数组最大边界
     * @return 一个随机数组
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++)
            arr[i] = rnd.nextInt(bound);
        return arr;
    }

}
