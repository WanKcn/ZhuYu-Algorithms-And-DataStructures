# ZhuYu

**Author : WenRuo｜Study Notes For Liuyubobobo.**

**有草焉，其状如韭而青华，其名曰祝余，食之不饥。**


[toc]

## 1. 什么是算法？

Algorithm的本意：解决问题的方法。

一系列解决问题的，清晰的，可执行的计算机指令。

生活中如求解一元二次方程？问去往东方明珠的路怎么走？如何做出一道佳肴？

**算法五大特性：**

1.   有限性，在有限的时间里可以执行完（看似不可行的算法也可能有研究意义）
2.   确定性，描述算法的每一个指令都应该是清晰的（得到最高的成绩）
3.   可行性，算法中每一步应该是可行的（拿出最大的质数）
4.   输入（存在操作对象）
5.   输出（有结果，并非函数有没有返回值）



## 2. 线性查找法

**一个一个去寻找自己想要的目标元素**

输入：数组，目标元素

输出：目标索引所在的索引，不存在返回-1

```java
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
```

