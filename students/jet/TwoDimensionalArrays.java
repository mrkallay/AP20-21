/**
 * Created by briankallay on 1/9/19.
 */
public class TwoDimensionalArrays
{
    public static void main(String[] args)
    {


        //1) create a 2-D array of strings that has 2 rows and 2 columns and initialize each value

        String[][] stringArray = { {"A", "B"},
                                   {"D", "F"} };

        //2) use nested for loops to iterate over the 2-D string array and print each value

        for(int row = 0; row < stringArray.length; row++)
        {
            String[] currentRow = stringArray[row];
            for(int col= 0; col < stringArray.length; col++)
            {
                System.out.println(stringArray[row][col]); ;//stringArray[row][col]

            }
        }

        //3) create a 2-D array of ints that has 3 rows and 3 columns but leave the values uninitialized

        int[][] intArr= new int[3][3];

        //4) use nested for loops to iterate over the indexes of the 2-D int array
        //   and populate each integer with a value starting from 1.
        //   the resulting table should look like this:
        //
        //             Col 1     Col 2     Col 3
        //     Row1       1         2         3
        //     Row2       4         5         6
        //     Row3       7         8         9

        int theValue = 1;
        for(int row = 0; row < intArr.length; row++)
        {
            for(int col = 0; col < intArr[row].length; col++)
            {
                intArr[row][col] = theValue;
                theValue++;
            }
        }
        System.out.println();

        //5) use nested for loops to iterate over the 2-D int array in reverse, so starting from Row 3, Col 3.
        for (int[] row : intArr)
        {
            for (int x : row)
            {
                System.out.println(x);
            }
        }

    }
}