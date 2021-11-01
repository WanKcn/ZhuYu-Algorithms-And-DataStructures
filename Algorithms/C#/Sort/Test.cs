//
// @Description:
// @Author: WenRuo
//

using System;
using System.Diagnostics;

namespace Sort
{
    public class Test
    {
        static void Main(string[] args)
        {
            int[] datas = {1000, 10000, 100000};
            foreach (var n in datas)
            {
                Int32[] arr = ArrayGenerator.GenerateRandomArray(n, n);
                Int32[] arr2 = new int[arr.Length];
                Array.Copy(arr, arr2, arr.Length);
                SortingHelper.SortTest("SelectionSort", arr);
                SortingHelper.SortTest("InsertionSort", arr2);
                Console.WriteLine("///");
            }
        }
    }
}