public class LinearSearch {

    // 外界不可外部new 构造私有
    private LinearSearch() {}

    // 线性查找法
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) // 类对象判读值相等
                return i;
        }
        return -1;
    }

}
