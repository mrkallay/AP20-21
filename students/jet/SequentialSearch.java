public class SequentialSearch
{
    public static void main(String[] args)
    {
        SequentialSearch searcher = new SequentialSearch();

        int[] nums = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int key = 5;

        int foundAt = searcher.indexOfNum(nums, key);
        System.out.println("Correct index: 4");
        System.out.println(key + " found at index " + foundAt);

        key = 10;
        foundAt = searcher.indexOfNum(nums, key);
        System.out.println("Correct index: -1");
        System.out.println(key + " found at index " + foundAt);

        key = 5;
        foundAt = searcher.lastIndexOfNum(nums, key);
        System.out.println("Correct index: 9");
        System.out.println(key + " found at index " + foundAt);

    }

    public int indexOfNum(int[] numbers, int key)
    {
        int foundIndex = -1;

        //TODO 1: implement the sequential search algorithm to search the numbers array for the key
        //      this method should return the index of the key in the numbers array or -1 if it is not found
        for (int i=0; i <numbers.length; i++)
        {
            if (key == numbers[i])
            {
                return i;
            }
        }

        return foundIndex;
    }

    public int lastIndexOfNum(int[] numbers, int key)
    {
        int foundIndex = -1;

        //TODO 2: implement the sequential search algorithm to search the numbers array for the key
        //      this method should return the last index of the key in the numbers array or -1 if it is not found
        for (int i=numbers.length-1; i > 0; i--)
        {
            if (key == numbers[i])
            {
                return i;
            }
        }

        return foundIndex;
    }
}