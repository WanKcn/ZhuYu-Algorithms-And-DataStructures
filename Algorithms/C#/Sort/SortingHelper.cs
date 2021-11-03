//
// @Description:
// @Author: WenRuo
//


using System;

namespace Sort
{
    public class SortingHelper
    {
        private SortingHelper()
        {
        }

        /// <summary>
        /// 判断一个数组是否是升序的
        /// </summary>
        /// <param name="arr"></param>
        /// <typeparam name="T"></typeparam>
        /// <returns></returns>
        public static bool IsSorted<T>(T[] arr) where T : IComparable
        {
            for (int i = 1; i < arr.Length; i++)
            {
                if (arr[i - 1].CompareTo(arr[i]) > 0)
                    return false;
            }

            return true;
        }

        /// <summary>
        /// 算法性能测试
        /// </summary>
        /// <param name="sortName">排序名称</param>
        /// <param name="arr">需要排序的数组</param>
        /// <typeparam name="T"></typeparam>
        /// <exception cref="Exception"></exception>
        public static void SortTest<T>(string sortName, T[] arr) where T : IComparable
        {
            long startTime = DateTime.Now.Ticks;

            if (sortName.Equals("SelectionSort"))
                SelectionSort.Sort(arr);
            else if (sortName.Equals("InsertionSort"))
                InsertionSort.Sort(arr);

            long endTime = DateTime.Now.Ticks;
            // 计算消耗性能的时间
            double time = (endTime - startTime) / 10000000.0;

            // 验证数组是否升序
            if (!IsSorted(arr))
                throw new Exception(sortName + " Failed!");

            Console.WriteLine($"{sortName}, n = {arr.Length} : {time} s");
        }
    }
}