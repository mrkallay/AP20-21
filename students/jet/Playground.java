public class Playground
{
    public static void main(String[] args)
    {
        int[][] arr = {{11, 13, 14 ,15},

                {12, 18, 17, 26},

                {13, 21, 26, 29},

                {14, 17, 22, 28}};

        for (int j = 0; j < arr.length; j++)

        {

            for (int k = 0; k < arr[0].length; k++)

            {

                if (arr[j][k] == 14)

                {

                    System.out.print(j + k + arr[j][k] + " ");

                }

            }

        }
    }
}
