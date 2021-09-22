namespace Algorithm
{
    public class LinearSearch
    {
        private LinearSearch(){ }

        public static int Search(int[] data, int target)
        {
            for (int i = 0; i < data.Length; i++)
                if (data[i] == target)
                    return i;
            return -1;
        }
    }
}