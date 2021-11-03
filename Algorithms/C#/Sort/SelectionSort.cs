//
// @Description:
// @Author: WenRuo
//


using System;

namespace Sort
{
    public class SelectionSort
    {
        private SelectionSort()
        {
        }

        /// <summary>
        /// 升序
        /// </summary>
        /// <param name="arr"></param>
        /// <typeparam name="T"></typeparam>
        public static void Sort<T>(T[] arr) where T : IComparable
        {
            for (int i = 0; i < arr.Length; i++)
            {
                int minIndex = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if (arr[j].CompareTo(arr[minIndex]) < 0)
                        minIndex = j;
                }

                Swap(arr, i, minIndex);
            }
        }

        /// <summary>
        /// 降序
        /// </summary>
        /// <param name="arr"></param>
        /// <typeparam name="T"></typeparam>
        public static void Sort2<T>(T[] arr) where T : IComparable
        {
            for (int i = 0; i < arr.Length; i++)
            {
                int minIndex = i;
                for (int j = i; j < arr.Length; j++)
                {
                    if (arr[j].CompareTo(arr[minIndex]) > 0)
                        minIndex = j;
                }

                Swap(arr, i, minIndex);
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