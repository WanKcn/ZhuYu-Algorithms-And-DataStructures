//
// @Description:
// @Author: WenRuo
//


using System;

namespace Sort
{
    public class InsertionSort
    {
        private InsertionSort()
        {
        }

        /// <summary>
        /// 升序未优化
        /// </summary>
        /// <param name="arr"></param>
        /// <typeparam name="T"></typeparam>
        public static void Sort1<T>(T[] arr) where T : IComparable
        {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = i; j - 1 >= 0 && arr[j].CompareTo((arr[j - 1])) < 0; j--)
                    Swap(arr, j, j - 1);
            }
        }

        /// <summary>
        /// 降序
        /// </summary>
        /// <returns></returns>
        public static void Sort2<T>(T[] arr) where T : IComparable
        {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = i; j - 1 >= 0 && arr[j].CompareTo(arr[j - 1]) > 0; j--)
                    Swap(arr, j, j - 1);
            }
        }

        /// <summary>
        /// 升序优化
        /// </summary>
        /// <param name="arr"></param>
        /// <typeparam name="T"></typeparam>
        public static void Sort<T>(T[] arr) where T : IComparable
        {
            for (int i = 0; i < arr.Length; i++)
            {
                T tmp = arr[i];
                int j;
                for (j = i; j - 1 >= 0 && tmp.CompareTo(arr[j - 1]) < 0; j--)
                    arr[j] = arr[j - 1];
                arr[j] = tmp;
            }
        }


        private static void Swap<T>(T[] arr, int i, int j)
        {
            T tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}