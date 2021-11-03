//
// @Description:
// @Author: WenRuo
//


using System;

namespace Sort
{
    public class ArrayGenerator
    {
        private ArrayGenerator()
        {
        }

        /// <summary>
        /// 生成一个有序数组
        /// </summary>
        /// <param name="n"></param>
        /// <returns></returns>
        public static Int32[] GenerateOrderedArray(int n)
        {
            Int32[] arr = new Int32[n];
            for (int i = 0; i < n; i++)
                arr[i] = i;
            return arr;
        }

        /// <summary>
        /// 生成一个随机数组
        /// </summary>
        /// <param name="n"></param>
        /// <param name="bound"></param>
        /// <returns></returns>
        public static Int32[] GenerateRandomArray(int n, int bound)
        {
            Int32[] arr = new Int32[n];
            Random rnd = new Random();
            for (int i = 0; i < n; i++)
                arr[i] = rnd.Next(bound);
            return arr;
        }
    }
}