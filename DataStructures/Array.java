/**
 * 创建一个简单的数组，实现增删改查
 */
public class Array {
    private int[] data;  //只能承载int型数据
    private int size;   //data[]中有多少个有效元素 指向数组中有多少个元素同时也代表数组中第一个没有元素的位置

    // 构造函数，传入数组的容量capacity构造Array
    public Array(int capacity) {
        data = new int[capacity];  // capacity数组希望开辟的容量
        size = 0;  // 计数
    }

    // 无参构造，默认数组容量capacity=10
    public Array() {
        this(10);  // 默认
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 获取数组容量
    public int getCapacity() {
        return data.length; // 容量就是数组长度
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 向整个数组的最后添加一个新的元素
    public void addLast2(int e) {
        // 添加新的元素时候需要查看一下数组是否还有剩余的空间
        // 数组中元素个数size等于数组长度的时候，无法添加新元素
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Arrary is full.");
        }
        data[size] = e;
        size++;
    }

    // 像数组最后添加一个新的元素的另一种写法
    public void addLast(int e) {
        add(size, e);  // size当作插入的位置，size刚好是最后一个元素位置
    }


    // 向整个数组头的位置插入一个新的元素
    public void addFirst(int e) {
        add(0, e); // 直接在第0索引的位置添加一个新的元素

    }

    /**
     * 在数组任意一个位置插入一个新的元素
     *
     * @param index 插入的位置
     * @param e     插入的元素
     */
    public void add(int index, int e) {
        // 插入之前，先看数组是否满存
        if (size == data.length) {
            throw new IllegalArgumentException("Add failed. Arrary is full.");
        }
        // 要保证用户传入的index是合法的，大于0小于size
        // (size是数组中已经有的元素个数，如果index>size，数组中的元素不是紧密排列)
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed. Require index >=0 and index<=size.");
        }

        // 从最后一个元素开始往后挪一个位置，直到挪到index这个位置
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i]; // 后一个索引的位置赋值前一个索引对应元素的值
        }
        data[index] = e;  // index的位置元素已经复制到后一个索引位置，此时将新插入的元素覆盖
        size++;
    }

    // 设计一个get方法来查看元素，取出索引为index的元素
    // 通过get方式用户永远无法查询未使用的空间
    public int getData(int index) {
        // 可以对用户传进来的index进行判断
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed.Index is illegal.");
        }
        return data[index];
//        return data[index - 1];  // 查询数组中的第index个元素时需要-1
    }

    // 进行数组元素的更新 修改索引为index位置原素为e
    public void setData(int index, int e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed.Index is illegal.");
        }
        data[index] = e;
    }

    // 查找数组中是否包含某个元素e
    public boolean contains(int e) {
        // 只需要遍历从0-size的元素,即当前数组中的所有元素
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return true;
            }
        }
        // 循环结束之后还没找到元素e的话,返回false
        return false;
    }

    /**
     * 找到这个元素返回索引值，找不到的时候返回一个特殊的索引，-1
     *
     * @param e 要查找的元素e
     * @return 元素索引
     */
    public int find(int e) {
        // 逻辑与查找元素完全一样，只不过在找到的时候返回索引值
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                return i;
            }
        }
        // 循环结束之后还没找到元素e的话,返回非法索引-1
        return -1;
    }

    /**
     * 删除元素，设置为int，删除元素后，把删除的元素返回留给用户备用
     *
     * @param index 需要删除元素的索引
     * @return 将删除的元素返回给用户
     */
    public int remove(int index) {
        // 首先要判断index的合法性
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        // 用ret接收要删除的元素备用
        int ret = data[index];
        // 备用后在进行删除的逻辑
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        // 维护size
        size--;
        return ret;
    }

    // 从数组中删除掉第一个元素，返回删除的元素
    public int removeFirst() {
        return remove(0);
    }

    // 从数组中删除掉最后一个元素，返回删除的元素
    public int removeLast() {
        // size-1是最后一个元素的位置
        return remove(size - 1);
    }

    // 删除数组中的指定元素，只删除一个，因为在删除钱就已经知道需要删除的元素，不需要返回值
    public void removeElement(int e) {
        // 首先调用find返回索引看一下元素是否存在，存在则删除
        // 存在的时候index不等于-1
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    /**
     * 覆盖父类，打印数组信息
     *
     * @return 数组信息
     */
    @Override
    public String toString() {
        // 拼接一个字符串
        StringBuilder result = new StringBuilder();
        // 显示数组的信息，size有多少个元素，以及定义的容量大小capacity
        result.append(String.format("Array:size = %d ,capacity = %d\n", size, data.length));
        result.append('[');
        // i只能遍历到size，因为数组中只有size个元素
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            // 判断一下i是否是最后一个元素，不是就用"，"隔开
            if (i != size - 1) {
                result.append(", ");
            }
        }
        result.append(']');
        return result.toString();
    }
}
